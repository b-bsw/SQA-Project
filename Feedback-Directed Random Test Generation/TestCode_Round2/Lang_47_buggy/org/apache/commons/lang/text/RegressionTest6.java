package org.apache.commons.lang.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        char[] charArray4 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray4);
        boolean boolean6 = strTokenizer5.hasNext();
        boolean boolean7 = strTokenizer5.isEmptyTokenAsNull();
        boolean boolean8 = strTokenizer5.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer5.setDelimiterMatcher(strMatcher9);
        boolean boolean11 = strBuilder2.equals((java.lang.Object) strTokenizer5);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader12 = strBuilder2.new StrBuilderReader();
        strBuilderReader12.mark((int) (short) 0);
        strBuilderReader12.close();
        strBuilderReader12.close();
        java.nio.CharBuffer charBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strBuilderReader12.read(charBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.append((double) (byte) 10);
        java.lang.String str9 = strBuilder2.substring(0, (int) (byte) 0);
        int int12 = strBuilder2.indexOf("\n", (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding(0, '4');
        int int19 = strBuilder16.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.insert((int) (byte) 0, "");
        boolean boolean24 = strBuilder22.startsWith("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.appendln(false);
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        boolean boolean30 = strTokenizer29.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int37 = strBuilder34.indexOf(strMatcher35, (int) (byte) 10);
        char[] charArray39 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray39);
        boolean boolean41 = strTokenizer40.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder34.appendFixedWidthPadRight((java.lang.Object) strMatcher42, (-1), '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer29.setTrimmerMatcher(strMatcher42);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteAll(' ');
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder50.appendWithSeparators(objArray56, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher59 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceAll(strMatcher59, "hi!");
        char[] charArray63 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray63);
        boolean boolean65 = strTokenizer64.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer64.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder58.replaceAll(strMatcher66, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer29.setQuoteMatcher(strMatcher66);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder22.replaceFirst(strMatcher66, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder2.deleteAll(strMatcher66);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.appendln('0');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder72.appendln(3L);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder76.appendSeparator('4', (int) '#');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("");
        char[] charArray6 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer2.reset(charArray6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray11 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray11);
        boolean boolean13 = strTokenizer12.hasNext();
        boolean boolean14 = strTokenizer12.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer12.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder9.replaceAll(strMatcher15, "1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer2.setTrimmerMatcher(strMatcher15);
        java.lang.String str19 = strTokenizer2.previousToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer2.reset();
        char[] charArray22 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray22);
        char[] charArray26 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer24.reset(charArray26);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteAll(' ');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder32.appendWithSeparators(objArray38, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceAll(strMatcher41, "hi!");
        char[] charArray45 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray45);
        boolean boolean47 = strTokenizer46.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer46.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder40.replaceAll(strMatcher48, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer24.setQuoteMatcher(strMatcher48);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer24.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer20.setIgnoredMatcher(strMatcher52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer20.reset("StrTokenizer[not tokenized yet]");
        java.lang.String str56 = strTokenizer55.nextToken();
        boolean boolean57 = strTokenizer55.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer55.getQuoteMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer55.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str56, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strMatcher58);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteAll(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.appendWithSeparators(objArray9, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll(strMatcher12, "hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer15 = strBuilder11.new StrBuilderTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder11.replace(19, 64, "1.0\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\00010");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.setNewLineText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.appendWithSeparators((java.util.Iterator) strTokenizer8, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendNewLine();
        int int16 = strBuilder15.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter17 = strBuilder15.new StrBuilderWriter();
        char[] charArray19 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray19);
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer21.reset(charArray23);
        strBuilderWriter17.write(charArray23);
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer29.reset("");
        char[] charArray33 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer29.reset(charArray33);
        strBuilderWriter17.write(charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder10.insert((int) (byte) 0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer42 = strBuilder38.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strBuilderTokenizer42.setQuoteChar('4');
        java.util.List list45 = strBuilderTokenizer42.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder37.appendWithSeparators((java.util.Collection) list45, "i#");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder37.replaceFirst('a', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder37.append((int) 'e');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        java.lang.String str4 = strBuilder2.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder2.insert(0, (java.lang.Object) strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((double) '4');
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.append(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder9.appendln((java.lang.Object) charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.appendSeparator("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.insert(17, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.0" + "'", str4, "1.0");
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int11 = strBuilder8.indexOf(strMatcher9, (int) (byte) 10);
        char[] charArray13 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.appendln(charArray13);
        strBuilder2.buffer = charArray13;
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray13);
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getTrimmerMatcher();
        char[] charArray20 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray20);
        boolean boolean22 = strTokenizer21.hasNext();
        boolean boolean23 = strTokenizer21.isEmptyTokenAsNull();
        boolean boolean24 = strTokenizer21.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer21.setDelimiterMatcher(strMatcher25);
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        boolean boolean30 = strTokenizer29.hasNext();
        boolean boolean31 = strTokenizer29.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer29.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer29.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer34.setIgnoreEmptyTokens(true);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding(0, '4');
        char[] charArray41 = strBuilder40.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer34.reset(charArray41);
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer34.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer26.setQuoteMatcher(strMatcher43);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer17.setIgnoredMatcher(strMatcher43);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer45);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder0.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strBuilderTokenizer4.setEmptyTokenAsNull(true);
        int int7 = strBuilderTokenizer4.nextIndex();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strBuilderTokenizer4.getDelimiterMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strBuilderTokenizer4.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.appendSeparator("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.append("hi!", (int) (short) 1, (int) (short) 0);
        char[] charArray29 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendWithSeparators((java.util.Collection) list31, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder15.appendAll((java.util.Collection) list31);
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder15.appendln(obj35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.appendFixedWidthPadRight((java.lang.Object) strBuilder15, 10, 'a');
        java.lang.String str40 = strBuilder39.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder39.appendln("StrTokenizer[]", 1, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder39.replaceAll("#", "nizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteAll(' ');
        java.lang.Object[] objArray57 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder51.appendWithSeparators(objArray57, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.replaceAll(strMatcher60, "hi!");
        char[] charArray64 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray64);
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer65.reset("");
        char[] charArray69 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray69);
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer65.reset(charArray69);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray74 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray74);
        boolean boolean76 = strTokenizer75.hasNext();
        boolean boolean77 = strTokenizer75.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher78 = strTokenizer75.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder72.replaceAll(strMatcher78, "1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strTokenizer65.setTrimmerMatcher(strMatcher78);
        boolean boolean82 = strBuilder62.contains(strMatcher78);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder39.deleteAll(strMatcher78);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder83.insert(11, false);
        java.lang.String str87 = strBuilder86.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder3.appendNull();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(stringBuffer5, 1, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadRight((int) (short) 10, 6, '[');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendSeparator('r', 1);
        java.lang.String str18 = strBuilder15.midString(65, 8);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        java.lang.String str4 = strBuilder2.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder2.insert(0, (java.lang.Object) strBuilder9);
        java.util.Iterator iterator13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendWithSeparators(iterator13, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.appendFixedWidthPadLeft(4, 4, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append(12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("    ");
        boolean boolean24 = strTokenizer23.isEmptyTokenAsNull();
        java.lang.String str25 = strTokenizer23.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer23.getIgnoredMatcher();
        boolean boolean27 = strBuilder21.contains(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.0" + "'", str4, "1.0");
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.appendSeparator("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.appendFixedWidthPadRight(10, 5, ' ');
        int int21 = strBuilder18.indexOf("\nStrTokenizer[]0\naaaaaaaa", 12);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.appendln(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding(0, '4');
        int int29 = strBuilder26.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.insert((int) (byte) 0, "");
        boolean boolean34 = strBuilder32.startsWith("1.0");
        int int36 = strBuilder32.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.append(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.appendSeparator("1.0", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendln((float) 'a');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        boolean boolean3 = strTokenizer2.hasNext();
        boolean boolean4 = strTokenizer2.isEmptyTokenAsNull();
        boolean boolean5 = strTokenizer2.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer2.setDelimiterMatcher(strMatcher6);
        java.lang.String str8 = strTokenizer7.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer7.getQuoteMatcher();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.setNewLineText("");
        boolean boolean7 = strBuilder6.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.deleteFirst("\n0.0hi!\n");
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteAll(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.appendWithSeparators(objArray9, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll(strMatcher12, "hi!");
        char[] charArray16 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        boolean boolean18 = strTokenizer17.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer17.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder11.replaceAll(strMatcher19, "hi!");
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer24.reset("");
        java.lang.String[] strArray27 = strTokenizer24.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder11.appendWithSeparators((java.lang.Object[]) strArray27, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.delete(39, (int) 'e');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("");
        char[] charArray6 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer2.reset(charArray6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray11 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray11);
        boolean boolean13 = strTokenizer12.hasNext();
        boolean boolean14 = strTokenizer12.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer12.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder9.replaceAll(strMatcher15, "1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer2.setTrimmerMatcher(strMatcher15);
        java.lang.String str19 = strTokenizer2.previousToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer2.reset();
        boolean boolean21 = strTokenizer2.hasPrevious();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer2.setQuoteChar('\000');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strTokenizer23);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        int int6 = strBuilder3.indexOf(strMatcher4, (int) (byte) 10);
        char[] charArray8 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendln(charArray8);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray13 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray13);
        boolean boolean15 = strTokenizer14.hasNext();
        boolean boolean16 = strTokenizer14.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer14.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder11.replaceAll(strMatcher17, "1.0");
        char[] charArray21 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray21);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder11.appendln(charArray21);
        char[] charArray26 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray26);
        boolean boolean28 = strTokenizer27.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer27.getIgnoredMatcher();
        int int31 = strBuilder11.indexOf(strMatcher29, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder10.deleteFirst(strMatcher29);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder10.append('0');
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strBuilder34.asTokenizer();
        boolean boolean36 = strTokenizer35.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer35.getDelimiterMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer35.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strMatcher38);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        char[] charArray8 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray8);
        boolean boolean10 = strTokenizer9.hasNext();
        boolean boolean11 = strTokenizer9.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer9, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.appendln(0);
        boolean boolean17 = strBuilder3.startsWith("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.appendln(" hhhh", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.appendln(strBuilder21);
        char[] charArray24 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray24);
        boolean boolean26 = strTokenizer25.hasNext();
        boolean boolean27 = strTokenizer25.isEmptyTokenAsNull();
        boolean boolean28 = strTokenizer25.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        int int35 = strBuilder32.indexOf(strMatcher33, (int) (byte) 10);
        char[] charArray37 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.appendln(charArray37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray42 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray42);
        boolean boolean44 = strTokenizer43.hasNext();
        boolean boolean45 = strTokenizer43.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer43.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.replaceAll(strMatcher46, "1.0");
        char[] charArray50 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder40.appendln(charArray50);
        char[] charArray55 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray55);
        boolean boolean57 = strTokenizer56.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer56.getIgnoredMatcher();
        int int60 = strBuilder40.indexOf(strMatcher58, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder39.deleteFirst(strMatcher58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer25.setQuoteMatcher(strMatcher58);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder22.deleteAll(strMatcher58);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder22.append((double) 100.0f);
        java.lang.String str67 = strBuilder65.substring((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer72 = strBuilder68.new StrBuilderTokenizer();
        java.lang.Object obj73 = strBuilderTokenizer72.clone();
        char[] charArray75 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray75);
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = strTokenizer76.reset("");
        boolean boolean79 = strTokenizer76.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrMatcher strMatcher80 = strTokenizer76.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strBuilderTokenizer72.setTrimmerMatcher(strMatcher80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = strTokenizer81.setDelimiterChar('h');
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = strTokenizer81.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer84.reset("a52.0#");
        org.apache.commons.lang.text.StrMatcher strMatcher87 = strTokenizer86.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder65.appendAll((java.util.Iterator) strTokenizer86);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "a\n100.0" + "'", str67, "a\n100.0");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strBuilder88);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        int int4 = strBuilder3.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter5 = strBuilder3.new StrBuilderWriter();
        strBuilderWriter5.write(10);
        strBuilderWriter5.write("\n", 1, 0);
        strBuilderWriter5.write("StrTokenizer[#]");
        strBuilderWriter5.flush();
        java.io.Writer writer16 = strBuilderWriter5.append('h');
        char[] charArray18 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray18);
        boolean boolean20 = strTokenizer19.hasNext();
        boolean boolean21 = strTokenizer19.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer19.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer19.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer24.setIgnoreEmptyTokens(true);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding(0, '4');
        char[] charArray31 = strBuilder30.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer24.reset(charArray31);
        strBuilderWriter5.write(charArray31);
        strBuilderWriter5.close();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(strTokenizer32);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray2 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray2);
        boolean boolean4 = strTokenizer3.hasNext();
        boolean boolean5 = strTokenizer3.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer3.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.replaceAll(strMatcher6, "1.0");
        char[] charArray10 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder0.appendln(charArray10);
        char[] charArray15 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        boolean boolean17 = strTokenizer16.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer16.getIgnoredMatcher();
        int int20 = strBuilder0.indexOf(strMatcher18, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder0.appendln(true);
        boolean boolean24 = strBuilder22.startsWith("\nhi!\n");
        java.lang.String str25 = strBuilder22.getNullText();
        int int26 = strBuilder22.capacity();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        char[] charArray8 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray8);
        boolean boolean10 = strTokenizer9.hasNext();
        boolean boolean11 = strTokenizer9.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer9, "hi!");
        boolean boolean15 = strBuilder13.equals((java.lang.Object) 100.0d);
        int int16 = strBuilder13.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int23 = strBuilder20.indexOf(strMatcher21, (int) (byte) 10);
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendln(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder13.append((java.lang.Object) charArray25);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer30 = strBuilder29.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer35 = strBuilder31.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strBuilderTokenizer35.setQuoteChar('4');
        int int38 = strBuilderTokenizer35.nextIndex();
        java.lang.String str39 = strBuilderTokenizer35.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strBuilderTokenizer35.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder29.replaceFirst(strMatcher40, "StrTokenizer[not");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str39, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.appendSeparator("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.append("hi!", (int) (short) 1, (int) (short) 0);
        char[] charArray29 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendWithSeparators((java.util.Collection) list31, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder15.appendAll((java.util.Collection) list31);
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder15.appendln(obj35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.appendFixedWidthPadRight((java.lang.Object) strBuilder15, 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher49 = null;
        int int50 = strBuilder48.indexOf(strMatcher49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.append((double) (byte) 10);
        java.lang.String str55 = strBuilder48.substring(0, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder40.appendln((java.lang.Object) strBuilder48);
        boolean boolean57 = strBuilder12.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder12.deleteAll("\n#\n");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder12.appendSeparator('a');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder12.appendFixedWidthPadRight(9, 11, 'a');
        java.io.Reader reader66 = strBuilder65.asReader();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader67 = strBuilder65.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher72 = null;
        int int74 = strBuilder71.indexOf(strMatcher72, (int) (byte) 10);
        char[] charArray76 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray76);
        boolean boolean78 = strTokenizer77.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher79 = strTokenizer77.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder71.appendFixedWidthPadRight((java.lang.Object) strMatcher79, (-1), '4');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder71.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder71.appendln(0.0d);
        java.lang.String str87 = strBuilder71.leftString(14);
        char[] charArray88 = strBuilder71.toCharArray();
        int int89 = strBuilderReader67.read(charArray88);
        long long91 = strBuilderReader67.skip((long) (byte) 0);
        java.nio.CharBuffer charBuffer92 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int93 = strBuilderReader67.read(charBuffer92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(reader66);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "0.0\n" + "'", str87, "0.0\n");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] { 'a', '1', '.', '0' });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 4 + "'", int89 == 4);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("aa\n");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replace(strMatcher10, "", 0, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder9.appendln(36);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.appendln(stringBuffer19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.append(true);
        strBuilder20.size = (byte) 0;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder20.appendln(true);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder17.append(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.appendFixedWidthPadLeft(52, 12, ' ');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("");
        char[] charArray6 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer2.reset(charArray6);
        int int9 = strTokenizer2.nextIndex();
        boolean boolean10 = strTokenizer2.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        boolean boolean11 = strBuilder9.startsWith("1.0");
        int int13 = strBuilder9.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding(8, 'r');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder0.new StrBuilderTokenizer();
        java.lang.Object obj5 = strBuilderTokenizer4.clone();
        char[] charArray7 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer8.reset("");
        boolean boolean11 = strTokenizer8.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strBuilderTokenizer4.setTrimmerMatcher(strMatcher12);
        int int14 = strBuilderTokenizer4.previousIndex();
        java.lang.String str15 = strBuilderTokenizer4.getContent();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strBuilderTokenizer4.setQuoteChar('r');
        boolean boolean18 = strBuilderTokenizer4.hasPrevious();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer7 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strBuilderTokenizer7.setEmptyTokenAsNull(true);
        int int10 = strBuilderTokenizer7.nextIndex();
        char[] charArray12 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        char[] charArray16 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer14.reset(charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteAll(' ');
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder22.appendWithSeparators(objArray28, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll(strMatcher31, "hi!");
        char[] charArray35 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray35);
        boolean boolean37 = strTokenizer36.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer36.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.replaceAll(strMatcher38, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer14.setQuoteMatcher(strMatcher38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilderTokenizer7.setTrimmerMatcher(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder2.deleteFirst(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendNewLine();
        int int48 = strBuilder47.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter49 = strBuilder47.new StrBuilderWriter();
        char[] charArray51 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray51);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray51);
        char[] charArray55 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray55);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer53.reset(charArray55);
        strBuilderWriter49.write(charArray55);
        strBuilder2.buffer = charArray55;
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder2.appendln(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter62 = strBuilder2.new StrBuilderWriter();
        strBuilderWriter62.flush();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strBuilder61);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append("hi!", (int) (short) 1, (int) (short) 0);
        boolean boolean11 = strBuilder3.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendPadding((int) '#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert((int) (byte) 10, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.append("true\n", 0, (int) (byte) 0);
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer24.reset("");
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer24.reset(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.appendln(charArray28);
        boolean boolean32 = strBuilder31.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.insert(0, 'r');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        int int4 = strBuilder3.length();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNewLineText("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((double) '4');
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.append(charArray25);
        char[] charArray29 = strBuilder12.getChars(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendln(charArray29);
        java.lang.String str31 = strBuilder30.toString();
        java.lang.StringBuffer stringBuffer32 = strBuilder30.toStringBuffer();
        boolean boolean33 = strBuilder30.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray36 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray36);
        boolean boolean38 = strTokenizer37.hasNext();
        boolean boolean39 = strTokenizer37.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer37.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.replaceAll(strMatcher40, "1.0");
        int int44 = strBuilder42.indexOf('a');
        char[] charArray45 = strBuilder42.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer48 = strBuilder42.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strBuilderTokenizer48.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer54 = strBuilder50.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strBuilderTokenizer54.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strBuilderTokenizer54.reset();
        int int58 = strTokenizer57.size();
        boolean boolean59 = strTokenizer57.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer57.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strBuilderTokenizer48.setDelimiterMatcher(strMatcher60);
        boolean boolean62 = strBuilder30.contains(strMatcher60);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#' });
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n#\n" + "'", str31, "\n#\n");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "\n#\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        char[] charArray4 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray4);
        boolean boolean6 = strTokenizer5.hasNext();
        boolean boolean7 = strTokenizer5.isEmptyTokenAsNull();
        boolean boolean8 = strTokenizer5.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer5.setDelimiterMatcher(strMatcher9);
        boolean boolean11 = strBuilder2.equals((java.lang.Object) strTokenizer5);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder2.appendSeparator('o', (int) '9');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder0.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strBuilderTokenizer4.setTrimmerMatcher(strMatcher5);
        int int7 = strBuilderTokenizer4.nextIndex();
        boolean boolean8 = strBuilderTokenizer4.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteAll(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.appendWithSeparators(objArray9, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll(strMatcher12, "hi!");
        char[] charArray16 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        boolean boolean18 = strTokenizer17.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer17.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder11.replaceAll(strMatcher19, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder11.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.insert(1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer37 = strBuilder29.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader38 = strBuilder29.new StrBuilderReader();
        java.lang.String str41 = strBuilder29.midString((int) '0', 32);
        boolean boolean42 = strBuilder28.equals(strBuilder29);
        java.lang.String str43 = strBuilder29.getNullText();
        char[] charArray44 = strBuilder29.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '\n' });
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder0.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strBuilderTokenizer4.setTrimmerMatcher(strMatcher5);
        java.lang.String[] strArray7 = strTokenizer6.getTokenArray();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.appendln(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding(0, '4');
        int int29 = strBuilder26.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.insert((int) (byte) 0, "");
        boolean boolean34 = strBuilder32.startsWith("1.0");
        int int36 = strBuilder32.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.append(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder12.appendln(false);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray44 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray44);
        boolean boolean46 = strTokenizer45.hasNext();
        boolean boolean47 = strTokenizer45.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer45.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder42.replaceAll(strMatcher48, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceFirst('r', 'o');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.appendln("a");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder12.appendln(strBuilder53, (int) '\n', 43);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder0.deleteFirst(strMatcher4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.appendln(stringBuffer7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.append(stringBuffer9, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder0.appendln((java.lang.Object) stringBuffer9);
        int int16 = strBuilder0.lastIndexOf(' ', 1);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder0.appendSeparator("1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder0.deleteFirst(strMatcher19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder0.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder0.replaceFirst("    ", "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader27 = strBuilder25.new StrBuilderReader();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        boolean boolean11 = strBuilder9.startsWith("1.0");
        int int13 = strBuilder9.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendPadding(0, '4');
        int int22 = strBuilder19.lastIndexOf("", (int) (short) 0);
        char[] charArray24 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray24);
        boolean boolean26 = strTokenizer25.hasNext();
        boolean boolean27 = strTokenizer25.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder19.appendWithSeparators((java.util.Iterator) strTokenizer25, "hi!");
        boolean boolean31 = strBuilder29.equals((java.lang.Object) 100.0d);
        boolean boolean32 = strBuilder9.equals(strBuilder29);
        char[] charArray34 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray34);
        boolean boolean36 = strTokenizer35.hasNext();
        boolean boolean37 = strTokenizer35.isEmptyTokenAsNull();
        boolean boolean38 = strTokenizer35.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        int int45 = strBuilder42.indexOf(strMatcher43, (int) (byte) 10);
        char[] charArray47 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder42.appendln(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray52 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray52);
        boolean boolean54 = strTokenizer53.hasNext();
        boolean boolean55 = strTokenizer53.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer53.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder50.replaceAll(strMatcher56, "1.0");
        char[] charArray60 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray60);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray60);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder50.appendln(charArray60);
        char[] charArray65 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray65);
        boolean boolean67 = strTokenizer66.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher68 = strTokenizer66.getIgnoredMatcher();
        int int70 = strBuilder50.indexOf(strMatcher68, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder49.deleteFirst(strMatcher68);
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer35.setQuoteMatcher(strMatcher68);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder29.appendln((java.lang.Object) strTokenizer72);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.appendln((long) 11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.insert(108, '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 108");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append((double) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.append("hi!", (int) (short) 1, (int) (short) 0);
        char[] charArray21 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray21);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray21);
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer23.reset(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer23.setDelimiterChar(' ');
        java.lang.String str30 = strTokenizer29.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray33 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        boolean boolean35 = strTokenizer34.hasNext();
        boolean boolean36 = strTokenizer34.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer34.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.replaceAll(strMatcher37, "1.0");
        char[] charArray41 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder31.appendln(charArray41);
        char[] charArray46 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray46);
        boolean boolean48 = strTokenizer47.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer47.getIgnoredMatcher();
        int int51 = strBuilder31.indexOf(strMatcher49, (-1));
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer29.setTrimmerMatcher(strMatcher49);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder13.replaceFirst(strMatcher49, "");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder8.replaceFirst(strMatcher49, "StrTokenizer[not tokenized yet]");
        java.lang.String str59 = strBuilder8.midString(28, (int) '[');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str30, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.setLength(32);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray17 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray17);
        boolean boolean19 = strTokenizer18.hasNext();
        boolean boolean20 = strTokenizer18.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer18.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.replaceAll(strMatcher21, "1.0");
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder15.appendln(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.appendFixedWidthPadRight((int) (byte) 10, (int) (byte) 100, 'a');
        char[] charArray38 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray38);
        boolean boolean40 = strTokenizer39.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int47 = strBuilder44.indexOf(strMatcher45, (int) (byte) 10);
        char[] charArray49 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray49);
        boolean boolean51 = strTokenizer50.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer50.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder44.appendFixedWidthPadRight((java.lang.Object) strMatcher52, (-1), '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer39.setTrimmerMatcher(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder36.replaceFirst(strMatcher52, "#");
        int int59 = strBuilder15.indexOf(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder14.deleteAll(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder60.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder60.insert(1, (java.lang.Object) "aaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.insert((int) '9', '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteAll(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.appendWithSeparators(objArray9, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll(strMatcher12, "hi!");
        char[] charArray16 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        boolean boolean18 = strTokenizer17.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer17.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder11.replaceAll(strMatcher19, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder11.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.insert(1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer37 = strBuilder29.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader38 = strBuilder29.new StrBuilderReader();
        java.lang.String str41 = strBuilder29.midString((int) '0', 32);
        boolean boolean42 = strBuilder28.equals(strBuilder29);
        // The following exception was thrown during execution in test generation
        try {
            char char44 = strBuilder28.charAt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append("hi!", (int) (short) 1, (int) (short) 0);
        boolean boolean11 = strBuilder3.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendPadding((int) '#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert((int) (byte) 10, "1.0");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader18 = strBuilder17.new StrBuilderReader();
        int int20 = strBuilder17.lastIndexOf("4");
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer8 = strBuilder0.new StrBuilderTokenizer();
        java.util.List list9 = strBuilderTokenizer8.getTokenList();
        java.lang.String str10 = strBuilderTokenizer8.toString();
        char[] charArray12 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        boolean boolean14 = strTokenizer13.hasNext();
        boolean boolean15 = strTokenizer13.isEmptyTokenAsNull();
        boolean boolean16 = strTokenizer13.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer13.setDelimiterMatcher(strMatcher17);
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strBuilderTokenizer8.setIgnoredMatcher(strMatcher19);
        java.lang.String[] strArray21 = strBuilderTokenizer8.getTokenArray();
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        java.util.List list27 = strBuilderTokenizer8.tokenize(charArray23, (int) 'r', 55);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StrTokenizer[]" + "'", str10, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.appendSeparator("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.append("hi!", (int) (short) 1, (int) (short) 0);
        char[] charArray29 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendWithSeparators((java.util.Collection) list31, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder15.appendAll((java.util.Collection) list31);
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder15.appendln(obj35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.appendFixedWidthPadRight((java.lang.Object) strBuilder15, 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher49 = null;
        int int50 = strBuilder48.indexOf(strMatcher49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.append((double) (byte) 10);
        java.lang.String str55 = strBuilder48.substring(0, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder40.appendln((java.lang.Object) strBuilder48);
        boolean boolean57 = strBuilder12.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder12.deleteAll("\n#\n");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder12.appendSeparator('a');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder12.appendFixedWidthPadRight(9, 11, 'a');
        java.io.Reader reader66 = strBuilder65.asReader();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader67 = strBuilder65.new StrBuilderReader();
        int int68 = strBuilderReader67.read();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(reader66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        boolean boolean11 = strBuilder9.startsWith("1.0");
        int int13 = strBuilder9.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.deleteFirst(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strBuilder15.substring(8, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setNewLineText("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteAll(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.appendWithSeparators(objArray19, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.appendWithSeparators(objArray19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll('4', '1');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer7 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strBuilderTokenizer7.setEmptyTokenAsNull(true);
        int int10 = strBuilderTokenizer7.nextIndex();
        char[] charArray12 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        char[] charArray16 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer14.reset(charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteAll(' ');
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder22.appendWithSeparators(objArray28, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll(strMatcher31, "hi!");
        char[] charArray35 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray35);
        boolean boolean37 = strTokenizer36.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer36.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.replaceAll(strMatcher38, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer14.setQuoteMatcher(strMatcher38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilderTokenizer7.setTrimmerMatcher(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder2.deleteFirst(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendNewLine();
        int int48 = strBuilder47.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter49 = strBuilder47.new StrBuilderWriter();
        char[] charArray51 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray51);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray51);
        char[] charArray55 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray55);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer53.reset(charArray55);
        strBuilderWriter49.write(charArray55);
        strBuilder2.buffer = charArray55;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder2.appendSeparator("1.0#", 36);
        char[] charArray64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder2.insert(33, charArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strBuilder62);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer10 = strBuilder6.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilderTokenizer10.setEmptyTokenAsNull(true);
        int int13 = strBuilderTokenizer10.nextIndex();
        char[] charArray15 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        char[] charArray19 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer17.reset(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteAll(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder25.appendWithSeparators(objArray31, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll(strMatcher34, "hi!");
        char[] charArray38 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray38);
        boolean boolean40 = strTokenizer39.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer39.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder33.replaceAll(strMatcher41, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer17.setQuoteMatcher(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strBuilderTokenizer10.setTrimmerMatcher(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder5.deleteFirst(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder2.deleteAll(strMatcher41);
        char[] charArray48 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder2.appendAll((java.util.Iterator) strTokenizer49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder2.reverse();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replace(strMatcher10, "", 0, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.appendln("hi!", 1, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append((long) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder21.trim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.appendln("1.03", (int) 'o', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.insert((int) '\000', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("StrTokenizer[#]");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append((double) 13);
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendFixedWidthPadRight((int) (byte) 10, (int) (byte) 100, 'a');
        char[] charArray9 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray9);
        boolean boolean11 = strTokenizer10.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        int int18 = strBuilder15.indexOf(strMatcher16, (int) (byte) 10);
        char[] charArray20 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray20);
        boolean boolean22 = strTokenizer21.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder15.appendFixedWidthPadRight((java.lang.Object) strMatcher23, (-1), '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer10.setTrimmerMatcher(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder7.replaceFirst(strMatcher23, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder7.deleteFirst("#\n");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.append((double) 1);
        java.lang.String str39 = strBuilder37.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder32.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder32.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.appendSeparator("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder47.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.append("hi!", (int) (short) 1, (int) (short) 0);
        char[] charArray61 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray61);
        java.util.List list63 = strTokenizer62.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder53.appendWithSeparators((java.util.Collection) list63, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder47.appendAll((java.util.Collection) list63);
        java.lang.Object obj67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder47.appendln(obj67);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder44.appendFixedWidthPadRight((java.lang.Object) strBuilder47, 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder31.appendln(strBuilder71);
        int int73 = strBuilder71.size;
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder71.appendln((float) 'e');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1.0" + "'", str39, "1.0");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 11 + "'", int73 == 11);
        org.junit.Assert.assertNotNull(strBuilder75);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        int int4 = strBuilder3.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter5 = strBuilder3.new StrBuilderWriter();
        strBuilderWriter5.write("#");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.appendFixedWidthPadRight((int) (byte) 10, (int) (byte) 100, 'a');
        char[] charArray17 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray17);
        boolean boolean19 = strTokenizer18.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        int int26 = strBuilder23.indexOf(strMatcher24, (int) (byte) 10);
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        boolean boolean30 = strTokenizer29.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer29.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder23.appendFixedWidthPadRight((java.lang.Object) strMatcher31, (-1), '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer18.setTrimmerMatcher(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.replaceFirst(strMatcher31, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder15.deleteFirst("#\n");
        char[] charArray40 = strBuilder39.buffer;
        strBuilderWriter5.write(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray40);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(strTokenizer42);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder0.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strBuilderTokenizer4.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strBuilderTokenizer4.reset();
        int int8 = strTokenizer7.size();
        int int9 = strTokenizer7.previousIndex();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append("hi!", (int) (short) 1, (int) (short) 0);
        boolean boolean11 = strBuilder3.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendPadding((int) '#', ' ');
        int int15 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceFirst("1.0", "StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.append((java.lang.Object) strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder3.setNewLineText("#\ntrue\n#\n\n");
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer26.reset("");
        char[] charArray30 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray30);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer26.reset(charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray35 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray35);
        boolean boolean37 = strTokenizer36.hasNext();
        boolean boolean38 = strTokenizer36.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer36.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder33.replaceAll(strMatcher39, "1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer26.setTrimmerMatcher(strMatcher39);
        java.lang.Object obj43 = strTokenizer42.clone();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer42, "1.0#-1");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.appendFixedWidthPadLeft(39, (-1), 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.appendln('e');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int11 = strBuilder8.indexOf(strMatcher9, (int) (byte) 10);
        char[] charArray13 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.appendln(charArray13);
        strBuilder2.buffer = charArray13;
        boolean boolean18 = strBuilder2.contains('0');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder2.appendln((float) (short) 1);
        java.lang.String str22 = strBuilder2.rightString((int) (short) 0);
        int int25 = strBuilder2.lastIndexOf("#\n", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray2 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray2);
        boolean boolean4 = strTokenizer3.hasNext();
        boolean boolean5 = strTokenizer3.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer3.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.replaceAll(strMatcher6, "1.0");
        char[] charArray10 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder0.appendln(charArray10);
        char[] charArray15 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        boolean boolean17 = strTokenizer16.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer16.getIgnoredMatcher();
        int int20 = strBuilder0.indexOf(strMatcher18, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder0.appendln(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder0.insert(39, '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 39");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.appendln(10);
        int int12 = strBuilder7.indexOf("\n#\n", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder13.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer21 = strBuilder13.new StrBuilderTokenizer();
        java.util.List list22 = strBuilderTokenizer21.getTokenList();
        java.lang.String str23 = strBuilderTokenizer21.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        int int30 = strBuilder27.indexOf(strMatcher28, (int) (byte) 10);
        char[] charArray32 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.appendln(charArray32);
        char[] charArray36 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray36);
        java.util.List list38 = strTokenizer37.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.appendAll((java.util.Collection) list38);
        char[] charArray40 = strBuilder34.buffer;
        java.util.List list43 = strBuilderTokenizer21.tokenize(charArray40, (int) (short) 0, 4);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder7.appendWithSeparators((java.util.Collection) list43, "         1.0                       ");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder7.appendSeparator("false1.0", 0);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.replaceFirst('e', '[');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StrTokenizer[]" + "'", str23, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        int int6 = strBuilder3.indexOf(strMatcher4, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadRight(0, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendln(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst('[');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append(false);
        java.lang.String str21 = strBuilder14.midString((int) '\n', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        boolean boolean3 = strTokenizer2.hasNext();
        boolean boolean4 = strTokenizer2.isEmptyTokenAsNull();
        boolean boolean5 = strTokenizer2.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer2.setDelimiterMatcher(strMatcher6);
        java.lang.String str8 = strTokenizer7.previousToken();
        java.lang.String str9 = strTokenizer7.nextToken();
        boolean boolean10 = strTokenizer7.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer7.reset("    ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strTokenizer13);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.appendln(stringBuffer1);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder2.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.append(true);
        strBuilder2.size = (byte) 0;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder2.appendln(true);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        int int19 = strBuilder16.indexOf(strMatcher17, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder2.append(strBuilder21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder2.insert(14, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("a52.0#5.0");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder0.append("hi!", (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = strBuilder6.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.replaceAll('[', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append((double) 1);
        java.lang.String str18 = strBuilder16.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder11.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder11.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append((double) 1);
        java.lang.String str31 = strBuilder29.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder23.appendln(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendPadding(0, '4');
        int int40 = strBuilder37.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.insert((int) (byte) 0, "");
        boolean boolean45 = strBuilder43.startsWith("1.0");
        int int47 = strBuilder43.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder23.append(strBuilder49);
        boolean boolean52 = strBuilder49.endsWith("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder49.deleteFirst("\n#\n");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder49.ensureCapacity((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder6.appendln(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.deleteAll('r');
        java.lang.Class<?> wildcardClass60 = strBuilder57.getClass();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1.0" + "'", str18, "1.0");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1.0" + "'", str31, "1.0");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("1.0#-1");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.setNewLineText("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.appendln(stringBuffer17);
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.append(stringBuffer19, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder10.appendln((java.lang.Object) stringBuffer19);
        boolean boolean24 = strBuilder9.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder9.appendFixedWidthPadLeft((int) (short) 100, 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.ensureCapacity((int) (short) 100);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter31 = strBuilder28.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendSeparator('#', 3);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.appendFixedWidthPadRight((int) (byte) 10, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendSeparator('a', (int) (short) 100);
        java.lang.String str48 = strBuilder42.midString(32, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder42.setNewLineText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder28.appendln(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder1.appendln(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.appendln(stringBuffer1);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder2.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteAll(' ');
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder10.appendWithSeparators(objArray16, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll(strMatcher19, "hi!");
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer24.reset("");
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer24.reset(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray33 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        boolean boolean35 = strTokenizer34.hasNext();
        boolean boolean36 = strTokenizer34.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer34.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.replaceAll(strMatcher37, "1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer24.setTrimmerMatcher(strMatcher37);
        boolean boolean41 = strBuilder21.contains(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.appendln(stringBuffer43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.append(0L);
        char[] charArray48 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray48);
        boolean boolean50 = strTokenizer49.hasNext();
        boolean boolean51 = strTokenizer49.isEmptyTokenAsNull();
        boolean boolean52 = strTokenizer49.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        int int59 = strBuilder56.indexOf(strMatcher57, (int) (byte) 10);
        char[] charArray61 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder56.appendln(charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray66 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray66);
        boolean boolean68 = strTokenizer67.hasNext();
        boolean boolean69 = strTokenizer67.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher70 = strTokenizer67.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder64.replaceAll(strMatcher70, "1.0");
        char[] charArray74 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray74);
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray74);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder64.appendln(charArray74);
        char[] charArray79 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray79);
        boolean boolean81 = strTokenizer80.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher82 = strTokenizer80.getIgnoredMatcher();
        int int84 = strBuilder64.indexOf(strMatcher82, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder63.deleteFirst(strMatcher82);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer49.setQuoteMatcher(strMatcher82);
        int int88 = strBuilder44.indexOf(strMatcher82, 10);
        int int90 = strBuilder21.indexOf(strMatcher82, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder21.trim();
        char[] charArray93 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer94 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray93);
        org.apache.commons.lang.text.StrTokenizer strTokenizer96 = strTokenizer94.reset("");
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder91.appendAll((java.util.Iterator) strTokenizer94);
        org.apache.commons.lang.text.StrBuilder strBuilder98 = strBuilder2.appendln((java.lang.Object) strBuilder97);
        org.apache.commons.lang.text.StrBuilder strBuilder99 = strBuilder98.trim();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertArrayEquals(charArray93, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer94);
        org.junit.Assert.assertNotNull(strTokenizer96);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertNotNull(strBuilder98);
        org.junit.Assert.assertNotNull(strBuilder99);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder0.appendln("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.insert((int) (byte) 0, (int) (short) -1);
        boolean boolean13 = strBuilder12.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        int int19 = strBuilder17.indexOf(strMatcher18);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.setNewLineText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer23, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder34.indexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.append((double) (byte) 10);
        java.lang.String str41 = strBuilder34.substring(0, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder26.appendln((java.lang.Object) strBuilder34);
        char[] charArray45 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder26.insert((int) (byte) 0, charArray45);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer23.reset(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder12.appendln(charArray45, (int) (short) 0, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder51.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.replaceAll("1.0[\n", "-1\nhi!\n");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder0.new StrBuilderTokenizer();
        java.lang.Object obj5 = strBuilderTokenizer4.clone();
        char[] charArray7 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer8.reset("");
        boolean boolean11 = strTokenizer8.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer8.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strBuilderTokenizer4.setTrimmerMatcher(strMatcher12);
        int int14 = strBuilderTokenizer4.nextIndex();
        java.lang.String str15 = strBuilderTokenizer4.getContent();
        int int16 = strBuilderTokenizer4.size();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.appendln("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int33 = strBuilder30.indexOf(strMatcher31, (int) (byte) 10);
        char[] charArray35 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.appendln(charArray35);
        char[] charArray39 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray39);
        java.util.List list41 = strTokenizer40.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.appendAll((java.util.Collection) list41);
        char[] charArray43 = strBuilder37.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder17.appendln(charArray43);
        java.util.List list47 = strBuilderTokenizer4.tokenize(charArray43, (int) '0', 4);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        java.lang.String str4 = strBuilder2.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder2.insert(0, (java.lang.Object) strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((double) '4');
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.append(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder9.appendln((java.lang.Object) charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.appendSeparator("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.insert((int) (byte) 10, "");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.appendFixedWidthPadRight(4, (int) (short) 10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder31.deleteFirst('9');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.0" + "'", str4, "1.0");
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer10 = strBuilder6.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilderTokenizer10.setEmptyTokenAsNull(true);
        int int13 = strBuilderTokenizer10.nextIndex();
        char[] charArray15 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        char[] charArray19 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer17.reset(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteAll(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder25.appendWithSeparators(objArray31, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll(strMatcher34, "hi!");
        char[] charArray38 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray38);
        boolean boolean40 = strTokenizer39.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer39.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder33.replaceAll(strMatcher41, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer17.setQuoteMatcher(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strBuilderTokenizer10.setTrimmerMatcher(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder5.deleteFirst(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder2.deleteAll(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendSeparator(' ', 100);
        int int52 = strBuilder47.lastIndexOf('r');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.append((double) (byte) 10);
        java.lang.String str9 = strBuilder2.substring(0, (int) (byte) 0);
        int int12 = strBuilder2.indexOf("\n", (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray15 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        boolean boolean17 = strTokenizer16.hasNext();
        boolean boolean18 = strTokenizer16.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer16.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.replaceAll(strMatcher19, "1.0");
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder13.appendln(charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder13.ensureCapacity(100);
        char[] charArray30 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray30);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer31.reset("");
        java.lang.String[] strArray34 = strTokenizer31.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder13.appendWithSeparators((java.util.Iterator) strTokenizer31, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendNewLine();
        int int41 = strBuilder40.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter42 = strBuilder40.new StrBuilderWriter();
        char[] charArray44 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray44);
        char[] charArray48 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray48);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer46.reset(charArray48);
        strBuilderWriter42.write(charArray48);
        char[] charArray53 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray53);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer54.reset("");
        char[] charArray58 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer54.reset(charArray58);
        strBuilderWriter42.write(charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder36.append(charArray58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray58);
        boolean boolean64 = strTokenizer63.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder2.appendWithSeparators((java.util.Iterator) strTokenizer63, "");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder2.setNewLineText("a");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder2.insert(64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 64");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        java.lang.String str4 = strBuilder2.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder2.insert(0, (java.lang.Object) strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((double) '4');
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.append(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder9.appendln((java.lang.Object) charArray25);
        java.lang.StringBuffer stringBuffer30 = strBuilder9.toStringBuffer();
        int int32 = strBuilder9.indexOf("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder9.replaceAll('4', '4');
        java.lang.StringBuffer stringBuffer36 = strBuilder35.toStringBuffer();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.0" + "'", str4, "1.0");
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(stringBuffer36);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.io.Writer writer0 = java.io.Writer.nullWriter();
        java.io.Writer writer2 = writer0.append((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = writer0.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        int int11 = strBuilder8.lastIndexOf("", (int) (short) 0);
        char[] charArray13 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray13);
        boolean boolean15 = strTokenizer14.hasNext();
        boolean boolean16 = strTokenizer14.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer14, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.appendln(0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((double) 1);
        java.lang.String str25 = strBuilder23.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder23.insert(0, (java.lang.Object) strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append((double) 1);
        java.lang.String str41 = strBuilder39.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append((double) '4');
        char[] charArray46 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder42.append(charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder30.appendln((java.lang.Object) charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.appendSeparator("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteAll('4');
        java.lang.StringBuffer stringBuffer55 = strBuilder54.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder20.appendln(stringBuffer55);
        java.io.Writer writer57 = writer0.append((java.lang.CharSequence) stringBuffer55);
        java.io.Writer writer59 = writer0.append('1');
        org.junit.Assert.assertNotNull(writer0);
        org.junit.Assert.assertNotNull(writer2);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1.0" + "'", str25, "1.0");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1.0" + "'", str41, "1.0");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(writer57);
        org.junit.Assert.assertNotNull(writer59);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int11 = strBuilder8.indexOf(strMatcher9, (int) (byte) 10);
        char[] charArray13 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.appendln(charArray13);
        strBuilder2.buffer = charArray13;
        boolean boolean18 = strBuilder2.contains('0');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder2.replaceFirst('1', '1');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder0.append("hi!", (int) (short) 1, (int) (short) 0);
        boolean boolean8 = strBuilder0.endsWith("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.appendln(stringBuffer10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(0L);
        char[] charArray15 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        boolean boolean17 = strTokenizer16.hasNext();
        boolean boolean18 = strTokenizer16.isEmptyTokenAsNull();
        boolean boolean19 = strTokenizer16.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        int int26 = strBuilder23.indexOf(strMatcher24, (int) (byte) 10);
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendln(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray33 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        boolean boolean35 = strTokenizer34.hasNext();
        boolean boolean36 = strTokenizer34.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer34.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.replaceAll(strMatcher37, "1.0");
        char[] charArray41 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder31.appendln(charArray41);
        char[] charArray46 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray46);
        boolean boolean48 = strTokenizer47.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer47.getIgnoredMatcher();
        int int51 = strBuilder31.indexOf(strMatcher49, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder30.deleteFirst(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer16.setQuoteMatcher(strMatcher49);
        int int55 = strBuilder11.indexOf(strMatcher49, 10);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder0.replaceFirst(strMatcher49, "1.0");
        java.lang.String str59 = strBuilder57.leftString((int) '\000');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder57.deleteFirst('0');
        strBuilder57.size = 7;
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strBuilder61);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.appendln(stringBuffer1);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder2.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.append(true);
        strBuilder2.size = (byte) 0;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder2.appendln(true);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        int int19 = strBuilder16.indexOf(strMatcher17, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder2.append(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        boolean boolean27 = strTokenizer26.hasNext();
        boolean boolean28 = strTokenizer26.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer26.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.replaceAll(strMatcher29, "1.0");
        char[] charArray33 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder23.appendln(charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder23.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader39 = strBuilder38.new StrBuilderReader();
        boolean boolean40 = strBuilder2.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder2.appendSeparator('r');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.append("#############", 6, 3);
        int int49 = strBuilder42.lastIndexOf("a52.0#5.0", (int) (byte) 0);
        boolean boolean50 = strBuilder42.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        int int11 = strBuilder8.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.insert((int) (byte) 0, "");
        boolean boolean16 = strBuilder14.startsWith("1.0");
        int int18 = strBuilder14.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder2.appendln(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.setNewLineText("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append((double) 1);
        java.lang.String str37 = strBuilder35.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder30.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append((double) '4');
        char[] charArray42 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder38.append(charArray42);
        char[] charArray46 = strBuilder29.getChars(charArray42);
        char[] charArray47 = strBuilder21.getChars(charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder21.appendln(true);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder49.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendln((float) 3);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.deleteFirst(strMatcher59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.appendln(stringBuffer62);
        java.lang.StringBuffer stringBuffer64 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder61.append(stringBuffer64, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder55.appendln((java.lang.Object) stringBuffer64);
        int int71 = strBuilder55.lastIndexOf(' ', 1);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder55.appendSeparator("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.appendPadding(0, '4');
        char[] charArray78 = strBuilder77.buffer;
        strBuilder73.buffer = charArray78;
        char[] charArray80 = strBuilder54.getChars(charArray78);
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray78);
        org.apache.commons.lang.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1.0" + "'", str37, "1.0");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '\n' });
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '\n' });
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '\n' });
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder0.append("hi!", (int) (short) 1, (int) (short) 0);
        boolean boolean8 = strBuilder0.endsWith("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.appendln(stringBuffer10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(0L);
        char[] charArray15 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        boolean boolean17 = strTokenizer16.hasNext();
        boolean boolean18 = strTokenizer16.isEmptyTokenAsNull();
        boolean boolean19 = strTokenizer16.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        int int26 = strBuilder23.indexOf(strMatcher24, (int) (byte) 10);
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendln(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray33 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        boolean boolean35 = strTokenizer34.hasNext();
        boolean boolean36 = strTokenizer34.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer34.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.replaceAll(strMatcher37, "1.0");
        char[] charArray41 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder31.appendln(charArray41);
        char[] charArray46 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray46);
        boolean boolean48 = strTokenizer47.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer47.getIgnoredMatcher();
        int int51 = strBuilder31.indexOf(strMatcher49, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder30.deleteFirst(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer16.setQuoteMatcher(strMatcher49);
        int int55 = strBuilder11.indexOf(strMatcher49, 10);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder0.replaceFirst(strMatcher49, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.append(14);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.append(strBuilder60, (-1), (int) '0');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder59.append(1.0f);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer8 = strBuilder0.new StrBuilderTokenizer();
        boolean boolean9 = strBuilder0.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding(0, '4');
        int int16 = strBuilder13.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.replace(strMatcher20, "", 0, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendln("hi!", 1, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert(0, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendPadding(0, '4');
        int int39 = strBuilder36.lastIndexOf("", (int) (short) 0);
        char[] charArray41 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray41);
        boolean boolean43 = strTokenizer42.hasNext();
        boolean boolean44 = strTokenizer42.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder36.appendWithSeparators((java.util.Iterator) strTokenizer42, "hi!");
        java.io.Reader reader47 = strBuilder36.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder32.appendFixedWidthPadRight((java.lang.Object) reader47, (int) (short) 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder32.appendFixedWidthPadLeft(36, (int) (byte) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder55.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer63 = strBuilder55.new StrBuilderTokenizer();
        java.util.List list64 = strBuilderTokenizer63.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder54.appendAll((java.util.Collection) list64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder0.appendAll((java.util.Collection) list64);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder0.appendln('\000');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        java.lang.String str9 = strBuilder0.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.indexOf(strMatcher13);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.setNewLineText("");
        boolean boolean17 = strBuilder16.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.reverse();
        boolean boolean19 = strBuilder0.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.appendSeparator(' ');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        char[] charArray5 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer3.reset(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer3.setDelimiterChar(' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer3.reset("StrTokenizer[]");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer11.setDelimiterString("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer14.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer14.setDelimiterString("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer14.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer7 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strBuilderTokenizer7.setEmptyTokenAsNull(true);
        int int10 = strBuilderTokenizer7.nextIndex();
        char[] charArray12 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        char[] charArray16 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer14.reset(charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteAll(' ');
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder22.appendWithSeparators(objArray28, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll(strMatcher31, "hi!");
        char[] charArray35 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray35);
        boolean boolean37 = strTokenizer36.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer36.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.replaceAll(strMatcher38, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer14.setQuoteMatcher(strMatcher38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilderTokenizer7.setTrimmerMatcher(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder2.deleteFirst(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder2.deleteAll("# -1.0\n");
        int int46 = strBuilder2.capacity();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        int int4 = strBuilder3.length();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNewLineText("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((double) '4');
        char[] charArray25 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.append(charArray25);
        char[] charArray29 = strBuilder12.getChars(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendln(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder36.indexOf(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding(0, '4');
        int int45 = strBuilder42.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.insert((int) (byte) 0, "");
        boolean boolean50 = strBuilder48.startsWith("1.0");
        int int52 = strBuilder48.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder36.appendln(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.setNewLineText("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.append((double) 1);
        java.lang.String str71 = strBuilder69.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder64.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.append((double) '4');
        char[] charArray76 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray76);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder72.append(charArray76);
        char[] charArray80 = strBuilder63.getChars(charArray76);
        char[] charArray81 = strBuilder55.getChars(charArray76);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder33.append(charArray81);
        int int85 = strBuilder82.lastIndexOf("\n0.0hi!\n", 25);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#' });
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1.0" + "'", str71, "1.0");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '\n' });
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '\n' });
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '\n' });
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append((double) 1);
        java.lang.String str17 = strBuilder15.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder10.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder10.appendFixedWidthPadRight(100, 0, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder22.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder9.appendln(stringBuffer23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        int int32 = strBuilder29.indexOf(strMatcher30, (int) (byte) 10);
        int int33 = strBuilder29.size;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder9.insert((int) (short) 0, (java.lang.Object) strBuilder29);
        java.lang.Object[] objArray35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder9.appendWithSeparators(objArray35, "aaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder9.append((long) 106);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder9.replaceFirst("nizer[]", "\n         1.0                          #");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0" + "'", str17, "1.0");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "a");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder0.replaceAll(' ', '#');
        java.lang.String str7 = strBuilder5.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.appendSeparator('#', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendPadding((int) (short) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append((double) 100);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((java.lang.Object) "aaaaaaaa");
        int int15 = strBuilder12.size;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.setNewLineText("StrTokenizer[not");
        java.lang.String str18 = strBuilder12.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StrTokenizer[not" + "'", str18, "StrTokenizer[not");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        int int4 = strBuilder3.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter5 = strBuilder3.new StrBuilderWriter();
        char[] charArray7 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray7);
        char[] charArray11 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.reset(charArray11);
        strBuilderWriter5.write(charArray11);
        strBuilderWriter5.write(100);
        strBuilderWriter5.flush();
        java.io.Writer writer19 = strBuilderWriter5.append((java.lang.CharSequence) "1.0");
        java.io.Writer writer21 = writer19.append((java.lang.CharSequence) "1.0");
        java.io.Writer writer23 = writer19.append((java.lang.CharSequence) "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append((double) 1);
        java.lang.String str31 = strBuilder29.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder24.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.appendSeparator("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder39.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder39.appendln("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.insert((int) (byte) 0, (int) (short) -1);
        java.lang.StringBuffer stringBuffer52 = strBuilder48.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder38.append(stringBuffer52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.appendln((int) (short) 1);
        java.lang.StringBuffer stringBuffer56 = strBuilder55.toStringBuffer();
        java.io.Writer writer57 = writer19.append((java.lang.CharSequence) stringBuffer56);
        java.io.Writer writer59 = writer19.append('0');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(writer19);
        org.junit.Assert.assertNotNull(writer21);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1.0" + "'", str31, "1.0");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(stringBuffer52);
        org.junit.Assert.assertEquals(stringBuffer52.toString(), "-1\nhi!\n");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(stringBuffer56);
        org.junit.Assert.assertEquals(stringBuffer56.toString(), "a-1\nhi!\n1\n");
        org.junit.Assert.assertNotNull(writer57);
        org.junit.Assert.assertNotNull(writer59);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append("hi!", (int) (short) 1, (int) (short) 0);
        boolean boolean11 = strBuilder3.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendPadding((int) '#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert((int) (byte) 10, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.append("true\n", 0, (int) (byte) 0);
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer24.reset("");
        char[] charArray28 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer24.reset(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.appendln(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray28);
        char[] charArray34 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray34);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer35.reset("");
        char[] charArray39 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer35.reset(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder();
        char[] charArray44 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray44);
        boolean boolean46 = strTokenizer45.hasNext();
        boolean boolean47 = strTokenizer45.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer45.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder42.replaceAll(strMatcher48, "1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer35.setTrimmerMatcher(strMatcher48);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer32.setDelimiterMatcher(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append((double) 1);
        java.lang.String str58 = strBuilder56.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder56.insert(0, (java.lang.Object) strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.append((double) 1);
        java.lang.String str74 = strBuilder72.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder67.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.append((double) '4');
        char[] charArray79 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray79);
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder75.append(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder63.appendln((java.lang.Object) charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder83.appendSeparator("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder85.deleteAll('4');
        java.lang.StringBuffer stringBuffer88 = strBuilder87.toStringBuffer();
        java.lang.String str89 = strBuilder87.getNewLineText();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer32.set((java.lang.Object) str89);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1.0" + "'", str58, "1.0");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1.0" + "'", str74, "1.0");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(stringBuffer88);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding(0, '4');
        int int11 = strBuilder8.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.insert((int) (byte) 0, "");
        boolean boolean16 = strBuilder14.startsWith("1.0");
        int int18 = strBuilder14.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder2.appendln(strBuilder14);
        java.lang.StringBuffer stringBuffer22 = strBuilder14.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder14.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.appendFixedWidthPadRight((int) (short) 0, 3, 'r');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder14.append((double) 106);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(stringBuffer22);
        org.junit.Assert.assertEquals(stringBuffer22.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        char[] charArray5 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer3.reset(charArray5);
        java.lang.String str8 = strTokenizer3.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer3.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer8 = strBuilder0.new StrBuilderTokenizer();
        java.util.List list9 = strBuilderTokenizer8.getTokenList();
        java.lang.String str10 = strBuilderTokenizer8.toString();
        char[] charArray12 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        boolean boolean14 = strTokenizer13.hasNext();
        boolean boolean15 = strTokenizer13.isEmptyTokenAsNull();
        boolean boolean16 = strTokenizer13.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer13.setDelimiterMatcher(strMatcher17);
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strBuilderTokenizer8.setIgnoredMatcher(strMatcher19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer20.setIgnoreEmptyTokens(false);
        int int23 = strTokenizer22.previousIndex();
        boolean boolean24 = strTokenizer22.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StrTokenizer[]" + "'", str10, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        boolean boolean11 = strBuilder9.startsWith("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.appendln((long) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding(0, '4');
        int int20 = strBuilder17.lastIndexOf("", (int) (short) 0);
        char[] charArray22 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray22);
        boolean boolean24 = strTokenizer23.hasNext();
        boolean boolean25 = strTokenizer23.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer23, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.deleteFirst(strMatcher32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder();
        java.lang.StringBuffer stringBuffer35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.appendln(stringBuffer35);
        java.lang.StringBuffer stringBuffer37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.append(stringBuffer37, (int) (byte) 10, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder28.appendln((java.lang.Object) stringBuffer37);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendPadding(0, '4');
        int int50 = strBuilder47.lastIndexOf("", (int) (short) 0);
        char[] charArray52 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray52);
        boolean boolean54 = strTokenizer53.hasNext();
        boolean boolean55 = strTokenizer53.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder47.appendWithSeparators((java.util.Iterator) strTokenizer53, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher58 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer53.setIgnoredMatcher(strMatcher58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer59.reset("");
        boolean boolean62 = strBuilder43.equals((java.lang.Object) strTokenizer61);
        char[] charArray64 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray64);
        boolean boolean66 = strTokenizer65.hasNext();
        boolean boolean67 = strTokenizer65.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher68 = strTokenizer65.getDelimiterMatcher();
        int int70 = strBuilder43.lastIndexOf(strMatcher68, 36);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder27.deleteFirst(strMatcher68);
        boolean boolean72 = strBuilder13.equals((java.lang.Object) strBuilder71);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder13.insert(34, (double) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder0.deleteFirst(strMatcher4);
        java.io.Reader reader6 = strBuilder5.asReader();
        int int7 = strBuilder5.length();
        java.lang.String str9 = strBuilder5.rightString(97);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1);
        java.lang.String str7 = strBuilder5.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder0.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) 1);
        java.lang.String str20 = strBuilder18.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.appendln(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding(0, '4');
        int int29 = strBuilder26.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.insert((int) (byte) 0, "");
        boolean boolean34 = strBuilder32.startsWith("1.0");
        int int36 = strBuilder32.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.append(strBuilder38);
        boolean boolean41 = strBuilder38.endsWith("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.appendln((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append("aaaaaaaa");
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0" + "'", str20, "1.0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("1.0#-1");
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("\n         1.0               ");
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("\nhi!\na");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = strTokenizer1.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteAll(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.appendWithSeparators(objArray9, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll(strMatcher12, "hi!");
        char[] charArray16 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        boolean boolean18 = strTokenizer17.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer17.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder11.replaceAll(strMatcher19, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder11.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.insert(1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer37 = strBuilder29.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader38 = strBuilder29.new StrBuilderReader();
        java.lang.String str41 = strBuilder29.midString((int) '0', 32);
        boolean boolean42 = strBuilder28.equals(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder28.setNullText("1.0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder28.insert(28, "1.03");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 28");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        int int6 = strBuilder3.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replace(strMatcher10, "", 0, (int) (short) 0, (int) (byte) 1);
        java.lang.String str18 = strBuilder9.midString((-1), (int) 'a');
        int int20 = strBuilder9.lastIndexOf("aaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.append("hi!", (int) (short) 1, (int) (short) 0);
        char[] charArray29 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendWithSeparators((java.util.Collection) list31, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder9.appendAll((java.util.Collection) list31);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder9.deleteFirst('o');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder9.replace((int) (short) -1, (int) (short) 1, "1.0[\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer8 = strBuilder0.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader9 = strBuilder0.new StrBuilderReader();
        strBuilderReader9.close();
        int int11 = strBuilderReader9.read();
        boolean boolean12 = strBuilderReader9.markSupported();
        strBuilderReader9.reset();
        boolean boolean14 = strBuilderReader9.ready();
        boolean boolean15 = strBuilderReader9.markSupported();
        boolean boolean16 = strBuilderReader9.markSupported();
        strBuilderReader9.mark(28);
        boolean boolean19 = strBuilderReader9.ready();
        int int20 = strBuilderReader9.read();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteAll(' ');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.appendWithSeparators(objArray30, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceAll(strMatcher33, "hi!");
        char[] charArray37 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray37);
        boolean boolean39 = strTokenizer38.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer38.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder32.replaceAll(strMatcher40, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder32.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder32.append((float) (short) 0);
        char[] charArray47 = strBuilder46.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray47);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = strBuilderReader9.read(charArray47, 99, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '1', '0', '1', '.', '0', '0', '1', '.', '0', '1', '0', '0', '.', '0', '0', '.', '0' });
        org.junit.Assert.assertNotNull(strTokenizer48);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder0.append("hi!", (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = strBuilder6.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.replaceAll(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.appendln((long) 101);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int4 = strBuilder2.indexOf(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.setNewLineText("");
        boolean boolean7 = strBuilder6.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer18 = strBuilder10.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader19 = strBuilder10.new StrBuilderReader();
        strBuilderReader19.close();
        int int21 = strBuilderReader19.read();
        boolean boolean22 = strBuilderReader19.markSupported();
        strBuilderReader19.reset();
        boolean boolean24 = strBuilderReader19.ready();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.appendln(10);
        char[] charArray35 = strBuilder32.buffer;
        int int36 = strBuilderReader19.read(charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder9.append(charArray35);
        boolean boolean39 = strBuilder37.contains('a');
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        char[] charArray1 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        boolean boolean3 = strTokenizer2.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        int int10 = strBuilder7.indexOf(strMatcher8, (int) (byte) 10);
        char[] charArray12 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray12);
        boolean boolean14 = strTokenizer13.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer13.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder7.appendFixedWidthPadRight((java.lang.Object) strMatcher15, (-1), '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer2.setTrimmerMatcher(strMatcher15);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteAll(' ');
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.appendWithSeparators(objArray29, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceAll(strMatcher32, "hi!");
        char[] charArray36 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray36);
        boolean boolean38 = strTokenizer37.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer37.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder31.replaceAll(strMatcher39, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer2.setQuoteMatcher(strMatcher39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer2.setEmptyTokenAsNull(true);
        java.lang.Object obj45 = strTokenizer2.next();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer2.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "#" + "'", obj45, "#");
        org.junit.Assert.assertNotNull(strMatcher46);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder0.new StrBuilderTokenizer();
        boolean boolean6 = strBuilder0.contains("StrTokenizer[not");
        java.lang.String str8 = strBuilder0.leftString(27);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer8 = strBuilder0.new StrBuilderTokenizer();
        int int10 = strBuilder0.indexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendPadding(0, '4');
        int int17 = strBuilder14.lastIndexOf("", (int) (short) 0);
        char[] charArray19 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray19);
        boolean boolean21 = strTokenizer20.hasNext();
        boolean boolean22 = strTokenizer20.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder14.appendWithSeparators((java.util.Iterator) strTokenizer20, "hi!");
        java.io.Reader reader25 = strBuilder14.asReader();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer26 = strBuilder14.new StrBuilderTokenizer();
        java.util.List list27 = strBuilderTokenizer26.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder0.appendWithSeparators((java.util.Collection) list27, "aaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendNewLine();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer37 = strBuilder33.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilderTokenizer37.setEmptyTokenAsNull(true);
        int int40 = strBuilderTokenizer37.nextIndex();
        char[] charArray42 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray42);
        char[] charArray46 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer44.reset(charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteAll(' ');
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10L, (byte) 0, 100.0d };
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder52.appendWithSeparators(objArray58, "1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.replaceAll(strMatcher61, "hi!");
        char[] charArray65 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray65);
        boolean boolean67 = strTokenizer66.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher68 = strTokenizer66.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder60.replaceAll(strMatcher68, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer44.setQuoteMatcher(strMatcher68);
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strBuilderTokenizer37.setTrimmerMatcher(strMatcher68);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder32.deleteFirst(strMatcher68);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceFirst('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder73.append((long) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder73.appendSeparator("44aa#", 43);
        boolean boolean82 = strBuilder29.equals(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 0, 100.0]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder2.append(3L);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.appendln(true);
        java.io.Writer writer7 = strBuilder4.asWriter();
        java.io.Writer writer9 = writer7.append((java.lang.CharSequence) "a");
        java.lang.Class<?> wildcardClass10 = writer7.getClass();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(writer7);
        org.junit.Assert.assertNotNull(writer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer8 = strBuilder0.new StrBuilderTokenizer();
        java.util.List list9 = strBuilderTokenizer8.getTokenList();
        java.lang.String str10 = strBuilderTokenizer8.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int17 = strBuilder14.indexOf(strMatcher15, (int) (byte) 10);
        char[] charArray19 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.appendln(charArray19);
        char[] charArray23 = new char[] { '#' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        java.util.List list25 = strTokenizer24.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.appendAll((java.util.Collection) list25);
        char[] charArray27 = strBuilder21.buffer;
        java.util.List list30 = strBuilderTokenizer8.tokenize(charArray27, (int) (short) 0, 4);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray27);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = strTokenizer32.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StrTokenizer[]" + "'", str10, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
    }
}

