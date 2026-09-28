package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean13 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 1L);
        java.lang.String str5 = cSVRecord4.getComment();
        int int6 = cSVRecord4.size();
        long long7 = cSVRecord4.getRecordNumber();
        boolean boolean9 = cSVRecord4.isSet("[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str15 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "hi!", (long) (short) 1);
        java.lang.String str25 = cSVRecord24.toString();
        java.lang.String[] strArray26 = cSVRecord24.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27, "[hi!, , hi!, hi!, , hi!]", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray26, strMap31, "[]", (long) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str25, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isMapped("");
        java.lang.String str17 = cSVRecord10.get(0);
        int int18 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        long long18 = cSVRecord14.getRecordNumber();
        long long19 = cSVRecord14.getRecordNumber();
        long long20 = cSVRecord14.getRecordNumber();
        java.lang.String[] strArray21 = cSVRecord14.values();
        boolean boolean22 = cSVRecord14.isConsistent();
        boolean boolean24 = cSVRecord14.isSet("[]");
        java.lang.Class<?> wildcardClass25 = cSVRecord14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.toString();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) 100);
        boolean boolean22 = cSVRecord20.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord20.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord20.spliterator();
        boolean boolean26 = cSVRecord20.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("");
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        boolean boolean24 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        boolean boolean26 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) 0);
        java.lang.String str18 = cSVRecord17.getComment();
        java.lang.String[] strArray19 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) (byte) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        long long18 = cSVRecord14.getRecordNumber();
        long long19 = cSVRecord14.getRecordNumber();
        long long20 = cSVRecord14.getRecordNumber();
        java.lang.String[] strArray21 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", 0L);
        java.lang.String str26 = cSVRecord25.getComment();
        int int27 = cSVRecord25.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str19 = cSVRecord14.get((int) (byte) 1);
        long long20 = cSVRecord14.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord14.spliterator();
        boolean boolean23 = cSVRecord14.isSet("");
        int int24 = cSVRecord14.size();
        boolean boolean25 = cSVRecord14.isConsistent();
        java.lang.String[] strArray26 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.lang.String str13 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        java.lang.String[] strArray19 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", (long) '#');
        int int24 = cSVRecord23.size();
        boolean boolean25 = cSVRecord23.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 1L);
        java.lang.String str5 = cSVRecord4.getComment();
        int int6 = cSVRecord4.size();
        java.lang.String str7 = cSVRecord4.getComment();
        java.lang.String[] strArray8 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "[hi!, , hi!, hi!, , hi!]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "", (long) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord16.get("[hi!, , hi!, hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str14 = cSVRecord10.get(0);
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord10.spliterator();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean15 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        int int21 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "[hi!, , hi!, hi!, , hi!]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) 10);
        long long21 = cSVRecord20.getRecordNumber();
        boolean boolean22 = cSVRecord20.isConsistent();
        long long23 = cSVRecord20.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, , hi!, hi!, , hi!]", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        int int29 = cSVRecord28.size();
        java.util.Spliterator<java.lang.String> strSpliterator30 = cSVRecord28.spliterator();
        java.lang.String str32 = cSVRecord28.get((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(strSpliterator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isMapped("");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String str22 = cSVRecord10.get((int) (byte) 0);
        boolean boolean23 = cSVRecord10.isConsistent();
        boolean boolean25 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        boolean boolean17 = cSVRecord14.isConsistent();
        java.lang.String str18 = cSVRecord14.getComment();
        int int19 = cSVRecord14.size();
        java.lang.String str20 = cSVRecord14.toString();
        int int21 = cSVRecord14.size();
        java.lang.String str22 = cSVRecord14.toString();
        boolean boolean23 = cSVRecord14.isConsistent();
        java.lang.String[] strArray24 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        int int20 = cSVRecord10.size();
        int int21 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) (short) 1);
        java.lang.String str21 = cSVRecord20.toString();
        java.lang.String str22 = cSVRecord20.getComment();
        boolean boolean23 = cSVRecord20.isConsistent();
        java.lang.String[] strArray24 = cSVRecord20.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[hi!, , hi!, hi!, , hi!]", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray24, strMap29, "[]", (-1L));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String str20 = cSVRecord10.get((int) (byte) 0);
        java.lang.String str21 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        int int20 = cSVRecord10.size();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", 0L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean15 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        long long18 = cSVRecord14.getRecordNumber();
        boolean boolean19 = cSVRecord14.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord14.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean15 = cSVRecord10.isMapped("");
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", 35L);
        java.lang.String str21 = cSVRecord20.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str18 = cSVRecord14.toString();
        boolean boolean19 = cSVRecord14.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord14.spliterator();
        boolean boolean21 = cSVRecord14.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[hi!, , hi!, hi!, , hi!]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "", (long) (byte) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[]", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "hi!", (long) ' ');
        java.lang.String[] strArray29 = cSVRecord28.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String str19 = cSVRecord10.getComment();
        java.lang.String str20 = cSVRecord10.getComment();
        long long21 = cSVRecord10.getRecordNumber();
        int int22 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass23 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (short) 1);
        boolean boolean18 = cSVRecord17.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord17.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        long long21 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "hi!", (-1L));
        boolean boolean28 = cSVRecord26.isMapped("[hi!, , hi!, hi!, , hi!]");
        long long29 = cSVRecord26.getRecordNumber();
        long long30 = cSVRecord26.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor31 = cSVRecord26.iterator();
        boolean boolean33 = cSVRecord26.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        int int14 = cSVRecord10.size();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "[hi!, , hi!, hi!, , hi!]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) 10);
        java.lang.String str21 = cSVRecord20.toString();
        java.lang.String[] strArray22 = cSVRecord20.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[hi!, , hi!, hi!, , hi!]", 0L);
        long long27 = cSVRecord26.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.lang.String str15 = cSVRecord14.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String str17 = cSVRecord14.toString();
        java.lang.String str18 = cSVRecord14.toString();
        boolean boolean20 = cSVRecord14.isMapped("");
        boolean boolean21 = cSVRecord14.isConsistent();
        boolean boolean23 = cSVRecord14.isSet("hi!");
        boolean boolean25 = cSVRecord14.isSet("[hi!, , hi!, hi!, , hi!]");
        boolean boolean27 = cSVRecord14.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str17, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) (short) 10);
        long long19 = cSVRecord18.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord18.spliterator();
        boolean boolean21 = cSVRecord18.isConsistent();
        java.lang.String str22 = cSVRecord18.toString();
        boolean boolean24 = cSVRecord18.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.Class<?> wildcardClass13 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        int int21 = cSVRecord10.size();
        boolean boolean23 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[hi!, , hi!, hi!, , hi!]", 1L);
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord27.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator28);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        long long18 = cSVRecord14.getRecordNumber();
        java.lang.String str19 = cSVRecord14.getComment();
        int int20 = cSVRecord14.size();
        boolean boolean22 = cSVRecord14.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean24 = cSVRecord14.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[hi!, , hi!, hi!, , hi!]", (long) 6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "[hi!, , hi!, hi!, , hi!]", (long) (short) -1);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        long long17 = cSVRecord14.getRecordNumber();
        long long18 = cSVRecord14.getRecordNumber();
        java.lang.String str19 = cSVRecord14.getComment();
        boolean boolean21 = cSVRecord14.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String[] strArray22 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean19 = cSVRecord10.isMapped("");
        java.lang.String[] strArray20 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.String str22 = cSVRecord10.getComment();
        boolean boolean24 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        int int25 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        boolean boolean17 = cSVRecord14.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord14.spliterator();
        java.lang.String str20 = cSVRecord14.toString();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord14.spliterator();
        java.lang.String[] strArray22 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        boolean boolean19 = cSVRecord14.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord14.spliterator();
        int int21 = cSVRecord14.size();
        int int22 = cSVRecord14.size();
        java.lang.String str23 = cSVRecord14.toString();
        java.lang.String[] strArray24 = cSVRecord14.values();
        java.lang.String str25 = cSVRecord14.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str23, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String[] strArray19 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "[]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray16, strMap29, "hi!", 6L);
        java.util.Spliterator<java.lang.String> strSpliterator33 = cSVRecord32.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator33);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.get((int) (short) 0);
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str22 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        long long20 = cSVRecord10.getRecordNumber();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", 0L);
        boolean boolean22 = cSVRecord20.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isMapped("");
        java.lang.String[] strArray22 = cSVRecord10.values();
        boolean boolean24 = cSVRecord10.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord10.spliterator();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        int int18 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        int int14 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.get((int) (short) 0);
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "", (long) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        long long17 = cSVRecord10.getRecordNumber();
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        long long17 = cSVRecord14.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String str19 = cSVRecord14.getComment();
        java.lang.String str20 = cSVRecord14.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord14.get("[hi!, , hi!, hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) 1);
        java.lang.String str21 = cSVRecord20.getComment();
        boolean boolean23 = cSVRecord20.isSet("");
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord20.iterator();
        java.lang.String[] strArray25 = cSVRecord20.values();
        boolean boolean26 = cSVRecord20.isConsistent();
        java.lang.String str27 = cSVRecord20.getComment();
        java.lang.String str28 = cSVRecord20.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str28, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        boolean boolean17 = cSVRecord14.isConsistent();
        java.lang.String str18 = cSVRecord14.getComment();
        int int19 = cSVRecord14.size();
        int int20 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean21 = cSVRecord10.isSet("[]");
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String[] strArray23 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) (short) 10);
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord18.iterator();
        boolean boolean21 = cSVRecord18.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.get((int) (short) 1);
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        java.lang.String[] strArray18 = cSVRecord14.values();
        int int19 = cSVRecord14.size();
        java.lang.String[] strArray20 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, , hi!, hi!, , hi!]", (long) (byte) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 1L);
        boolean boolean5 = cSVRecord4.isConsistent();
        java.lang.String[] strArray6 = cSVRecord4.values();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        boolean boolean17 = cSVRecord14.isConsistent();
        int int18 = cSVRecord14.size();
        boolean boolean20 = cSVRecord14.isMapped("hi!");
        java.lang.String[] strArray21 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[hi!, , hi!, hi!, , hi!]", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray21, strMap26, "", (long) (byte) 1);
        java.util.Spliterator<java.lang.String> strSpliterator30 = cSVRecord29.spliterator();
        boolean boolean31 = cSVRecord29.isConsistent();
        int int32 = cSVRecord29.size();
        boolean boolean34 = cSVRecord29.isMapped("hi!");
        boolean boolean36 = cSVRecord29.isMapped("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean16 = cSVRecord14.isConsistent();
        boolean boolean18 = cSVRecord14.isSet("");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord14.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord14.spliterator();
        boolean boolean22 = cSVRecord14.isSet("");
        boolean boolean24 = cSVRecord14.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        int int16 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.get(0);
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        java.lang.String str18 = cSVRecord14.getComment();
        java.lang.String str19 = cSVRecord14.getComment();
        boolean boolean21 = cSVRecord14.isSet("[]");
        java.lang.String str23 = cSVRecord14.get((int) (short) 1);
        long long24 = cSVRecord14.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str15 = cSVRecord10.get((int) (short) 0);
        long long16 = cSVRecord10.getRecordNumber();
        int int17 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("");
        long long18 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", (long) '#');
        boolean boolean23 = cSVRecord22.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "[hi!, , hi!, hi!, , hi!]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray12, strMap21, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray12, strMap25, "[hi!, , hi!, hi!, , hi!]", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray12, strMap29, "hi!", (long) '4');
        boolean boolean34 = cSVRecord32.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "hi!", 52L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray16, strMap29, "hi!", (long) (byte) -1);
        boolean boolean34 = cSVRecord32.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.lang.String[] strArray22 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        long long15 = cSVRecord10.getRecordNumber();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (byte) 0);
        boolean boolean23 = cSVRecord21.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord21.spliterator();
        boolean boolean26 = cSVRecord21.isSet("[hi!, , hi!, hi!, , hi!]");
        boolean boolean27 = cSVRecord21.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) 100);
        boolean boolean17 = cSVRecord16.isConsistent();
        boolean boolean19 = cSVRecord16.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        long long17 = cSVRecord10.getRecordNumber();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        boolean boolean25 = cSVRecord10.isSet("");
        boolean boolean27 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.lang.String str17 = cSVRecord10.toString();
        long long18 = cSVRecord10.getRecordNumber();
        int int19 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str17, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        java.lang.String str20 = cSVRecord10.get((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        long long16 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 100);
        java.lang.String str18 = cSVRecord17.getComment();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord17.iterator();
        java.lang.String str20 = cSVRecord17.toString();
        java.lang.String[] strArray21 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[hi!, , hi!, hi!, , hi!]", (long) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord25.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str19 = cSVRecord14.get((int) (byte) 1);
        long long20 = cSVRecord14.getRecordNumber();
        boolean boolean21 = cSVRecord14.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord14.spliterator();
        boolean boolean24 = cSVRecord14.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean25 = cSVRecord14.isConsistent();
        java.lang.String str26 = cSVRecord14.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str26, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord10.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str15 = cSVRecord10.get((int) (short) 0);
        long long16 = cSVRecord10.getRecordNumber();
        int int17 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String str19 = cSVRecord14.getComment();
        int int20 = cSVRecord14.size();
        java.lang.String str21 = cSVRecord14.getComment();
        boolean boolean22 = cSVRecord14.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord14.spliterator();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord14.iterator();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str19 = cSVRecord14.get((int) (byte) 1);
        long long20 = cSVRecord14.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord14.spliterator();
        boolean boolean23 = cSVRecord14.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str24 = cSVRecord14.toString();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord14.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord14.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str24, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 1);
        int int18 = cSVRecord17.size();
        long long19 = cSVRecord17.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str15 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[]", 100L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("");
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        boolean boolean23 = cSVRecord10.isConsistent();
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        int int24 = cSVRecord10.size();
        long long25 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        boolean boolean20 = cSVRecord14.isMapped("hi!");
        long long21 = cSVRecord14.getRecordNumber();
        boolean boolean23 = cSVRecord14.isMapped("hi!");
        java.lang.String[] strArray24 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[hi!, , hi!, hi!, , hi!]", (long) (short) 10);
        long long29 = cSVRecord28.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        long long20 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", (long) 0);
        int int26 = cSVRecord25.size();
        boolean boolean28 = cSVRecord25.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String str19 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        long long18 = cSVRecord14.getRecordNumber();
        long long19 = cSVRecord14.getRecordNumber();
        java.lang.String str20 = cSVRecord14.toString();
        int int21 = cSVRecord14.size();
        java.lang.String[] strArray22 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[hi!, , hi!, hi!, , hi!]", (long) 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.lang.String str22 = cSVRecord10.getComment();
        int int23 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 100);
        java.lang.String str18 = cSVRecord17.getComment();
        java.lang.String str19 = cSVRecord17.toString();
        boolean boolean21 = cSVRecord17.isMapped("");
        boolean boolean23 = cSVRecord17.isMapped("[hi!, , hi!, hi!, , hi!]");
        long long24 = cSVRecord17.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean13 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (-1L));
        boolean boolean21 = cSVRecord19.isSet("");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord19.iterator();
        int int23 = cSVRecord19.size();
        int int24 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isMapped("");
        java.lang.String str18 = cSVRecord10.toString();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "hi!", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "[hi!, , hi!, hi!, , hi!]", (long) '#');
        boolean boolean30 = cSVRecord28.isSet("[hi!, , hi!, hi!, , hi!]");
        boolean boolean31 = cSVRecord28.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        boolean boolean20 = cSVRecord14.isMapped("hi!");
        long long21 = cSVRecord14.getRecordNumber();
        boolean boolean23 = cSVRecord14.isMapped("hi!");
        int int24 = cSVRecord14.size();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        long long17 = cSVRecord14.getRecordNumber();
        boolean boolean19 = cSVRecord14.isSet("hi!");
        java.lang.String[] strArray20 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        boolean boolean17 = cSVRecord14.isConsistent();
        java.lang.String str18 = cSVRecord14.getComment();
        int int19 = cSVRecord14.size();
        java.lang.String str20 = cSVRecord14.toString();
        int int21 = cSVRecord14.size();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord14.iterator();
        boolean boolean23 = cSVRecord14.isConsistent();
        long long24 = cSVRecord14.getRecordNumber();
        boolean boolean26 = cSVRecord14.isMapped("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        int int18 = cSVRecord14.size();
        java.lang.String str19 = cSVRecord14.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord14.iterator();
        int int21 = cSVRecord14.size();
        boolean boolean22 = cSVRecord14.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isSet("hi!");
        java.lang.String str21 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        boolean boolean19 = cSVRecord14.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord14.spliterator();
        int int21 = cSVRecord14.size();
        java.lang.String[] strArray22 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord14.iterator();
        java.lang.Class<?> wildcardClass24 = cSVRecord14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", 1L);
        boolean boolean24 = cSVRecord22.isMapped("hi!");
        java.lang.String str25 = cSVRecord22.toString();
        java.lang.String str26 = cSVRecord22.getComment();
        java.lang.String str27 = cSVRecord22.getComment();
        java.lang.String[] strArray28 = cSVRecord22.values();
        java.lang.String[] strArray29 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray29, strMap30, "hi!", (long) 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str25, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        java.lang.String str23 = cSVRecord10.getComment();
        long long24 = cSVRecord10.getRecordNumber();
        boolean boolean25 = cSVRecord10.isConsistent();
        java.lang.String[] strArray26 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27, "", 1L);
        java.lang.String str31 = cSVRecord30.toString();
        java.lang.String str32 = cSVRecord30.getComment();
        java.lang.String[] strArray33 = cSVRecord30.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap34 = null;
        org.apache.commons.csv.CSVRecord cSVRecord37 = new org.apache.commons.csv.CSVRecord(strArray33, strMap34, "hi!", 35L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str31, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, , hi!, hi!, , hi!]", (long) 100);
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord24.spliterator();
        boolean boolean27 = cSVRecord24.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord24.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "[]", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "hi!", 0L);
        long long27 = cSVRecord26.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        java.lang.String str18 = cSVRecord14.getComment();
        java.lang.String[] strArray19 = cSVRecord14.values();
        java.lang.String[] strArray20 = cSVRecord14.values();
        int int21 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        long long18 = cSVRecord14.getRecordNumber();
        java.lang.String[] strArray19 = cSVRecord14.values();
        java.lang.String str20 = cSVRecord14.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String str16 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        int int18 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) (short) 10);
        boolean boolean20 = cSVRecord18.isSet("[hi!, , hi!, hi!, , hi!]");
        boolean boolean22 = cSVRecord18.isSet("");
        long long23 = cSVRecord18.getRecordNumber();
        java.lang.String[] strArray24 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "", (long) (byte) -1);
        boolean boolean29 = cSVRecord28.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord28.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        int int22 = cSVRecord10.size();
        boolean boolean24 = cSVRecord10.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", (long) '4');
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord25.spliterator();
        java.lang.String[] strArray27 = cSVRecord25.values();
        int int28 = cSVRecord25.size();
        java.lang.String[] strArray29 = cSVRecord25.values();
        java.util.Iterator<java.lang.String> strItor30 = cSVRecord25.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor30);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "[hi!, , hi!, hi!, , hi!]", 100L);
        java.lang.String str24 = cSVRecord22.get((int) (short) 0);
        java.lang.String str26 = cSVRecord22.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 0L);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.lang.String[] strArray19 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", (long) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord19.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.Class<?> wildcardClass18 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str15 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean19 = cSVRecord10.isMapped("");
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.toString();
        java.lang.String str22 = cSVRecord10.toString();
        boolean boolean24 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isMapped("");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[]", 35L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray15, strMap28, "[hi!, , hi!, hi!, , hi!]", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray15, strMap32, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray15, strMap36, "", (long) (short) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (byte) 0);
        boolean boolean23 = cSVRecord21.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str25 = cSVRecord21.get(1);
        java.lang.String[] strArray26 = cSVRecord21.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27, "", (long) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        long long12 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        java.lang.String str18 = cSVRecord14.getComment();
        java.lang.String str19 = cSVRecord14.getComment();
        java.lang.String[] strArray20 = cSVRecord14.values();
        int int21 = cSVRecord14.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord14.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[]", (long) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String[] strArray18 = cSVRecord10.values();
        int int19 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        long long20 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", 1L);
        boolean boolean23 = cSVRecord22.isConsistent();
        boolean boolean24 = cSVRecord22.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord23.iterator();
        java.lang.String str25 = cSVRecord23.toString();
        boolean boolean26 = cSVRecord23.isConsistent();
        boolean boolean28 = cSVRecord23.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str25, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        int int12 = cSVRecord10.size();
        long long13 = cSVRecord10.getRecordNumber();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) (byte) 100);
        java.lang.String str20 = cSVRecord18.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[hi!, , hi!, hi!, , hi!]", (long) '#');
        boolean boolean30 = cSVRecord28.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str31 = cSVRecord28.toString();
        java.lang.String str32 = cSVRecord28.getComment();
        boolean boolean34 = cSVRecord28.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str31, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str32, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.get((int) (short) 1);
        boolean boolean20 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isSet("");
        boolean boolean27 = cSVRecord10.isMapped("[]");
        boolean boolean29 = cSVRecord10.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str23, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.lang.String[] strArray15 = cSVRecord10.values();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.Class<?> wildcardClass18 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.get((int) (short) 1);
        java.lang.String str20 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        java.lang.String str12 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str19 = cSVRecord10.get(0);
        java.lang.Class<?> wildcardClass20 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isConsistent();
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str23, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isConsistent();
        int int20 = cSVRecord10.size();
        int int21 = cSVRecord10.size();
        boolean boolean23 = cSVRecord10.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord22.spliterator();
        boolean boolean25 = cSVRecord22.isConsistent();
        boolean boolean27 = cSVRecord22.isSet("[hi!, , hi!, hi!, , hi!]");
        int int28 = cSVRecord22.size();
        java.lang.String[] strArray29 = cSVRecord22.values();
        java.lang.String[] strArray30 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray30, strMap31, "hi!", 32L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) 1);
        java.lang.String str21 = cSVRecord20.getComment();
        boolean boolean23 = cSVRecord20.isSet("");
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord20.iterator();
        java.lang.String[] strArray25 = cSVRecord20.values();
        boolean boolean26 = cSVRecord20.isConsistent();
        java.lang.String str27 = cSVRecord20.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord20.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSpliterator28);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isSet("");
        boolean boolean23 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord22.spliterator();
        java.lang.String str25 = cSVRecord22.getComment();
        long long26 = cSVRecord22.getRecordNumber();
        boolean boolean28 = cSVRecord22.isMapped("[]");
        long long29 = cSVRecord22.getRecordNumber();
        boolean boolean31 = cSVRecord22.isSet("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "[]", 1L);
        long long30 = cSVRecord29.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isSet("");
        long long22 = cSVRecord10.getRecordNumber();
        int int23 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        boolean boolean20 = cSVRecord14.isMapped("hi!");
        long long21 = cSVRecord14.getRecordNumber();
        boolean boolean23 = cSVRecord14.isMapped("hi!");
        boolean boolean24 = cSVRecord14.isConsistent();
        long long25 = cSVRecord14.getRecordNumber();
        boolean boolean26 = cSVRecord14.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[hi!, , hi!, hi!, , hi!]", 10L);
        boolean boolean23 = cSVRecord22.isConsistent();
        long long24 = cSVRecord22.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        boolean boolean25 = cSVRecord23.isSet("");
        int int26 = cSVRecord23.size();
        java.lang.String str27 = cSVRecord23.getComment();
        boolean boolean28 = cSVRecord23.isConsistent();
        java.lang.String str29 = cSVRecord23.toString();
        java.lang.String[] strArray30 = cSVRecord23.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray30, strMap31, "", (long) (short) -1);
        boolean boolean35 = cSVRecord34.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str27, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str29, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[hi!, , hi!, hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "[hi!, , hi!, hi!, , hi!]", (long) 100);
        java.lang.String[] strArray23 = cSVRecord22.values();
        long long24 = cSVRecord22.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        java.lang.String str18 = cSVRecord14.toString();
        int int19 = cSVRecord14.size();
        java.lang.Class<?> wildcardClass20 = cSVRecord14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.lang.String[] strArray24 = cSVRecord22.values();
        java.lang.String str25 = cSVRecord22.toString();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord22.iterator();
        boolean boolean27 = cSVRecord22.isConsistent();
        boolean boolean28 = cSVRecord22.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str25, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        int int15 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isSet("");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isMapped("");
        boolean boolean23 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("[hi!, , hi!, hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord10.spliterator();
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        boolean boolean14 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isSet("");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (byte) 100);
        java.lang.String str5 = cSVRecord4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String[] strArray19 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "hi!", 6L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord27.get(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord10.spliterator();
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        int int23 = cSVRecord22.size();
        java.lang.String str24 = cSVRecord22.toString();
        boolean boolean26 = cSVRecord22.isMapped("");
        boolean boolean27 = cSVRecord22.isConsistent();
        boolean boolean29 = cSVRecord22.isSet("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str24, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", 1L);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[hi!, , hi!, hi!, , hi!]", (long) ' ');
        boolean boolean29 = cSVRecord27.isSet("hi!");
        boolean boolean31 = cSVRecord27.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str32 = cSVRecord27.toString();
        long long33 = cSVRecord27.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str32, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[hi!, , hi!, hi!, , hi!]", (long) (byte) 1);
        int int5 = cSVRecord4.size();
        int int6 = cSVRecord4.size();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord4.iterator();
        java.lang.String str8 = cSVRecord4.getComment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str8, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean20 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean16 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "", 0L);
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord26.iterator();
        int int28 = cSVRecord26.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass21 = strItor20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str18 = cSVRecord14.toString();
        boolean boolean19 = cSVRecord14.isConsistent();
        int int20 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord14.spliterator();
        java.lang.String[] strArray22 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "", (long) (-1));
        java.lang.Class<?> wildcardClass27 = strArray22.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "", (long) (byte) 100);
        boolean boolean28 = cSVRecord26.isMapped("[hi!, , hi!, hi!, , hi!]");
        int int29 = cSVRecord26.size();
        java.util.Spliterator<java.lang.String> strSpliterator30 = cSVRecord26.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(strSpliterator30);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[hi!, , hi!, hi!, , hi!]", (long) (short) 0);
        boolean boolean28 = cSVRecord27.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator29 = cSVRecord27.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strSpliterator29);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        java.lang.String[] strArray18 = cSVRecord14.values();
        boolean boolean20 = cSVRecord14.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord14.spliterator();
        long long22 = cSVRecord14.getRecordNumber();
        boolean boolean24 = cSVRecord14.isMapped("hi!");
        int int25 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        int int12 = cSVRecord10.size();
        long long13 = cSVRecord10.getRecordNumber();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str18 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) '#');
        java.lang.String str21 = cSVRecord20.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isSet("[]");
        java.lang.String str22 = cSVRecord10.toString();
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "[hi!, , hi!, hi!, , hi!]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray12, strMap21, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray12, strMap25, "[hi!, , hi!, hi!, , hi!]", (-1L));
        boolean boolean30 = cSVRecord28.isMapped("[hi!, , hi!, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = cSVRecord28.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.lang.String[] strArray21 = cSVRecord10.values();
        int int22 = cSVRecord10.size();
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String str24 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str23, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str24, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[]", 1L);
        java.lang.String str20 = cSVRecord18.get(1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isConsistent();
        boolean boolean23 = cSVRecord10.isConsistent();
        boolean boolean25 = cSVRecord10.isSet("hi!");
        boolean boolean27 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", 97L);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        java.lang.String str23 = cSVRecord21.getComment();
        boolean boolean25 = cSVRecord21.isMapped("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) 100);
        boolean boolean17 = cSVRecord16.isConsistent();
        long long18 = cSVRecord16.getRecordNumber();
        long long19 = cSVRecord16.getRecordNumber();
        java.lang.String[] strArray20 = cSVRecord16.values();
        java.lang.Class<?> wildcardClass21 = cSVRecord16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) (short) 1);
        java.lang.String str21 = cSVRecord20.toString();
        boolean boolean22 = cSVRecord20.isConsistent();
        java.lang.String[] strArray23 = cSVRecord20.values();
        boolean boolean25 = cSVRecord20.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean27 = cSVRecord20.isMapped("[hi!, , hi!, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord20.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.get((int) (short) 0);
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "", (long) (byte) 0);
        boolean boolean29 = cSVRecord28.isConsistent();
        java.lang.String[] strArray30 = cSVRecord28.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        int int16 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", 1L);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[hi!, , hi!, hi!, , hi!]", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "hi!", (long) '4');
        long long32 = cSVRecord31.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        java.lang.String str17 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str17, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[hi!, , hi!, hi!, , hi!]", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "[]", (long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray18, strMap27, "", 0L);
        java.lang.String str31 = cSVRecord30.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str31, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord14.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        boolean boolean20 = cSVRecord14.isMapped("hi!");
        long long21 = cSVRecord14.getRecordNumber();
        boolean boolean23 = cSVRecord14.isMapped("hi!");
        boolean boolean24 = cSVRecord14.isConsistent();
        long long25 = cSVRecord14.getRecordNumber();
        java.lang.String[] strArray26 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27, "", 97L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 1L);
        java.lang.String str5 = cSVRecord4.getComment();
        int int6 = cSVRecord4.size();
        java.lang.String str7 = cSVRecord4.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord4.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("");
        java.lang.String str18 = cSVRecord10.getComment();
        int int19 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.Class<?> wildcardClass21 = strSpliterator20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) (short) 1);
        int int21 = cSVRecord20.size();
        java.lang.String str22 = cSVRecord20.getComment();
        boolean boolean23 = cSVRecord20.isConsistent();
        java.lang.String str25 = cSVRecord20.get(0);
        java.lang.String str26 = cSVRecord20.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str26, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord22.spliterator();
        boolean boolean25 = cSVRecord22.isConsistent();
        int int26 = cSVRecord22.size();
        java.lang.String[] strArray27 = cSVRecord22.values();
        int int28 = cSVRecord22.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = cSVRecord22.get("[hi!, , hi!, hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 1L);
        java.lang.String str5 = cSVRecord4.getComment();
        int int6 = cSVRecord4.size();
        java.lang.String str7 = cSVRecord4.getComment();
        java.lang.String[] strArray8 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "[hi!, , hi!, hi!, , hi!]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "", (long) 6);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray8, strMap17, "hi!", (long) 'a');
        long long21 = cSVRecord20.getRecordNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isMapped("");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[]", 32L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean13 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        boolean boolean15 = cSVRecord14.isConsistent();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        int int15 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        long long17 = cSVRecord14.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String str19 = cSVRecord14.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord14.iterator();
        java.lang.String str21 = cSVRecord14.toString();
        long long22 = cSVRecord14.getRecordNumber();
        boolean boolean23 = cSVRecord14.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        long long17 = cSVRecord10.getRecordNumber();
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String str20 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean14 = cSVRecord10.isConsistent();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, , hi!, hi!, , hi!]", (long) (short) -1);
        boolean boolean25 = cSVRecord24.isConsistent();
        boolean boolean26 = cSVRecord24.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray6, strMap27, "", (long) (byte) 10);
        int int31 = cSVRecord30.size();
        java.lang.String[] strArray32 = cSVRecord30.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean15 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean18 = cSVRecord10.isSet("[]");
        int int19 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) (short) 10);
        int int19 = cSVRecord18.size();
        long long20 = cSVRecord18.getRecordNumber();
        java.lang.String[] strArray21 = cSVRecord18.values();
        java.lang.String[] strArray22 = cSVRecord18.values();
        java.lang.String str23 = cSVRecord18.toString();
        int int24 = cSVRecord18.size();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord18.spliterator();
        int int26 = cSVRecord18.size();
        java.lang.String str27 = cSVRecord18.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str23, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        long long17 = cSVRecord14.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord14.iterator();
        java.lang.String str20 = cSVRecord14.toString();
        java.lang.String[] strArray21 = cSVRecord14.values();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord14.spliterator();
        java.lang.String[] strArray23 = cSVRecord14.values();
        java.lang.String[] strArray24 = cSVRecord14.values();
        long long25 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[]", 6L);
        java.lang.String str29 = cSVRecord28.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str29, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean13 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        long long19 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        int int21 = cSVRecord10.size();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        boolean boolean19 = cSVRecord14.isMapped("hi!");
        boolean boolean21 = cSVRecord14.isSet("");
        boolean boolean22 = cSVRecord14.isConsistent();
        boolean boolean24 = cSVRecord14.isSet("hi!");
        boolean boolean25 = cSVRecord14.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", 0L);
        java.lang.String str21 = cSVRecord20.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord20.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.lang.String[] strArray15 = cSVRecord10.values();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", 1L);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[hi!, , hi!, hi!, , hi!]", (long) ' ');
        boolean boolean29 = cSVRecord27.isSet("hi!");
        boolean boolean31 = cSVRecord27.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str32 = cSVRecord27.toString();
        java.lang.String str33 = cSVRecord27.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str32, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str33, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) (short) 10);
        java.lang.String str19 = cSVRecord18.toString();
        java.lang.String str20 = cSVRecord18.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "", (long) (byte) -1);
        int int27 = cSVRecord26.size();
        java.lang.String str28 = cSVRecord26.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray6, strMap27, "[hi!, , hi!, hi!, , hi!]", (long) 6);
        java.lang.String str31 = cSVRecord30.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = cSVRecord30.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str31, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        int int15 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String str20 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str20 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("");
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String[] strArray19 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        boolean boolean27 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.lang.String[] strArray14 = cSVRecord10.values();
        long long15 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "[hi!, , hi!, hi!, , hi!]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) 10);
        java.lang.String str21 = cSVRecord20.toString();
        boolean boolean23 = cSVRecord20.isMapped("hi!");
        java.lang.String str24 = cSVRecord20.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str24, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.lang.String[] strArray17 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, , hi!, hi!, , hi!]", (long) '4');
        java.lang.String str22 = cSVRecord21.getComment();
        boolean boolean24 = cSVRecord21.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str18 = cSVRecord14.toString();
        boolean boolean19 = cSVRecord14.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord14.spliterator();
        long long21 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isSet("hi!");
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str22 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        boolean boolean25 = cSVRecord23.isSet("");
        java.lang.String str26 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str26, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        int int12 = cSVRecord10.size();
        long long13 = cSVRecord10.getRecordNumber();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str17, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        boolean boolean17 = cSVRecord14.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord14.spliterator();
        java.lang.String str20 = cSVRecord14.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord14.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str20, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean15 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean17 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "", (long) (short) 10);
        java.lang.String str28 = cSVRecord27.toString();
        long long29 = cSVRecord27.getRecordNumber();
        boolean boolean31 = cSVRecord27.isMapped("hi!");
        boolean boolean33 = cSVRecord27.isMapped("");
        java.lang.String str34 = cSVRecord27.getComment();
        java.lang.String str35 = cSVRecord27.getComment();
        long long36 = cSVRecord27.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator37 = cSVRecord27.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str28, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator37);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) '#');
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        boolean boolean15 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        int int24 = cSVRecord23.size();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord23.iterator();
        java.lang.String str26 = cSVRecord23.toString();
        java.lang.String str27 = cSVRecord23.toString();
        int int28 = cSVRecord23.size();
        java.lang.String str29 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str26, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str27, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str29, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        int int24 = cSVRecord23.size();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord23.iterator();
        java.lang.String str26 = cSVRecord23.getComment();
        java.lang.String[] strArray27 = cSVRecord23.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray27, strMap28, "hi!", 0L);
        boolean boolean33 = cSVRecord31.isSet("[hi!, , hi!, hi!, , hi!]");
        int int34 = cSVRecord31.size();
        long long35 = cSVRecord31.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str26, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[hi!, , hi!, hi!, , hi!]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "[hi!, , hi!, hi!, , hi!]", 10L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        int int24 = cSVRecord23.size();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord23.iterator();
        java.lang.String str26 = cSVRecord23.getComment();
        java.lang.String[] strArray27 = cSVRecord23.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray27, strMap28, "hi!", 0L);
        boolean boolean33 = cSVRecord31.isSet("[hi!, , hi!, hi!, , hi!]");
        long long34 = cSVRecord31.getRecordNumber();
        boolean boolean36 = cSVRecord31.isSet("hi!");
        java.lang.String[] strArray37 = cSVRecord31.values();
        int int38 = cSVRecord31.size();
        java.util.Iterator<java.lang.String> strItor39 = cSVRecord31.iterator();
        boolean boolean41 = cSVRecord31.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str42 = cSVRecord31.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str26, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 6 + "'", int38 == 6);
        org.junit.Assert.assertNotNull(strItor39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str42, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.get((int) (short) 1);
        boolean boolean20 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        java.lang.String str26 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str23, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str26, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator27);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String str21 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        java.lang.String str18 = cSVRecord14.toString();
        int int19 = cSVRecord14.size();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord14.iterator();
        boolean boolean22 = cSVRecord14.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String[] strArray23 = cSVRecord14.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord14.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "[hi!, , hi!, hi!, , hi!]", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "[hi!, , hi!, hi!, , hi!]", (long) (byte) 0);
        java.lang.String[] strArray27 = cSVRecord26.values();
        boolean boolean29 = cSVRecord26.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        long long23 = cSVRecord22.getRecordNumber();
        boolean boolean24 = cSVRecord22.isConsistent();
        boolean boolean25 = cSVRecord22.isConsistent();
        java.lang.String str26 = cSVRecord22.getComment();
        java.lang.String str27 = cSVRecord22.toString();
        java.lang.String str28 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str27, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String str19 = cSVRecord14.getComment();
        boolean boolean21 = cSVRecord14.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str22 = cSVRecord14.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str22, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.get((int) (short) 1);
        boolean boolean20 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "", 0L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str23, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (byte) 0);
        boolean boolean23 = cSVRecord21.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord21.spliterator();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord21.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isMapped("");
        boolean boolean17 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean20 = cSVRecord10.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("");
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str22 = cSVRecord10.get((int) (short) 1);
        java.lang.String str24 = cSVRecord10.get(0);
        java.lang.String str25 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str15, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        java.lang.String[] strArray25 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean13 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean15 = cSVRecord10.isMapped("hi!");
        boolean boolean17 = cSVRecord10.isSet("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        int int22 = cSVRecord10.size();
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        boolean boolean19 = cSVRecord14.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord14.spliterator();
        int int21 = cSVRecord14.size();
        java.lang.String[] strArray22 = cSVRecord14.values();
        boolean boolean24 = cSVRecord14.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        int int18 = cSVRecord10.size();
        int int19 = cSVRecord10.size();
        int int20 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String str19 = cSVRecord14.getComment();
        int int20 = cSVRecord14.size();
        int int21 = cSVRecord14.size();
        boolean boolean23 = cSVRecord14.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord14.iterator();
        java.lang.String[] strArray25 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str15 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean15 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "[hi!, , hi!, hi!, , hi!]", (long) '4');
        long long15 = cSVRecord14.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        long long15 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.get((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String str19 = cSVRecord14.getComment();
        int int20 = cSVRecord14.size();
        long long21 = cSVRecord14.getRecordNumber();
        java.lang.String str22 = cSVRecord14.getComment();
        java.lang.String[] strArray23 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", 6L);
        boolean boolean33 = cSVRecord31.isMapped("hi!");
        java.lang.String[] strArray34 = cSVRecord31.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        java.lang.String str22 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.Class<?> wildcardClass23 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "hi!", 1L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str19, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean13 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        boolean boolean14 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean19 = cSVRecord10.isSet("");
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "", (long) (byte) -1);
        long long23 = cSVRecord22.getRecordNumber();
        boolean boolean24 = cSVRecord22.isConsistent();
        java.lang.String str25 = cSVRecord22.toString();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord22.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord22.spliterator();
        java.lang.String str28 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str25, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[hi!, , hi!, hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) '#');
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord23.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str19 = cSVRecord14.get((int) (byte) 1);
        java.lang.String str20 = cSVRecord14.getComment();
        boolean boolean22 = cSVRecord14.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord14.iterator();
        int int24 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.lang.String str19 = cSVRecord14.get((int) (byte) 1);
        long long20 = cSVRecord14.getRecordNumber();
        boolean boolean21 = cSVRecord14.isConsistent();
        boolean boolean22 = cSVRecord14.isConsistent();
        boolean boolean24 = cSVRecord14.isMapped("");
        long long25 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean11 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isMapped("");
        boolean boolean15 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        boolean boolean17 = cSVRecord14.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord14.spliterator();
        java.lang.String str19 = cSVRecord14.getComment();
        int int20 = cSVRecord14.size();
        int int21 = cSVRecord14.size();
        boolean boolean23 = cSVRecord14.isSet("[hi!, , hi!, hi!, , hi!]");
        boolean boolean24 = cSVRecord14.isConsistent();
        java.lang.String[] strArray25 = cSVRecord14.values();
        long long26 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[hi!, , hi!, hi!, , hi!]", (long) (short) 0);
        boolean boolean28 = cSVRecord27.isConsistent();
        java.lang.String[] strArray29 = cSVRecord27.values();
        java.util.Iterator<java.lang.String> strItor30 = cSVRecord27.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor30);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) 0);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord22.spliterator();
        boolean boolean25 = cSVRecord22.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord22.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!, hi!, , hi!]", (long) '#');
        java.lang.String str21 = cSVRecord20.getComment();
        long long22 = cSVRecord20.getRecordNumber();
        boolean boolean23 = cSVRecord20.isConsistent();
        boolean boolean25 = cSVRecord20.isMapped("[hi!, , hi!, hi!, , hi!]");
        boolean boolean27 = cSVRecord20.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str21, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        java.lang.String[] strArray17 = cSVRecord14.values();
        boolean boolean19 = cSVRecord14.isMapped("hi!");
        boolean boolean21 = cSVRecord14.isSet("");
        int int22 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        java.lang.String str12 = cSVRecord10.toString();
        int int13 = cSVRecord10.size();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "", (long) (byte) 0);
        java.lang.String str26 = cSVRecord25.getComment();
        boolean boolean27 = cSVRecord25.isConsistent();
        boolean boolean29 = cSVRecord25.isMapped("[hi!, , hi!, hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor30 = cSVRecord25.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strItor30);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        java.lang.String str12 = cSVRecord10.toString();
        int int13 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord10.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str12, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str17, "[hi!, , hi!, hi!, , hi!]");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        int int11 = cSVRecord10.size();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isMapped("[]");
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str18, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        int int15 = cSVRecord14.size();
        java.lang.String str16 = cSVRecord14.toString();
        long long17 = cSVRecord14.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord14.iterator();
        java.lang.String str20 = cSVRecord14.get(0);
        java.lang.String[] strArray21 = cSVRecord14.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord14.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isConsistent();
        long long21 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[hi!, , hi!, hi!, , hi!]", 97L);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String str11 = cSVRecord10.toString();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("[hi!, , hi!, hi!, , hi!]");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) '#');
        java.lang.String str24 = cSVRecord23.toString();
        long long25 = cSVRecord23.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str11, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str13, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str24, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVRecord4.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isSet("");
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "", (long) (short) 10);
        boolean boolean28 = cSVRecord27.isConsistent();
        int int29 = cSVRecord27.size();
        java.lang.String[] strArray30 = cSVRecord27.values();
        long long31 = cSVRecord27.getRecordNumber();
        long long32 = cSVRecord27.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord10.spliterator();
        boolean boolean12 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isSet("");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.getComment();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, , hi!, hi!, , hi!]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "", 32L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, , hi!, hi!, , hi!]" + "'", str16, "[hi!, , hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!, hi!, , hi!]", (long) 0);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!, hi!, , hi!]", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "", (long) (short) 10);
        boolean boolean28 = cSVRecord27.isConsistent();
        int int29 = cSVRecord27.size();
        java.lang.String[] strArray30 = cSVRecord27.values();
        java.lang.Class<?> wildcardClass31 = strArray30.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        long long15 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        java.lang.String str19 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }
}

