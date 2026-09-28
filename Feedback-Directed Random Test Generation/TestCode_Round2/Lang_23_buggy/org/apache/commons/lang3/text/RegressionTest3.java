package org.apache.commons.lang3.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale17);
        java.util.Locale locale19 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray22 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str23 = extendedMessageFormat1.toPattern();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        java.lang.Object[] objArray29 = extendedMessageFormat26.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.lang.String str35 = extendedMessageFormat32.toPattern();
        extendedMessageFormat32.applyPattern("");
        java.util.Locale locale38 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        java.lang.String str40 = extendedMessageFormat39.toPattern();
        java.lang.String str41 = extendedMessageFormat39.toPattern();
        java.lang.Object[] objArray43 = extendedMessageFormat39.parse("hi!");
        java.util.Locale locale44 = extendedMessageFormat39.getLocale();
        extendedMessageFormat26.setLocale(locale44);
        extendedMessageFormat1.setLocale(locale44);
        java.text.Format[] formatArray47 = extendedMessageFormat1.getFormats();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertArrayEquals(objArray43, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat2.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        extendedMessageFormat2.setLocale(locale18);
        java.util.Locale locale20 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.lang.String str27 = extendedMessageFormat24.toPattern();
        java.util.Locale locale28 = extendedMessageFormat24.getLocale();
        java.lang.String str29 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.lang.String str35 = extendedMessageFormat32.toPattern();
        java.util.Locale locale36 = extendedMessageFormat32.getLocale();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        extendedMessageFormat24.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator41 = extendedMessageFormat21.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str20 = java.text.MessageFormat.format("hi!", objArray19);
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        java.lang.String str22 = extendedMessageFormat14.format((java.lang.Object) objArray19);
        java.util.Locale locale23 = extendedMessageFormat14.getLocale();
        extendedMessageFormat9.setLocale(locale23);
        extendedMessageFormat9.applyPattern("hi!");
        extendedMessageFormat9.applyPattern("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat13.applyPattern("hi!");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.util.Locale locale17 = extendedMessageFormat13.getLocale();
        java.lang.Object[] objArray19 = extendedMessageFormat13.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        extendedMessageFormat22.setLocale(locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.lang.String str33 = extendedMessageFormat30.toPattern();
        java.util.Locale locale34 = extendedMessageFormat30.getLocale();
        extendedMessageFormat22.setLocale(locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale38 = extendedMessageFormat37.getLocale();
        extendedMessageFormat22.setLocale(locale38);
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale41);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale44);
        java.lang.String str46 = extendedMessageFormat45.toPattern();
        java.lang.Object[] objArray48 = extendedMessageFormat45.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator49 = extendedMessageFormat42.formatToCharacterIterator((java.lang.Object) objArray48);
        java.text.AttributedCharacterIterator attributedCharacterIterator50 = extendedMessageFormat22.formatToCharacterIterator((java.lang.Object) objArray48);
        java.lang.String str51 = extendedMessageFormat22.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat54.applyPattern("");
        java.lang.String str57 = extendedMessageFormat54.toPattern();
        java.text.Format[] formatArray58 = extendedMessageFormat54.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat61.applyPattern("");
        java.lang.String str64 = extendedMessageFormat61.toPattern();
        extendedMessageFormat61.applyPattern("");
        java.util.Locale locale67 = extendedMessageFormat61.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale67);
        extendedMessageFormat54.setLocale(locale67);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale67);
        java.text.Format[] formatArray71 = extendedMessageFormat70.getFormats();
        java.lang.String str72 = extendedMessageFormat22.format((java.lang.Object) formatArray71);
        java.lang.String str73 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str74 = extendedMessageFormat13.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertArrayEquals(objArray48, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator49);
        org.junit.Assert.assertNotNull(attributedCharacterIterator50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray71);
        org.junit.Assert.assertArrayEquals(formatArray71, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(locale11);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) objArray6);
        java.util.Locale locale10 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale13);
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.lang.Object[] objArray20 = extendedMessageFormat17.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = extendedMessageFormat14.formatToCharacterIterator((java.lang.Object) objArray20);
        java.text.Format[] formatArray22 = extendedMessageFormat14.getFormatsByArgumentIndex();
        extendedMessageFormat14.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormatsByArgumentIndex();
        java.text.Format[] formatArray28 = extendedMessageFormat26.getFormatsByArgumentIndex();
        extendedMessageFormat26.applyPattern("hi!");
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        extendedMessageFormat14.setLocale(locale31);
        extendedMessageFormat1.setLocale(locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.lang.String str39 = extendedMessageFormat36.toPattern();
        java.text.Format[] formatArray40 = extendedMessageFormat36.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat43.applyPattern("");
        java.lang.String str46 = extendedMessageFormat43.toPattern();
        extendedMessageFormat43.applyPattern("");
        java.util.Locale locale49 = extendedMessageFormat43.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        extendedMessageFormat36.setLocale(locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        java.util.Locale locale53 = extendedMessageFormat52.getLocale();
        java.util.Locale locale54 = extendedMessageFormat52.getLocale();
        java.lang.Class<?> wildcardClass55 = extendedMessageFormat52.getClass();
        java.lang.StringBuffer stringBuffer56 = null;
        java.text.FieldPosition fieldPosition57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer58 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat52, stringBuffer56, fieldPosition57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator21);
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        extendedMessageFormat3.setLocale(locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.util.Locale locale19 = extendedMessageFormat17.getLocale();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        java.util.Locale locale21 = extendedMessageFormat17.getLocale();
        java.text.Format[] formatArray22 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat17.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat15.setFormatsByArgumentIndex(formatArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        extendedMessageFormat22.setLocale(locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        extendedMessageFormat14.setLocale(locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat9.setLocale(locale27);
        java.lang.String str34 = extendedMessageFormat9.toPattern();
        java.text.Format format36 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatByArgumentIndex((int) '4', format36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.util.Locale locale18 = extendedMessageFormat16.getLocale();
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale20);
        java.text.Format[] formatArray22 = extendedMessageFormat1.getFormats();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat4.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.lang.Object obj21 = extendedMessageFormat19.clone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat2.parse("hi!");
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat1.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale14);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.String str18 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray20 = extendedMessageFormat1.parse("hi!");
        extendedMessageFormat1.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray26 = extendedMessageFormat25.getFormatsByArgumentIndex();
        java.util.Locale locale27 = extendedMessageFormat25.getLocale();
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        java.util.Locale locale29 = extendedMessageFormat25.getLocale();
        java.text.Format[] formatArray30 = extendedMessageFormat25.getFormatsByArgumentIndex();
        extendedMessageFormat25.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (byte) 10, (java.text.Format) extendedMessageFormat25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale11);
        java.lang.String str13 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Locale locale18 = extendedMessageFormat16.getLocale();
        java.lang.Object[] objArray20 = extendedMessageFormat16.parse("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat16.getFormatsByArgumentIndex();
        extendedMessageFormat16.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat2.format((java.lang.Object) formatArray14);
        java.lang.Object[] objArray17 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.Object[] objArray23 = extendedMessageFormat20.parse("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat20.getFormats();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.lang.String str33 = extendedMessageFormat30.toPattern();
        java.text.Format[] formatArray34 = extendedMessageFormat30.getFormats();
        java.lang.String str35 = extendedMessageFormat30.toPattern();
        java.lang.String str36 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat39.applyPattern("");
        java.lang.String str42 = extendedMessageFormat39.toPattern();
        java.util.Locale locale43 = extendedMessageFormat39.getLocale();
        java.util.Locale locale44 = extendedMessageFormat39.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale44);
        extendedMessageFormat30.setLocale(locale44);
        extendedMessageFormat28.setLocale(locale44);
        extendedMessageFormat20.setLocale(locale44);
        java.util.Locale locale49 = extendedMessageFormat20.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat8.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.util.Locale locale15 = null;
        extendedMessageFormat13.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray18 = extendedMessageFormat13.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.lang.String str25 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray26 = extendedMessageFormat22.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.lang.String str32 = extendedMessageFormat29.toPattern();
        extendedMessageFormat29.applyPattern("");
        java.util.Locale locale35 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        extendedMessageFormat22.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str20 = java.text.MessageFormat.format("hi!", objArray19);
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        java.lang.String str22 = extendedMessageFormat14.format((java.lang.Object) objArray19);
        java.util.Locale locale23 = extendedMessageFormat14.getLocale();
        extendedMessageFormat9.setLocale(locale23);
        java.lang.Class<?> wildcardClass25 = extendedMessageFormat9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray10 = extendedMessageFormat2.parse("hi!");
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.lang.String str16 = extendedMessageFormat13.toPattern();
        extendedMessageFormat13.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        java.lang.String str22 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        extendedMessageFormat20.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str34 = java.text.MessageFormat.format("hi!", objArray33);
        java.lang.Class<?> wildcardClass35 = objArray33.getClass();
        java.lang.String str36 = extendedMessageFormat28.format((java.lang.Object) objArray33);
        java.util.Locale locale37 = extendedMessageFormat28.getLocale();
        extendedMessageFormat20.setLocale(locale37);
        java.text.Format[] formatArray39 = extendedMessageFormat20.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray43 = extendedMessageFormat42.getFormatsByArgumentIndex();
        java.util.Locale locale44 = extendedMessageFormat42.getLocale();
        java.util.Locale locale45 = extendedMessageFormat42.getLocale();
        java.util.Locale locale46 = extendedMessageFormat42.getLocale();
        java.text.Format[] formatArray47 = extendedMessageFormat42.getFormatsByArgumentIndex();
        java.util.Locale locale48 = extendedMessageFormat42.getLocale();
        java.util.Locale locale49 = extendedMessageFormat42.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        extendedMessageFormat20.setLocale(locale49);
        extendedMessageFormat13.setLocale(locale49);
        extendedMessageFormat2.setLocale(locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        java.lang.Object obj55 = extendedMessageFormat54.clone();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.String str21 = extendedMessageFormat20.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat20.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat27.applyPattern("");
        java.lang.String str30 = extendedMessageFormat27.toPattern();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.lang.String str36 = extendedMessageFormat33.toPattern();
        java.util.Locale locale37 = extendedMessageFormat33.getLocale();
        extendedMessageFormat27.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat20.setLocale(locale37);
        extendedMessageFormat2.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.lang.String str49 = extendedMessageFormat46.toPattern();
        java.util.Locale locale50 = extendedMessageFormat46.getLocale();
        java.lang.String str51 = extendedMessageFormat46.toPattern();
        java.text.Format[] formatArray52 = extendedMessageFormat46.getFormats();
        java.lang.String str53 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray52);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        extendedMessageFormat22.setLocale(locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        extendedMessageFormat14.setLocale(locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat9.setLocale(locale27);
        java.lang.String str34 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.lang.String str40 = extendedMessageFormat37.toPattern();
        extendedMessageFormat37.applyPattern("");
        java.util.Locale locale43 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale43);
        java.lang.String str45 = extendedMessageFormat44.toPattern();
        java.text.Format[] formatArray46 = extendedMessageFormat44.getFormatsByArgumentIndex();
        extendedMessageFormat44.applyPattern("");
        extendedMessageFormat44.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale56 = extendedMessageFormat55.getLocale();
        java.lang.String str57 = extendedMessageFormat55.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale60 = extendedMessageFormat59.getLocale();
        extendedMessageFormat55.setLocale(locale60);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale60);
        java.lang.String str65 = extendedMessageFormat64.toPattern();
        java.util.Locale locale66 = null;
        extendedMessageFormat64.setLocale(locale66);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat69 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray70 = extendedMessageFormat69.getFormatsByArgumentIndex();
        java.util.Locale locale71 = extendedMessageFormat69.getLocale();
        extendedMessageFormat64.setLocale(locale71);
        extendedMessageFormat44.setLocale(locale71);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator74 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        extendedMessageFormat9.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat6.setLocale(locale14);
        extendedMessageFormat6.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.lang.String str25 = extendedMessageFormat22.toPattern();
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale28 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        java.lang.String str30 = extendedMessageFormat29.toPattern();
        java.text.Format[] formatArray31 = extendedMessageFormat29.getFormatsByArgumentIndex();
        extendedMessageFormat29.applyPattern("");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat29.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = extendedMessageFormat6.formatToCharacterIterator((java.lang.Object) formatArray36);
        java.lang.String str38 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray36);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) objArray6);
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        extendedMessageFormat1.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.lang.String str29 = extendedMessageFormat26.toPattern();
        extendedMessageFormat26.applyPattern("");
        java.util.Locale locale32 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        extendedMessageFormat19.setLocale(locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        extendedMessageFormat35.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray41 = extendedMessageFormat40.getFormats();
        java.lang.Object obj42 = null;
        java.lang.String str43 = extendedMessageFormat40.format(obj42);
        java.lang.Object[] objArray45 = extendedMessageFormat40.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale48 = extendedMessageFormat47.getLocale();
        java.util.Locale locale49 = extendedMessageFormat47.getLocale();
        extendedMessageFormat40.setLocale(locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat35.setLocale(locale49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertArrayEquals(objArray45, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Locale locale15 = extendedMessageFormat13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat13.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        extendedMessageFormat14.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray21 = extendedMessageFormat14.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        extendedMessageFormat10.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = extendedMessageFormat20.parseObject("", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = extendedMessageFormat9.parseObject("hi!", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.util.Locale locale15 = null;
        extendedMessageFormat13.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        extendedMessageFormat13.setLocale(locale20);
        java.util.Locale locale22 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.lang.Object[] objArray27 = extendedMessageFormat24.parse("hi!");
        java.text.Format[] formatArray28 = extendedMessageFormat24.getFormats();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        extendedMessageFormat24.applyPattern("hi!");
        java.text.Format[] formatArray32 = extendedMessageFormat24.getFormats();
        java.text.Format[] formatArray33 = extendedMessageFormat24.getFormats();
        java.lang.String str34 = extendedMessageFormat13.format((java.lang.Object) formatArray33);
        java.text.Format[] formatArray35 = extendedMessageFormat13.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray39 = extendedMessageFormat38.getFormats();
        java.lang.Object obj40 = null;
        java.lang.String str41 = extendedMessageFormat38.format(obj40);
        java.lang.Object[] objArray43 = extendedMessageFormat38.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale46 = extendedMessageFormat45.getLocale();
        java.util.Locale locale47 = extendedMessageFormat45.getLocale();
        extendedMessageFormat38.setLocale(locale47);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        java.text.Format[] formatArray50 = extendedMessageFormat49.getFormats();
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer53 = extendedMessageFormat13.format((java.lang.Object[]) formatArray50, stringBuffer51, fieldPosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertArrayEquals(objArray43, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormatsByArgumentIndex();
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str16 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.lang.String str17 = extendedMessageFormat12.toPattern();
        java.lang.String str18 = extendedMessageFormat12.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.lang.String str24 = extendedMessageFormat21.toPattern();
        java.util.Locale locale25 = extendedMessageFormat21.getLocale();
        java.util.Locale locale26 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale26);
        extendedMessageFormat12.setLocale(locale26);
        extendedMessageFormat10.setLocale(locale26);
        extendedMessageFormat2.setLocale(locale26);
        java.util.Locale locale31 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        java.text.Format[] formatArray33 = extendedMessageFormat32.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("hi!");
        java.util.Locale locale12 = extendedMessageFormat7.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.lang.Object[] objArray20 = extendedMessageFormat17.parse("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat17.getFormats();
        java.util.Locale locale22 = extendedMessageFormat17.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat14.format((java.lang.Object[]) formatArray23, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat8.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat13.getLocale();
        java.lang.Object[] objArray17 = extendedMessageFormat13.parse("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat13.getFormatsByArgumentIndex();
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat13.getLocale();
        boolean boolean22 = extendedMessageFormat8.equals((java.lang.Object) extendedMessageFormat13);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        extendedMessageFormat15.setLocale(locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str29 = java.text.MessageFormat.format("hi!", objArray28);
        java.lang.Class<?> wildcardClass30 = objArray28.getClass();
        java.lang.String str31 = extendedMessageFormat23.format((java.lang.Object) objArray28);
        java.util.Locale locale32 = extendedMessageFormat23.getLocale();
        extendedMessageFormat15.setLocale(locale32);
        java.text.Format[] formatArray34 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.Format[] formatArray35 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray36 = extendedMessageFormat15.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatsByArgumentIndex(formatArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.String str21 = extendedMessageFormat20.toPattern();
        java.lang.Object[] objArray23 = extendedMessageFormat20.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = extendedMessageFormat17.formatToCharacterIterator((java.lang.Object) objArray23);
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        java.lang.Object obj26 = null;
        java.lang.String str27 = extendedMessageFormat17.format(obj26);
        extendedMessageFormat17.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat17.getFormats();
        java.lang.String str22 = extendedMessageFormat17.toPattern();
        java.lang.String str23 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat17.setLocale(locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.text.Format[] formatArray34 = extendedMessageFormat30.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormats(formatArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) objArray6);
        java.util.Locale locale10 = extendedMessageFormat1.getLocale();
        java.lang.String str11 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str14 = extendedMessageFormat1.toPattern();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat11.parse("hi!");
        java.lang.String str15 = java.text.MessageFormat.format("hi!", objArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) str15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("hi!");
        java.util.Locale locale13 = extendedMessageFormat8.getLocale();
        java.lang.Object[] objArray15 = extendedMessageFormat8.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.util.Locale locale21 = extendedMessageFormat17.getLocale();
        extendedMessageFormat8.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat24.getLocale();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Locale locale28 = extendedMessageFormat24.getLocale();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        extendedMessageFormat8.setLocale(locale29);
        extendedMessageFormat1.setLocale(locale29);
        java.text.ParsePosition parsePosition33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = extendedMessageFormat1.parseObject("hi!", parsePosition33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!");
        java.lang.String str10 = java.text.MessageFormat.format("hi!", objArray9);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.lang.String str19 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        extendedMessageFormat17.setLocale(locale22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray28 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.lang.String str29 = extendedMessageFormat27.toPattern();
        java.util.Locale locale30 = extendedMessageFormat27.getLocale();
        extendedMessageFormat25.setLocale(locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.text.Format[] formatArray36 = extendedMessageFormat32.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator37 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) extendedMessageFormat32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat2.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        extendedMessageFormat2.setLocale(locale18);
        java.util.Locale locale20 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray24 = extendedMessageFormat21.parse("", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat3.setLocale(locale16);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        java.lang.String str20 = extendedMessageFormat19.toPattern();
        java.util.Locale locale21 = extendedMessageFormat19.getLocale();
        extendedMessageFormat19.applyPattern("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat19.getFormats();
        java.lang.String str25 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale23 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        extendedMessageFormat10.setLocale(locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str35 = java.text.MessageFormat.format("hi!", objArray34);
        java.lang.Class<?> wildcardClass36 = objArray34.getClass();
        java.lang.String str37 = extendedMessageFormat29.format((java.lang.Object) objArray34);
        java.util.Locale locale38 = extendedMessageFormat29.getLocale();
        java.lang.String str39 = extendedMessageFormat29.toPattern();
        java.util.Locale locale40 = extendedMessageFormat29.getLocale();
        extendedMessageFormat27.setLocale(locale40);
        extendedMessageFormat1.setLocale(locale40);
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray20 = extendedMessageFormat14.parse("", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Locale locale10 = extendedMessageFormat6.getLocale();
        extendedMessageFormat1.setLocale(locale10);
        java.lang.String str12 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass13 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormatsByArgumentIndex();
        extendedMessageFormat9.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat9.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        extendedMessageFormat1.setLocale(locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        java.lang.String str21 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat15.getFormats();
        java.lang.String str23 = extendedMessageFormat1.format((java.lang.Object) formatArray22);
        java.util.Locale locale24 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.lang.String str30 = extendedMessageFormat28.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale33 = extendedMessageFormat32.getLocale();
        extendedMessageFormat28.setLocale(locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        extendedMessageFormat35.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        extendedMessageFormat16.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat28.applyPattern("");
        java.lang.String str31 = extendedMessageFormat28.toPattern();
        extendedMessageFormat28.applyPattern("");
        java.util.Locale locale34 = extendedMessageFormat28.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        java.lang.String str36 = extendedMessageFormat35.toPattern();
        java.lang.String str37 = extendedMessageFormat35.toPattern();
        java.lang.Object[] objArray39 = extendedMessageFormat35.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.lang.String str44 = extendedMessageFormat41.toPattern();
        java.text.Format[] formatArray45 = extendedMessageFormat41.getFormats();
        java.lang.String str46 = extendedMessageFormat41.toPattern();
        java.lang.String str47 = extendedMessageFormat41.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat50.applyPattern("");
        java.lang.String str53 = extendedMessageFormat50.toPattern();
        java.util.Locale locale54 = extendedMessageFormat50.getLocale();
        java.util.Locale locale55 = extendedMessageFormat50.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale55);
        extendedMessageFormat41.setLocale(locale55);
        java.text.Format[] formatArray58 = extendedMessageFormat41.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator59 = extendedMessageFormat35.formatToCharacterIterator((java.lang.Object) formatArray58);
        java.text.Format[] formatArray60 = extendedMessageFormat35.getFormats();
        java.lang.String str61 = extendedMessageFormat24.format((java.lang.Object) formatArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator62 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertArrayEquals(objArray39, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator59);
        org.junit.Assert.assertNotNull(formatArray60);
        org.junit.Assert.assertArrayEquals(formatArray60, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat1.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.util.Locale locale19 = extendedMessageFormat17.getLocale();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        java.util.Locale locale21 = extendedMessageFormat17.getLocale();
        java.util.Locale locale22 = extendedMessageFormat17.getLocale();
        extendedMessageFormat1.setLocale(locale22);
        java.text.Format[] formatArray24 = extendedMessageFormat1.getFormats();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale26);
        java.lang.String str28 = extendedMessageFormat27.toPattern();
        java.lang.Object[] objArray30 = extendedMessageFormat27.parse("hi!");
        java.util.Locale locale31 = extendedMessageFormat27.getLocale();
        java.text.Format[] formatArray32 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray33 = extendedMessageFormat27.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        extendedMessageFormat6.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat16.parse("hi!", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat(1, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        extendedMessageFormat9.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.util.Locale locale21 = extendedMessageFormat17.getLocale();
        extendedMessageFormat9.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        extendedMessageFormat9.setLocale(locale25);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        java.lang.String str33 = extendedMessageFormat32.toPattern();
        java.lang.Object[] objArray35 = extendedMessageFormat32.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = extendedMessageFormat29.formatToCharacterIterator((java.lang.Object) objArray35);
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) objArray35);
        java.lang.String str38 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.lang.String str44 = extendedMessageFormat41.toPattern();
        java.text.Format[] formatArray45 = extendedMessageFormat41.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat48.applyPattern("");
        java.lang.String str51 = extendedMessageFormat48.toPattern();
        extendedMessageFormat48.applyPattern("");
        java.util.Locale locale54 = extendedMessageFormat48.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale54);
        extendedMessageFormat41.setLocale(locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale54);
        java.text.Format[] formatArray58 = extendedMessageFormat57.getFormats();
        java.lang.String str59 = extendedMessageFormat9.format((java.lang.Object) formatArray58);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
        org.junit.Assert.assertNotNull(attributedCharacterIterator37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str8 = java.text.MessageFormat.format("hi!", objArray7);
        java.lang.Class<?> wildcardClass9 = objArray7.getClass();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) objArray7);
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray15 = extendedMessageFormat12.parse("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.lang.Object[] objArray20 = extendedMessageFormat17.parse("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat17.getFormats();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str32 = java.text.MessageFormat.format("hi!", objArray31);
        java.lang.String str33 = java.text.MessageFormat.format("", objArray31);
        java.lang.Class<?> wildcardClass34 = objArray31.getClass();
        java.lang.String str35 = extendedMessageFormat24.format((java.lang.Object) objArray31);
        java.util.Locale locale36 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray40 = extendedMessageFormat39.getFormatsByArgumentIndex();
        java.util.Locale locale41 = extendedMessageFormat39.getLocale();
        java.util.Locale locale42 = extendedMessageFormat39.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat24.setLocale(locale42);
        extendedMessageFormat17.setLocale(locale42);
        java.lang.String str46 = extendedMessageFormat17.toPattern();
        java.util.Locale locale47 = extendedMessageFormat17.getLocale();
        java.lang.Class<?> wildcardClass48 = extendedMessageFormat17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator49 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) wildcardClass48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class [Ljava.lang.Object; (java.lang.Class and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) objArray6);
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        extendedMessageFormat1.setLocale(locale15);
        java.util.Locale locale17 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = extendedMessageFormat1.parseObject("", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        extendedMessageFormat18.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.lang.String str27 = extendedMessageFormat24.toPattern();
        java.text.Format[] formatArray28 = extendedMessageFormat24.getFormats();
        java.lang.String str29 = extendedMessageFormat24.toPattern();
        java.lang.String str30 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.lang.String str36 = extendedMessageFormat33.toPattern();
        java.util.Locale locale37 = extendedMessageFormat33.getLocale();
        java.util.Locale locale38 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        extendedMessageFormat24.setLocale(locale38);
        extendedMessageFormat24.applyPattern("");
        java.util.Locale locale43 = extendedMessageFormat24.getLocale();
        extendedMessageFormat18.setLocale(locale43);
        java.lang.Object[] objArray46 = extendedMessageFormat18.parse("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertArrayEquals(objArray46, new java.lang.Object[] {});
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) 'a', (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat9.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat20.getLocale();
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        java.util.Locale locale24 = extendedMessageFormat20.getLocale();
        java.text.Format[] formatArray25 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat20.getLocale();
        java.lang.Object[] objArray28 = extendedMessageFormat20.parse("hi!");
        java.lang.String str29 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.lang.String str34 = extendedMessageFormat31.toPattern();
        extendedMessageFormat31.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale39 = extendedMessageFormat38.getLocale();
        java.lang.String str40 = extendedMessageFormat38.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale43 = extendedMessageFormat42.getLocale();
        extendedMessageFormat38.setLocale(locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str52 = java.text.MessageFormat.format("hi!", objArray51);
        java.lang.Class<?> wildcardClass53 = objArray51.getClass();
        java.lang.String str54 = extendedMessageFormat46.format((java.lang.Object) objArray51);
        java.util.Locale locale55 = extendedMessageFormat46.getLocale();
        extendedMessageFormat38.setLocale(locale55);
        java.text.Format[] formatArray57 = extendedMessageFormat38.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray61 = extendedMessageFormat60.getFormatsByArgumentIndex();
        java.util.Locale locale62 = extendedMessageFormat60.getLocale();
        java.util.Locale locale63 = extendedMessageFormat60.getLocale();
        java.util.Locale locale64 = extendedMessageFormat60.getLocale();
        java.text.Format[] formatArray65 = extendedMessageFormat60.getFormatsByArgumentIndex();
        java.util.Locale locale66 = extendedMessageFormat60.getLocale();
        java.util.Locale locale67 = extendedMessageFormat60.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale67);
        extendedMessageFormat38.setLocale(locale67);
        extendedMessageFormat31.setLocale(locale67);
        extendedMessageFormat20.setLocale(locale67);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat72 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale67);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormat(0, (java.text.Format) extendedMessageFormat72);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray61);
        org.junit.Assert.assertArrayEquals(formatArray61, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale17);
        java.util.Locale locale19 = extendedMessageFormat1.getLocale();
        java.lang.String str20 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.lang.Object[] objArray25 = extendedMessageFormat22.parse("hi!");
        java.text.Format[] formatArray26 = extendedMessageFormat22.getFormats();
        java.util.Locale locale27 = extendedMessageFormat22.getLocale();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.lang.String str35 = extendedMessageFormat32.toPattern();
        java.text.Format[] formatArray36 = extendedMessageFormat32.getFormats();
        java.lang.String str37 = extendedMessageFormat32.toPattern();
        java.lang.String str38 = extendedMessageFormat32.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.lang.String str44 = extendedMessageFormat41.toPattern();
        java.util.Locale locale45 = extendedMessageFormat41.getLocale();
        java.util.Locale locale46 = extendedMessageFormat41.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale46);
        extendedMessageFormat32.setLocale(locale46);
        extendedMessageFormat30.setLocale(locale46);
        extendedMessageFormat22.setLocale(locale46);
        java.util.Locale locale51 = extendedMessageFormat22.getLocale();
        java.lang.Object[] objArray53 = extendedMessageFormat22.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator54 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) objArray53);
        extendedMessageFormat1.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator54);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat13.applyPattern("hi!");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.util.Locale locale17 = extendedMessageFormat13.getLocale();
        java.lang.Object[] objArray19 = extendedMessageFormat13.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.lang.String str25 = extendedMessageFormat22.toPattern();
        java.util.Locale locale26 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        java.lang.String str32 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        extendedMessageFormat30.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat22.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        java.text.Format[] formatArray41 = extendedMessageFormat40.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.lang.String str47 = extendedMessageFormat44.toPattern();
        java.util.Locale locale48 = extendedMessageFormat44.getLocale();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        extendedMessageFormat40.setLocale(locale49);
        extendedMessageFormat13.setLocale(locale49);
        java.lang.String str53 = extendedMessageFormat13.toPattern();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.String str21 = extendedMessageFormat20.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat20.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat27.applyPattern("");
        java.lang.String str30 = extendedMessageFormat27.toPattern();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.lang.String str36 = extendedMessageFormat33.toPattern();
        java.util.Locale locale37 = extendedMessageFormat33.getLocale();
        extendedMessageFormat27.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat20.setLocale(locale37);
        extendedMessageFormat2.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale49 = extendedMessageFormat48.getLocale();
        java.lang.String str50 = extendedMessageFormat48.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale53 = extendedMessageFormat52.getLocale();
        extendedMessageFormat48.setLocale(locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        java.lang.String str58 = extendedMessageFormat57.toPattern();
        java.util.Locale locale59 = null;
        extendedMessageFormat57.setLocale(locale59);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray63 = extendedMessageFormat62.getFormatsByArgumentIndex();
        java.util.Locale locale64 = extendedMessageFormat62.getLocale();
        extendedMessageFormat57.setLocale(locale64);
        java.util.Locale locale66 = extendedMessageFormat57.getLocale();
        boolean boolean67 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat57);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(formatArray63);
        org.junit.Assert.assertArrayEquals(formatArray63, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat3.setLocale(locale16);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat21.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        extendedMessageFormat9.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.Object obj16 = extendedMessageFormat9.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale2);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.lang.Object[] objArray9 = extendedMessageFormat6.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator10 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) objArray9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale12 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        java.lang.Object[] objArray24 = extendedMessageFormat22.parse("hi!");
        java.util.Locale locale25 = extendedMessageFormat22.getLocale();
        extendedMessageFormat3.setLocale(locale25);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        java.lang.String str30 = extendedMessageFormat29.toPattern();
        java.lang.Object[] objArray32 = extendedMessageFormat29.parse("hi!");
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.lang.String str34 = extendedMessageFormat29.toPattern();
        java.text.Format[] formatArray35 = extendedMessageFormat29.getFormats();
        java.text.Format[] formatArray36 = extendedMessageFormat29.getFormats();
        extendedMessageFormat29.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.lang.String str44 = extendedMessageFormat41.toPattern();
        java.util.Locale locale45 = extendedMessageFormat41.getLocale();
        java.lang.String str46 = extendedMessageFormat41.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat49.applyPattern("");
        java.lang.String str52 = extendedMessageFormat49.toPattern();
        java.util.Locale locale53 = extendedMessageFormat49.getLocale();
        java.util.Locale locale54 = extendedMessageFormat49.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale54);
        extendedMessageFormat41.setLocale(locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale54);
        extendedMessageFormat29.setLocale(locale54);
        extendedMessageFormat3.setLocale(locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat2.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.lang.String str23 = extendedMessageFormat20.toPattern();
        java.text.Format[] formatArray24 = extendedMessageFormat20.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.lang.String str29 = extendedMessageFormat26.toPattern();
        java.util.Locale locale30 = extendedMessageFormat26.getLocale();
        extendedMessageFormat20.setLocale(locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale30);
        java.lang.String str34 = extendedMessageFormat33.toPattern();
        java.text.Format[] formatArray35 = extendedMessageFormat33.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat16.setFormats(formatArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        extendedMessageFormat5.setLocale(locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        extendedMessageFormat13.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.String str25 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray24);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str17 = java.text.MessageFormat.format("hi!", objArray16);
        java.lang.String str18 = java.text.MessageFormat.format("", objArray16);
        java.lang.Class<?> wildcardClass19 = objArray16.getClass();
        java.lang.String str20 = extendedMessageFormat9.format((java.lang.Object) objArray16);
        java.util.Locale locale21 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat24.getLocale();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        extendedMessageFormat9.setLocale(locale27);
        extendedMessageFormat2.setLocale(locale27);
        java.lang.String str31 = extendedMessageFormat2.toPattern();
        java.util.Locale locale32 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray33 = extendedMessageFormat2.getFormats();
        java.util.Locale locale34 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat9.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        extendedMessageFormat15.setLocale(locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat24.applyPattern("hi!");
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        boolean boolean28 = extendedMessageFormat2.equals((java.lang.Object) locale27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str16 = java.text.MessageFormat.format("hi!", objArray15);
        java.lang.Class<?> wildcardClass17 = objArray15.getClass();
        java.lang.String str18 = extendedMessageFormat10.format((java.lang.Object) objArray15);
        java.util.Locale locale19 = extendedMessageFormat10.getLocale();
        extendedMessageFormat2.setLocale(locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale24);
        java.lang.String str26 = extendedMessageFormat25.toPattern();
        java.lang.Object[] objArray28 = extendedMessageFormat25.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.lang.String str35 = extendedMessageFormat32.toPattern();
        java.text.Format[] formatArray36 = extendedMessageFormat32.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat39.applyPattern("");
        java.lang.String str42 = extendedMessageFormat39.toPattern();
        extendedMessageFormat39.applyPattern("");
        java.util.Locale locale45 = extendedMessageFormat39.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale45);
        extendedMessageFormat32.setLocale(locale45);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale45);
        java.util.Locale locale49 = extendedMessageFormat48.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat25.setLocale(locale49);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat21.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("hi!");
        java.util.Locale locale13 = extendedMessageFormat8.getLocale();
        java.lang.Object[] objArray15 = extendedMessageFormat8.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.util.Locale locale21 = extendedMessageFormat17.getLocale();
        extendedMessageFormat8.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat24.getLocale();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Locale locale28 = extendedMessageFormat24.getLocale();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        extendedMessageFormat8.setLocale(locale29);
        extendedMessageFormat1.setLocale(locale29);
        extendedMessageFormat1.applyPattern("");
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        extendedMessageFormat18.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat24.getLocale();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Locale locale28 = extendedMessageFormat24.getLocale();
        java.lang.Object[] objArray30 = extendedMessageFormat24.parse("hi!");
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer33 = extendedMessageFormat18.format((java.lang.Object) "hi!", stringBuffer31, fieldPosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[] {});
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.util.Locale locale15 = null;
        extendedMessageFormat13.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        extendedMessageFormat13.setLocale(locale20);
        java.util.Locale locale22 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = extendedMessageFormat13.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str8 = java.text.MessageFormat.format("hi!", objArray7);
        java.lang.Class<?> wildcardClass9 = objArray7.getClass();
        java.lang.String str10 = extendedMessageFormat1.format((java.lang.Object) objArray7);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat1.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.util.Locale locale15 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat1.setLocale(locale15);
        java.util.Locale locale18 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.lang.String str23 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray26 = extendedMessageFormat25.getFormatsByArgumentIndex();
        java.text.Format[] formatArray27 = extendedMessageFormat25.getFormatsByArgumentIndex();
        extendedMessageFormat25.applyPattern("hi!");
        java.util.Locale locale30 = extendedMessageFormat25.getLocale();
        java.lang.Object[] objArray32 = extendedMessageFormat25.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat34.applyPattern("");
        java.lang.String str37 = extendedMessageFormat34.toPattern();
        java.util.Locale locale38 = extendedMessageFormat34.getLocale();
        extendedMessageFormat25.setLocale(locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray42 = extendedMessageFormat41.getFormatsByArgumentIndex();
        java.util.Locale locale43 = extendedMessageFormat41.getLocale();
        java.util.Locale locale44 = extendedMessageFormat41.getLocale();
        java.util.Locale locale45 = extendedMessageFormat41.getLocale();
        java.util.Locale locale46 = extendedMessageFormat41.getLocale();
        extendedMessageFormat25.setLocale(locale46);
        extendedMessageFormat20.setLocale(locale46);
        extendedMessageFormat1.setLocale(locale46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormatsByArgumentIndex();
        extendedMessageFormat9.applyPattern("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        extendedMessageFormat3.setLocale(locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.lang.Object obj13 = extendedMessageFormat11.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat18.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        java.util.Locale locale25 = extendedMessageFormat22.getLocale();
        java.text.Format[] formatArray26 = extendedMessageFormat22.getFormatsByArgumentIndex();
        extendedMessageFormat22.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = extendedMessageFormat18.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat9.applyPattern("hi!");
        extendedMessageFormat9.applyPattern("");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat18.getFormats();
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.lang.Object obj22 = extendedMessageFormat18.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        extendedMessageFormat1.setLocale(locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        java.lang.String str21 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat15.getFormats();
        java.lang.String str23 = extendedMessageFormat1.format((java.lang.Object) formatArray22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        java.lang.Object obj28 = null;
        java.lang.String str29 = extendedMessageFormat26.format(obj28);
        java.lang.Object[] objArray31 = extendedMessageFormat26.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale34 = extendedMessageFormat33.getLocale();
        java.util.Locale locale35 = extendedMessageFormat33.getLocale();
        extendedMessageFormat26.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        java.text.Format[] formatArray38 = extendedMessageFormat37.getFormats();
        java.text.Format[] formatArray39 = extendedMessageFormat37.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat1.getFormats();
        java.util.Locale locale13 = extendedMessageFormat1.getLocale();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat9.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Locale locale22 = extendedMessageFormat18.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale24 = extendedMessageFormat18.getLocale();
        java.util.Locale locale25 = extendedMessageFormat18.getLocale();
        java.text.Format[] formatArray26 = extendedMessageFormat18.getFormats();
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = extendedMessageFormat9.format((java.lang.Object) extendedMessageFormat18, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        extendedMessageFormat12.setLocale(locale17);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = extendedMessageFormat19.parse("hi!", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        java.util.Locale locale10 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale11);
        java.lang.String str13 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat15.getFormats();
        java.lang.String str20 = extendedMessageFormat15.toPattern();
        java.lang.String str21 = extendedMessageFormat15.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.lang.String str27 = extendedMessageFormat24.toPattern();
        java.util.Locale locale28 = extendedMessageFormat24.getLocale();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        extendedMessageFormat15.setLocale(locale29);
        extendedMessageFormat1.setLocale(locale29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        java.lang.String str17 = extendedMessageFormat16.toPattern();
        java.lang.Object[] objArray19 = extendedMessageFormat16.parse("hi!");
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.lang.String str21 = extendedMessageFormat16.toPattern();
        java.lang.Object[] objArray23 = extendedMessageFormat16.parse("hi!");
        boolean boolean24 = extendedMessageFormat13.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        extendedMessageFormat6.setLocale(locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        extendedMessageFormat16.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale28 = extendedMessageFormat27.getLocale();
        java.lang.String str29 = extendedMessageFormat27.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale32 = extendedMessageFormat31.getLocale();
        extendedMessageFormat27.setLocale(locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        java.util.Locale locale37 = extendedMessageFormat36.getLocale();
        extendedMessageFormat16.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale44 = extendedMessageFormat43.getLocale();
        java.lang.String str45 = extendedMessageFormat43.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale48 = extendedMessageFormat47.getLocale();
        extendedMessageFormat43.setLocale(locale48);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray56 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str57 = java.text.MessageFormat.format("hi!", objArray56);
        java.lang.Class<?> wildcardClass58 = objArray56.getClass();
        java.lang.String str59 = extendedMessageFormat51.format((java.lang.Object) objArray56);
        java.util.Locale locale60 = extendedMessageFormat51.getLocale();
        extendedMessageFormat43.setLocale(locale60);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale60);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat39.setFormatByArgumentIndex((int) (short) 1, (java.text.Format) extendedMessageFormat62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat3.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale13);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = extendedMessageFormat16.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat13.applyPattern("hi!");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.util.Locale locale17 = extendedMessageFormat13.getLocale();
        java.lang.Object[] objArray19 = extendedMessageFormat13.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.lang.String str25 = extendedMessageFormat22.toPattern();
        java.util.Locale locale26 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        java.lang.String str32 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        extendedMessageFormat30.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat22.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        java.text.Format[] formatArray41 = extendedMessageFormat40.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.lang.String str47 = extendedMessageFormat44.toPattern();
        java.util.Locale locale48 = extendedMessageFormat44.getLocale();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        extendedMessageFormat40.setLocale(locale49);
        extendedMessageFormat13.setLocale(locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale58 = extendedMessageFormat57.getLocale();
        java.lang.String str59 = extendedMessageFormat57.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale62 = extendedMessageFormat61.getLocale();
        extendedMessageFormat57.setLocale(locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray68 = extendedMessageFormat67.getFormatsByArgumentIndex();
        java.lang.String str69 = extendedMessageFormat67.toPattern();
        java.util.Locale locale70 = extendedMessageFormat67.getLocale();
        extendedMessageFormat65.setLocale(locale70);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat72 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale70);
        extendedMessageFormat13.setLocale(locale70);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray68);
        org.junit.Assert.assertArrayEquals(formatArray68, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale22 = extendedMessageFormat16.getLocale();
        java.lang.String str23 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray24 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.lang.String str25 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray24);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormats(formatArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat15.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.lang.String str25 = extendedMessageFormat22.toPattern();
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale28 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        extendedMessageFormat15.setLocale(locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        java.lang.String str32 = extendedMessageFormat31.toPattern();
        java.text.Format[] formatArray33 = extendedMessageFormat31.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray37 = extendedMessageFormat36.getFormatsByArgumentIndex();
        java.util.Locale locale38 = extendedMessageFormat36.getLocale();
        java.util.Locale locale39 = extendedMessageFormat36.getLocale();
        java.util.Locale locale40 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale40);
        extendedMessageFormat31.setLocale(locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat47.applyPattern("");
        java.lang.String str50 = extendedMessageFormat47.toPattern();
        java.text.Format[] formatArray51 = extendedMessageFormat47.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat53.applyPattern("");
        java.lang.String str56 = extendedMessageFormat53.toPattern();
        java.util.Locale locale57 = extendedMessageFormat53.getLocale();
        extendedMessageFormat47.setLocale(locale57);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale57);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale57);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale57);
        extendedMessageFormat31.setLocale(locale57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = extendedMessageFormat9.format((java.lang.Object) locale57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.lang.Object obj3 = null;
        java.lang.String str4 = extendedMessageFormat1.format(obj3);
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str13 = java.text.MessageFormat.format("hi!", objArray12);
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        java.lang.String str15 = extendedMessageFormat7.format((java.lang.Object) objArray12);
        java.util.Locale locale16 = extendedMessageFormat7.getLocale();
        java.lang.String str17 = extendedMessageFormat7.toPattern();
        java.util.Locale locale18 = extendedMessageFormat7.getLocale();
        extendedMessageFormat1.setLocale(locale18);
        java.util.Locale locale20 = extendedMessageFormat1.getLocale();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        extendedMessageFormat7.setLocale(locale20);
        extendedMessageFormat7.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat7.toPattern();
        java.lang.Object[] objArray26 = extendedMessageFormat7.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) objArray6);
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        extendedMessageFormat12.applyPattern("hi!");
        java.util.Locale locale17 = extendedMessageFormat12.getLocale();
        java.lang.Object[] objArray19 = extendedMessageFormat12.parse("hi!");
        java.lang.String str20 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat12.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) objArray6);
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat1.getLocale();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        extendedMessageFormat5.setLocale(locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray17 = extendedMessageFormat15.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        java.lang.Object[] objArray22 = extendedMessageFormat18.parse("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat18.getFormatsByArgumentIndex();
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale26 = extendedMessageFormat18.getLocale();
        extendedMessageFormat1.setLocale(locale26);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale30 = extendedMessageFormat29.getLocale();
        java.lang.String str31 = extendedMessageFormat29.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale34 = extendedMessageFormat33.getLocale();
        extendedMessageFormat29.setLocale(locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.lang.String str40 = extendedMessageFormat37.toPattern();
        java.util.Locale locale41 = extendedMessageFormat37.getLocale();
        extendedMessageFormat29.setLocale(locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale45 = extendedMessageFormat44.getLocale();
        java.util.Locale locale46 = extendedMessageFormat44.getLocale();
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormatsByArgumentIndex();
        java.util.Locale locale48 = extendedMessageFormat44.getLocale();
        extendedMessageFormat29.setLocale(locale48);
        extendedMessageFormat1.setLocale(locale48);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat53.applyPattern("");
        java.lang.String str56 = extendedMessageFormat53.toPattern();
        java.text.Format[] formatArray57 = extendedMessageFormat53.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat59.applyPattern("");
        java.lang.String str62 = extendedMessageFormat59.toPattern();
        java.util.Locale locale63 = extendedMessageFormat59.getLocale();
        extendedMessageFormat53.setLocale(locale63);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        java.util.Locale locale66 = extendedMessageFormat65.getLocale();
        java.util.Locale locale67 = extendedMessageFormat65.getLocale();
        boolean boolean68 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat65);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str10 = java.text.MessageFormat.format("hi!", objArray9);
        java.lang.String str11 = java.text.MessageFormat.format("", objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        java.lang.String str13 = extendedMessageFormat2.format((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale20 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.lang.Object[] objArray23 = extendedMessageFormat21.parse("hi!");
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        extendedMessageFormat2.setLocale(locale24);
        java.text.Format[] formatArray26 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str27 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray30 = extendedMessageFormat29.getFormatsByArgumentIndex();
        java.lang.Object[] objArray32 = extendedMessageFormat29.parse("hi!");
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = extendedMessageFormat2.format(objArray32, stringBuffer33, fieldPosition34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat17.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat25.applyPattern("");
        java.lang.String str28 = extendedMessageFormat25.toPattern();
        extendedMessageFormat25.applyPattern("");
        java.util.Locale locale31 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        java.lang.Object[] objArray34 = extendedMessageFormat32.parse("hi!");
        java.util.Locale locale35 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat17.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat1.setLocale(locale35);
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat3.setLocale(locale16);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        java.util.Locale locale21 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str16 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.lang.Object[] objArray11 = extendedMessageFormat8.parse("hi!");
        java.lang.String str12 = extendedMessageFormat8.toPattern();
        java.lang.String str13 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat8.getFormats();
        extendedMessageFormat8.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.lang.String str23 = extendedMessageFormat20.toPattern();
        java.util.Locale locale24 = extendedMessageFormat20.getLocale();
        java.lang.String str25 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat28.applyPattern("");
        java.lang.String str31 = extendedMessageFormat28.toPattern();
        java.util.Locale locale32 = extendedMessageFormat28.getLocale();
        java.util.Locale locale33 = extendedMessageFormat28.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        extendedMessageFormat20.setLocale(locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        extendedMessageFormat8.setLocale(locale33);
        java.lang.Class<?> wildcardClass38 = locale33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator39 = extendedMessageFormat5.formatToCharacterIterator((java.lang.Object) locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.util.Locale locale15 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat1.setLocale(locale15);
        extendedMessageFormat1.applyPattern("");
        java.lang.String str20 = extendedMessageFormat1.toPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        extendedMessageFormat10.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.util.Locale locale22 = extendedMessageFormat18.getLocale();
        extendedMessageFormat10.setLocale(locale22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        extendedMessageFormat10.setLocale(locale26);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        java.lang.String str34 = extendedMessageFormat33.toPattern();
        java.lang.Object[] objArray36 = extendedMessageFormat33.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = extendedMessageFormat30.formatToCharacterIterator((java.lang.Object) objArray36);
        java.text.AttributedCharacterIterator attributedCharacterIterator38 = extendedMessageFormat10.formatToCharacterIterator((java.lang.Object) objArray36);
        java.text.Format[] formatArray39 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray40 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator37);
        org.junit.Assert.assertNotNull(attributedCharacterIterator38);
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat13.applyPattern("hi!");
        extendedMessageFormat13.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Locale locale8 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat4.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        extendedMessageFormat14.setLocale(locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat21.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat21.toPattern();
        java.util.Locale locale25 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = extendedMessageFormat1.format((java.lang.Object) formatArray27, stringBuffer28, fieldPosition29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        extendedMessageFormat5.setLocale(locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat14.applyPattern("hi!");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = extendedMessageFormat19.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.lang.String str29 = extendedMessageFormat26.toPattern();
        extendedMessageFormat26.applyPattern("");
        java.util.Locale locale32 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        extendedMessageFormat19.setLocale(locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatByArgumentIndex((int) (short) 1, (java.text.Format) extendedMessageFormat37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.util.Locale locale22 = extendedMessageFormat18.getLocale();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        extendedMessageFormat10.setLocale(locale23);
        extendedMessageFormat1.setLocale(locale23);
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = extendedMessageFormat1.parse("hi!", parsePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat4.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = extendedMessageFormat18.parseObject("", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat5.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat27.applyPattern("");
        java.lang.String str30 = extendedMessageFormat27.toPattern();
        java.util.Locale locale31 = extendedMessageFormat27.getLocale();
        java.util.Locale locale32 = extendedMessageFormat27.getLocale();
        extendedMessageFormat27.applyPattern("");
        extendedMessageFormat27.applyPattern("hi!");
        java.text.Format[] formatArray37 = extendedMessageFormat27.getFormats();
        java.lang.String str38 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray37);
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer41 = extendedMessageFormat24.format((java.lang.Object[]) formatArray37, stringBuffer39, fieldPosition40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        extendedMessageFormat3.setLocale(locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        extendedMessageFormat11.setLocale(locale16);
        extendedMessageFormat11.applyPattern("");
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = extendedMessageFormat11.parseObject("hi!", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.util.Locale locale22 = extendedMessageFormat18.getLocale();
        extendedMessageFormat12.setLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat(0, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        extendedMessageFormat6.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        java.lang.String str17 = extendedMessageFormat16.toPattern();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.lang.Object[] objArray17 = extendedMessageFormat14.parse("hi!");
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        java.lang.Object[] objArray20 = extendedMessageFormat14.parse("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat14.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 0, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        extendedMessageFormat6.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.lang.String str23 = extendedMessageFormat20.toPattern();
        java.util.Locale locale24 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.lang.String str30 = extendedMessageFormat28.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale33 = extendedMessageFormat32.getLocale();
        extendedMessageFormat28.setLocale(locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        extendedMessageFormat20.setLocale(locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        java.text.Format[] formatArray39 = extendedMessageFormat38.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat42.applyPattern("");
        java.lang.String str45 = extendedMessageFormat42.toPattern();
        extendedMessageFormat42.applyPattern("");
        java.util.Locale locale48 = extendedMessageFormat42.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale48);
        java.lang.Object[] objArray51 = extendedMessageFormat49.parse("hi!");
        java.lang.String str52 = extendedMessageFormat38.format((java.lang.Object) objArray51);
        boolean boolean53 = extendedMessageFormat16.equals((java.lang.Object) str52);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertArrayEquals(objArray51, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale14);
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        java.lang.String str22 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        extendedMessageFormat20.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat27.applyPattern("hi!");
        java.util.Locale locale30 = extendedMessageFormat27.getLocale();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale12 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormats();
        java.lang.String str14 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        extendedMessageFormat5.setLocale(locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Locale locale19 = extendedMessageFormat17.getLocale();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        extendedMessageFormat15.setLocale(locale20);
        java.lang.String str22 = extendedMessageFormat15.toPattern();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.util.Locale locale21 = extendedMessageFormat17.getLocale();
        extendedMessageFormat11.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat4.setLocale(locale21);
        extendedMessageFormat4.applyPattern("");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.lang.Object[] objArray8 = extendedMessageFormat4.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.lang.String str15 = extendedMessageFormat10.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.util.Locale locale22 = extendedMessageFormat18.getLocale();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        extendedMessageFormat10.setLocale(locale23);
        extendedMessageFormat10.applyPattern("hi!");
        java.text.Format[] formatArray28 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormats(formatArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        extendedMessageFormat8.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat5.setLocale(locale13);
        extendedMessageFormat5.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.lang.String str24 = extendedMessageFormat21.toPattern();
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale27 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        java.lang.String str29 = extendedMessageFormat28.toPattern();
        java.text.Format[] formatArray30 = extendedMessageFormat28.getFormatsByArgumentIndex();
        extendedMessageFormat28.applyPattern("");
        extendedMessageFormat28.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat28.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = extendedMessageFormat5.formatToCharacterIterator((java.lang.Object) formatArray35);
        java.text.ParsePosition parsePosition38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = extendedMessageFormat5.parseObject("", parsePosition38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale17);
        java.util.Locale locale19 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray20 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.lang.String str27 = extendedMessageFormat24.toPattern();
        extendedMessageFormat24.applyPattern("");
        java.util.Locale locale30 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat32.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat5.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = extendedMessageFormat24.parse("", parsePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat14.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.util.Locale locale8 = extendedMessageFormat4.getLocale();
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        extendedMessageFormat4.applyPattern("");
        java.lang.String str12 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat4.getFormats();
        java.lang.String str14 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        java.lang.String str15 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        java.lang.String str16 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str20 = java.text.MessageFormat.format("hi!", objArray19);
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        java.lang.String str22 = extendedMessageFormat14.format((java.lang.Object) objArray19);
        java.util.Locale locale23 = extendedMessageFormat14.getLocale();
        extendedMessageFormat9.setLocale(locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale30 = extendedMessageFormat29.getLocale();
        java.lang.String str31 = extendedMessageFormat29.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale34 = extendedMessageFormat33.getLocale();
        extendedMessageFormat29.setLocale(locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        extendedMessageFormat38.applyPattern("hi!");
        java.util.Locale locale41 = extendedMessageFormat38.getLocale();
        java.util.Locale locale42 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale46 = extendedMessageFormat45.getLocale();
        java.util.Locale locale47 = extendedMessageFormat45.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale47);
        extendedMessageFormat38.setLocale(locale47);
        extendedMessageFormat9.setLocale(locale47);
        extendedMessageFormat9.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray54 = extendedMessageFormat9.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat2.format((java.lang.Object) formatArray14);
        java.lang.Object[] objArray17 = extendedMessageFormat2.parse("hi!");
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.util.Locale locale8 = extendedMessageFormat1.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray15 = extendedMessageFormat12.parse("hi!");
        java.lang.String str16 = java.text.MessageFormat.format("hi!", objArray15);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat1.format((java.lang.Object) str16, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat1.format((java.lang.Object) formatArray9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str19 = java.text.MessageFormat.format("hi!", objArray18);
        java.lang.Class<?> wildcardClass20 = objArray18.getClass();
        java.lang.String str21 = extendedMessageFormat13.format((java.lang.Object) objArray18);
        java.text.Format[] formatArray22 = extendedMessageFormat13.getFormats();
        java.lang.String str23 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray22);
        java.lang.Class<?> wildcardClass24 = formatArray22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = extendedMessageFormat1.format((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.Object obj8 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        extendedMessageFormat4.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        extendedMessageFormat12.setLocale(locale17);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        java.lang.Object obj20 = extendedMessageFormat19.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale17);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        java.lang.Object[] objArray27 = extendedMessageFormat24.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = extendedMessageFormat21.formatToCharacterIterator((java.lang.Object) objArray27);
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) objArray27);
        java.lang.String str30 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray31 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray34 = extendedMessageFormat1.parse("hi!", parsePosition33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator28);
        org.junit.Assert.assertNotNull(attributedCharacterIterator29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str10 = java.text.MessageFormat.format("hi!", objArray9);
        java.lang.String str11 = java.text.MessageFormat.format("", objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        java.lang.String str13 = extendedMessageFormat2.format((java.lang.Object) objArray9);
        java.lang.String str14 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat1.format(obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.lang.Object[] objArray14 = extendedMessageFormat9.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        java.lang.Object obj18 = null;
        java.lang.String str19 = extendedMessageFormat16.format(obj18);
        java.lang.Object[] objArray21 = extendedMessageFormat16.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.util.Locale locale25 = extendedMessageFormat23.getLocale();
        extendedMessageFormat16.setLocale(locale25);
        extendedMessageFormat9.setLocale(locale25);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.lang.Object[] objArray7 = extendedMessageFormat4.parse("hi!");
        java.util.Locale locale8 = extendedMessageFormat4.getLocale();
        java.lang.Object[] objArray10 = extendedMessageFormat4.parse("hi!");
        boolean boolean11 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str16 = java.text.MessageFormat.format("hi!", objArray15);
        java.lang.Class<?> wildcardClass17 = objArray15.getClass();
        java.lang.String str18 = extendedMessageFormat10.format((java.lang.Object) objArray15);
        java.util.Locale locale19 = extendedMessageFormat10.getLocale();
        extendedMessageFormat2.setLocale(locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        java.lang.Object obj23 = null;
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat21.format(obj23, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat16.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatsByArgumentIndex(formatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str7 = java.text.MessageFormat.format("hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        java.lang.String str9 = extendedMessageFormat1.format((java.lang.Object) objArray6);
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        extendedMessageFormat1.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat1.getFormats();
        java.lang.String str18 = extendedMessageFormat1.toPattern();
        java.lang.Object obj19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat1.format(obj19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormats();
        java.lang.String str21 = extendedMessageFormat16.toPattern();
        java.lang.String str22 = extendedMessageFormat16.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat25.applyPattern("");
        java.lang.String str28 = extendedMessageFormat25.toPattern();
        java.util.Locale locale29 = extendedMessageFormat25.getLocale();
        java.util.Locale locale30 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale30);
        extendedMessageFormat16.setLocale(locale30);
        extendedMessageFormat14.setLocale(locale30);
        java.lang.String str34 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray35 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str36 = extendedMessageFormat1.format((java.lang.Object) formatArray35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.lang.Object obj11 = null;
        java.lang.String str12 = extendedMessageFormat2.format(obj11);
        java.util.Locale locale13 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        extendedMessageFormat13.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat20.applyPattern("hi!");
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        java.text.Format[] formatArray24 = extendedMessageFormat20.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat9.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat18.getFormats();
        java.lang.String str23 = extendedMessageFormat18.toPattern();
        java.lang.Object[] objArray24 = new java.lang.Object[] { extendedMessageFormat18 };
        java.lang.String str25 = java.text.MessageFormat.format("", objArray24);
        java.lang.String str26 = java.text.MessageFormat.format("hi!", objArray24);
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = extendedMessageFormat9.format(objArray24, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str10 = java.text.MessageFormat.format("hi!", objArray9);
        java.lang.String str11 = java.text.MessageFormat.format("", objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        java.lang.String str13 = extendedMessageFormat2.format((java.lang.Object) objArray9);
        java.lang.Object[] objArray15 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        extendedMessageFormat19.applyPattern("");
        java.util.Locale locale25 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator33 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator31);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str22 = java.text.MessageFormat.format("hi!", objArray21);
        java.lang.String str23 = java.text.MessageFormat.format("", objArray21);
        java.lang.Class<?> wildcardClass24 = objArray21.getClass();
        java.lang.String str25 = extendedMessageFormat14.format((java.lang.Object) objArray21);
        java.lang.String str26 = extendedMessageFormat11.format((java.lang.Object) objArray21);
        java.lang.String str27 = extendedMessageFormat11.toPattern();
        java.lang.Object obj28 = extendedMessageFormat11.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale23 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        java.text.Format[] formatArray26 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.lang.String str27 = extendedMessageFormat24.toPattern();
        java.text.Format[] formatArray28 = extendedMessageFormat24.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("hi!");
        java.util.Locale locale12 = extendedMessageFormat7.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.Object obj12 = extendedMessageFormat9.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat18.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat23.getFormats();
        java.lang.Object obj25 = null;
        java.lang.String str26 = extendedMessageFormat23.format(obj25);
        java.lang.Object[] objArray28 = extendedMessageFormat23.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        java.util.Locale locale32 = extendedMessageFormat30.getLocale();
        extendedMessageFormat23.setLocale(locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        extendedMessageFormat18.setLocale(locale32);
        java.text.Format[] formatArray36 = extendedMessageFormat18.getFormats();
        java.lang.Object obj37 = extendedMessageFormat18.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat11.parse("hi!");
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        java.lang.String str16 = extendedMessageFormat11.toPattern();
        java.lang.Object[] objArray18 = extendedMessageFormat11.parse("hi!");
        java.util.Locale locale19 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray20 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat5.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat27.applyPattern("");
        java.lang.String str30 = extendedMessageFormat27.toPattern();
        extendedMessageFormat27.applyPattern("");
        java.util.Locale locale33 = extendedMessageFormat27.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        java.lang.Object[] objArray36 = extendedMessageFormat34.parse("hi!");
        java.util.Locale locale37 = extendedMessageFormat34.getLocale();
        boolean boolean38 = extendedMessageFormat24.equals((java.lang.Object) locale37);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object obj8 = null;
        java.lang.String str9 = extendedMessageFormat1.format(obj8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat18.applyPattern("");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.lang.Class<?> wildcardClass22 = extendedMessageFormat18.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale11);
        java.util.Locale locale13 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        extendedMessageFormat1.setLocale(locale16);
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray20 = extendedMessageFormat1.parse("", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray5 = extendedMessageFormat1.parse("hi!");
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        java.util.Locale locale13 = extendedMessageFormat8.getLocale();
        extendedMessageFormat8.applyPattern("");
        extendedMessageFormat8.applyPattern("hi!");
        java.util.Locale locale18 = extendedMessageFormat8.getLocale();
        extendedMessageFormat1.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.lang.String str25 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray26 = extendedMessageFormat22.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.lang.String str32 = extendedMessageFormat29.toPattern();
        extendedMessageFormat29.applyPattern("");
        java.util.Locale locale35 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        extendedMessageFormat22.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat38.applyPattern("");
        java.lang.String str41 = extendedMessageFormat38.toPattern();
        java.util.Locale locale42 = extendedMessageFormat38.getLocale();
        extendedMessageFormat1.setLocale(locale42);
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("hi!");
        extendedMessageFormat17.applyPattern("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormats();
        boolean boolean24 = extendedMessageFormat11.equals((java.lang.Object) extendedMessageFormat17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat1.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.lang.String str29 = extendedMessageFormat26.toPattern();
        extendedMessageFormat26.applyPattern("");
        java.util.Locale locale32 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        extendedMessageFormat19.setLocale(locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        java.text.Format[] formatArray36 = extendedMessageFormat35.getFormats();
        java.util.Locale locale37 = extendedMessageFormat35.getLocale();
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.lang.Object[] objArray7 = extendedMessageFormat4.parse("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str19 = java.text.MessageFormat.format("hi!", objArray18);
        java.lang.String str20 = java.text.MessageFormat.format("", objArray18);
        java.lang.Class<?> wildcardClass21 = objArray18.getClass();
        java.lang.String str22 = extendedMessageFormat11.format((java.lang.Object) objArray18);
        java.util.Locale locale23 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormatsByArgumentIndex();
        java.util.Locale locale28 = extendedMessageFormat26.getLocale();
        java.util.Locale locale29 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat11.setLocale(locale29);
        extendedMessageFormat4.setLocale(locale29);
        java.lang.String str33 = extendedMessageFormat4.toPattern();
        java.util.Locale locale34 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale39 = extendedMessageFormat38.getLocale();
        java.lang.String str40 = extendedMessageFormat38.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale43 = extendedMessageFormat42.getLocale();
        extendedMessageFormat38.setLocale(locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.lang.String str49 = extendedMessageFormat46.toPattern();
        java.util.Locale locale50 = extendedMessageFormat46.getLocale();
        extendedMessageFormat38.setLocale(locale50);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale54 = extendedMessageFormat53.getLocale();
        extendedMessageFormat38.setLocale(locale54);
        java.lang.Class<?> wildcardClass56 = extendedMessageFormat38.getClass();
        java.lang.StringBuffer stringBuffer57 = null;
        java.text.FieldPosition fieldPosition58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer59 = extendedMessageFormat36.format((java.lang.Object) wildcardClass56, stringBuffer57, fieldPosition58);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale17);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        java.lang.Object[] objArray27 = extendedMessageFormat24.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = extendedMessageFormat21.formatToCharacterIterator((java.lang.Object) objArray27);
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) objArray27);
        java.text.Format[] formatArray30 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = extendedMessageFormat1.parse("", parsePosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator28);
        org.junit.Assert.assertNotNull(attributedCharacterIterator29);
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale17);
        java.util.Locale locale19 = extendedMessageFormat1.getLocale();
        java.lang.String str20 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.lang.Object[] objArray25 = extendedMessageFormat22.parse("hi!");
        java.text.Format[] formatArray26 = extendedMessageFormat22.getFormats();
        java.util.Locale locale27 = extendedMessageFormat22.getLocale();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.lang.String str35 = extendedMessageFormat32.toPattern();
        java.text.Format[] formatArray36 = extendedMessageFormat32.getFormats();
        java.lang.String str37 = extendedMessageFormat32.toPattern();
        java.lang.String str38 = extendedMessageFormat32.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.lang.String str44 = extendedMessageFormat41.toPattern();
        java.util.Locale locale45 = extendedMessageFormat41.getLocale();
        java.util.Locale locale46 = extendedMessageFormat41.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale46);
        extendedMessageFormat32.setLocale(locale46);
        extendedMessageFormat30.setLocale(locale46);
        extendedMessageFormat22.setLocale(locale46);
        java.util.Locale locale51 = extendedMessageFormat22.getLocale();
        java.lang.Object[] objArray53 = extendedMessageFormat22.parse("hi!");
        java.text.AttributedCharacterIterator attributedCharacterIterator54 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) objArray53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat57.applyPattern("");
        java.lang.String str60 = extendedMessageFormat57.toPattern();
        extendedMessageFormat57.applyPattern("");
        java.util.Locale locale63 = extendedMessageFormat57.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale63);
        java.lang.Object[] objArray66 = extendedMessageFormat64.parse("hi!");
        java.lang.StringBuffer stringBuffer67 = null;
        java.text.FieldPosition fieldPosition68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer69 = extendedMessageFormat1.format((java.lang.Object) "hi!", stringBuffer67, fieldPosition68);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator54);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertArrayEquals(objArray66, new java.lang.Object[] {});
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.lang.String str16 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.util.Locale locale23 = extendedMessageFormat19.getLocale();
        extendedMessageFormat13.setLocale(locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        java.text.Format[] formatArray28 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray29 = extendedMessageFormat27.getFormats();
        java.lang.String str30 = extendedMessageFormat8.format((java.lang.Object) formatArray29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.lang.String str35 = extendedMessageFormat32.toPattern();
        java.util.Locale locale36 = extendedMessageFormat32.getLocale();
        java.lang.String str37 = extendedMessageFormat32.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat40.applyPattern("");
        java.lang.String str43 = extendedMessageFormat40.toPattern();
        java.util.Locale locale44 = extendedMessageFormat40.getLocale();
        java.util.Locale locale45 = extendedMessageFormat40.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale45);
        extendedMessageFormat32.setLocale(locale45);
        extendedMessageFormat32.applyPattern("hi!");
        java.text.Format[] formatArray50 = extendedMessageFormat32.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormats(formatArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        java.util.Locale locale10 = extendedMessageFormat6.getLocale();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.util.Locale locale20 = extendedMessageFormat16.getLocale();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        extendedMessageFormat2.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.lang.String str32 = extendedMessageFormat29.toPattern();
        java.text.Format[] formatArray33 = extendedMessageFormat29.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.lang.String str38 = extendedMessageFormat35.toPattern();
        java.util.Locale locale39 = extendedMessageFormat35.getLocale();
        extendedMessageFormat29.setLocale(locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale39);
        java.lang.String str43 = extendedMessageFormat42.toPattern();
        java.text.Format[] formatArray44 = extendedMessageFormat42.getFormatsByArgumentIndex();
        java.lang.String str45 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray44);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        extendedMessageFormat6.setLocale(locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        extendedMessageFormat16.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.lang.String str24 = extendedMessageFormat21.toPattern();
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale27 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        java.lang.Object[] objArray30 = extendedMessageFormat28.parse("hi!");
        java.util.Locale locale31 = extendedMessageFormat28.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str39 = java.text.MessageFormat.format("hi!", objArray38);
        java.lang.Class<?> wildcardClass40 = objArray38.getClass();
        java.lang.String str41 = extendedMessageFormat33.format((java.lang.Object) objArray38);
        java.util.Locale locale42 = extendedMessageFormat33.getLocale();
        extendedMessageFormat28.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        java.lang.StringBuffer stringBuffer45 = null;
        java.text.FieldPosition fieldPosition46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer47 = extendedMessageFormat14.format((java.lang.Object) extendedMessageFormat44, stringBuffer45, fieldPosition46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.Class<?> wildcardClass18 = formatArray17.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Locale locale11 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale11);
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat1.parse("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat1.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str15 = java.text.MessageFormat.format("hi!", objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        java.lang.String str17 = extendedMessageFormat9.format((java.lang.Object) objArray14);
        java.util.Locale locale18 = extendedMessageFormat9.getLocale();
        extendedMessageFormat1.setLocale(locale18);
        java.text.Format[] formatArray20 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray21 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray22 = extendedMessageFormat1.getFormats();
        java.util.Locale locale23 = extendedMessageFormat1.getLocale();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale6);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.util.Locale locale20 = extendedMessageFormat16.getLocale();
        extendedMessageFormat10.setLocale(locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat6.setFormat(100, (java.text.Format) extendedMessageFormat22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat13.getLocale();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.util.Locale locale17 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale19 = extendedMessageFormat13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        extendedMessageFormat6.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray16);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray5 = extendedMessageFormat1.parse("hi!");
        java.lang.String str6 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        java.util.Locale locale13 = extendedMessageFormat8.getLocale();
        extendedMessageFormat8.applyPattern("");
        extendedMessageFormat8.applyPattern("hi!");
        java.util.Locale locale18 = extendedMessageFormat8.getLocale();
        extendedMessageFormat1.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.lang.String str25 = extendedMessageFormat22.toPattern();
        java.util.Locale locale26 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        java.lang.String str32 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        extendedMessageFormat30.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat22.setLocale(locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        java.text.Format[] formatArray41 = extendedMessageFormat40.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.lang.String str47 = extendedMessageFormat44.toPattern();
        extendedMessageFormat44.applyPattern("");
        java.util.Locale locale50 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale50);
        java.lang.Object[] objArray53 = extendedMessageFormat51.parse("hi!");
        java.lang.String str54 = extendedMessageFormat40.format((java.lang.Object) objArray53);
        java.text.Format[] formatArray55 = extendedMessageFormat40.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale4);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat5.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.lang.String str23 = extendedMessageFormat20.toPattern();
        extendedMessageFormat20.applyPattern("");
        java.util.Locale locale26 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale26);
        java.lang.Object[] objArray29 = extendedMessageFormat27.parse("hi!");
        java.util.Locale locale30 = extendedMessageFormat27.getLocale();
        extendedMessageFormat27.applyPattern("hi!");
        java.lang.Object[] objArray34 = extendedMessageFormat27.parse("hi!");
        java.util.Locale locale35 = extendedMessageFormat27.getLocale();
        extendedMessageFormat14.setLocale(locale35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat4.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = extendedMessageFormat18.parseObject("hi!", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("");
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormats();
        java.lang.String str16 = extendedMessageFormat11.toPattern();
        java.lang.String str17 = extendedMessageFormat11.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.lang.String str23 = extendedMessageFormat20.toPattern();
        java.util.Locale locale24 = extendedMessageFormat20.getLocale();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        extendedMessageFormat11.setLocale(locale25);
        extendedMessageFormat9.setLocale(locale25);
        extendedMessageFormat1.setLocale(locale25);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        java.lang.String str34 = extendedMessageFormat33.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (short) -1, (java.text.Format) extendedMessageFormat33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        extendedMessageFormat11.setLocale(locale16);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat20.applyPattern("hi!");
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        java.util.Locale locale24 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale28 = extendedMessageFormat27.getLocale();
        java.util.Locale locale29 = extendedMessageFormat27.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        extendedMessageFormat20.setLocale(locale29);
        extendedMessageFormat5.setLocale(locale29);
        java.text.ParsePosition parsePosition34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = extendedMessageFormat5.parse("", parsePosition34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Locale locale10 = extendedMessageFormat6.getLocale();
        extendedMessageFormat1.setLocale(locale10);
        java.lang.String str12 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat1.parse("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Locale locale12 = extendedMessageFormat10.getLocale();
        extendedMessageFormat2.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.util.Locale locale20 = extendedMessageFormat16.getLocale();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        java.lang.String str22 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat14.setFormatsByArgumentIndex(formatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat2.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        extendedMessageFormat18.applyPattern("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
        java.lang.String str10 = extendedMessageFormat1.toPattern();
        java.lang.String str11 = extendedMessageFormat1.toPattern();
        java.lang.String str12 = extendedMessageFormat1.toPattern();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat4.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        extendedMessageFormat2.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.lang.Class<?> wildcardClass17 = locale14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.lang.Object[] objArray14 = extendedMessageFormat9.parse("hi!");
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray17 = extendedMessageFormat9.parse("", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat9.parseObject("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        extendedMessageFormat4.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        extendedMessageFormat22.setLocale(locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.lang.String str33 = extendedMessageFormat30.toPattern();
        java.util.Locale locale34 = extendedMessageFormat30.getLocale();
        extendedMessageFormat22.setLocale(locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat16.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.util.Locale locale16 = extendedMessageFormat12.getLocale();
        java.util.Locale locale17 = extendedMessageFormat12.getLocale();
        extendedMessageFormat12.applyPattern("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat12.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator22 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) formatArray21);
        java.lang.String str23 = extendedMessageFormat9.toPattern();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }
}

