package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, , ]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "hi!", (long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[]", (long) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, hi!, , ]", (long) 100);
        long long23 = cSVRecord22.getRecordNumber();
        java.lang.String str24 = cSVRecord22.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap25 = cSVRecord22.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str24, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isConsistent();
        long long18 = cSVRecord10.getRecordNumber();
        int int19 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.get((int) (byte) 1);
        int int19 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.get((int) (byte) 1);
        long long22 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String[] strArray14 = cSVRecord10.values();
        long long15 = cSVRecord10.getRecordNumber();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        int int19 = cSVRecord10.size();
        long long20 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str16, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[hi!, hi!, , , , hi!]", (long) (byte) 100);
        boolean boolean27 = cSVRecord25.isSet("[, hi!, , ]");
        java.lang.String[] strArray28 = cSVRecord25.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.toString();
        int int19 = cSVRecord10.size();
        long long20 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) (byte) 0);
        int int20 = cSVRecord19.size();
        boolean boolean22 = cSVRecord19.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str23 = cSVRecord19.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str23, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[hi!, hi!, , , , hi!]", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray19, strMap28, "hi!", (long) (-1));
        java.lang.String str32 = cSVRecord31.getComment();
        java.lang.String[] strArray33 = cSVRecord31.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap34 = null;
        org.apache.commons.csv.CSVRecord cSVRecord37 = new org.apache.commons.csv.CSVRecord(strArray33, strMap34, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray33, strMap38, "hi!", (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap42 = cSVRecord41.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[]", (long) (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) '#');
        boolean boolean16 = cSVRecord14.isSet("");
        long long17 = cSVRecord14.getRecordNumber();
        java.lang.String str18 = cSVRecord14.getComment();
        java.lang.String str20 = cSVRecord14.get((int) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord14.spliterator();
        java.lang.String str22 = cSVRecord14.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord14.get("[hi!, hi!, , , , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str22, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        boolean boolean21 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean22 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap25 = cSVRecord10.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        boolean boolean21 = cSVRecord10.isMapped("[, ]");
        boolean boolean23 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("");
        java.lang.String str18 = cSVRecord10.toString();
        int int19 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("[hi!, hi!, , , , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isSet("[, ]");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str23 = cSVRecord10.get(2);
        boolean boolean24 = cSVRecord10.isConsistent();
        java.lang.String[] strArray25 = cSVRecord10.values();
        long long26 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord10.spliterator();
        boolean boolean29 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", 0L);
        java.lang.String[] strArray24 = cSVRecord23.values();
        boolean boolean26 = cSVRecord23.isSet("[, ]");
        boolean boolean28 = cSVRecord23.isMapped("");
        long long29 = cSVRecord23.getRecordNumber();
        java.lang.String str30 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "", (long) (byte) 0);
        java.lang.String str17 = cSVRecord15.get((int) (byte) 0);
        boolean boolean18 = cSVRecord15.isConsistent();
        long long19 = cSVRecord15.getRecordNumber();
        long long20 = cSVRecord15.getRecordNumber();
        java.lang.String str22 = cSVRecord15.get((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        long long18 = cSVRecord10.getRecordNumber();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        long long22 = cSVRecord10.getRecordNumber();
        int int23 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        long long25 = cSVRecord10.getRecordNumber();
        java.lang.String str26 = cSVRecord10.getComment();
        java.lang.String str28 = cSVRecord10.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("[, ]");
        boolean boolean21 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        long long22 = cSVRecord10.getRecordNumber();
        boolean boolean24 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String str22 = cSVRecord10.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String str19 = cSVRecord10.getComment();
        long long20 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.getComment();
        long long21 = cSVRecord10.getRecordNumber();
        long long22 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) ' ');
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord8.spliterator();
        boolean boolean11 = cSVRecord8.isMapped("hi!");
        java.lang.String str12 = cSVRecord8.toString();
        java.lang.String str13 = cSVRecord8.getComment();
        boolean boolean15 = cSVRecord8.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, , ]" + "'", str12, "[, hi!, , ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("");
        long long17 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isSet("[, ]");
        boolean boolean21 = cSVRecord10.isMapped("");
        long long22 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap23 = cSVRecord10.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean18 = cSVRecord10.isSet("");
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str22 = cSVRecord10.get((int) (short) 0);
        boolean boolean24 = cSVRecord10.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", 0L);
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord21.iterator();
        boolean boolean24 = cSVRecord21.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "[, ]", (long) (byte) 100);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.lang.String str20 = cSVRecord17.get(0);
        boolean boolean21 = cSVRecord17.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str23 = cSVRecord10.get(2);
        int int24 = cSVRecord10.size();
        java.lang.String[] strArray25 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray25, strMap26, "hi!", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray25, strMap30, "hi!", 35L);
        boolean boolean35 = cSVRecord33.isSet("[, hi!, , ]");
        int int36 = cSVRecord33.size();
        int int37 = cSVRecord33.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        int int18 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        java.lang.String[] strArray8 = cSVRecord6.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "hi!", (long) 'a');
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord12.iterator();
        int int14 = cSVRecord12.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        int int21 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, , ]", 0L);
        boolean boolean21 = cSVRecord19.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray22 = cSVRecord19.values();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) '#');
        java.lang.String[] strArray15 = cSVRecord14.values();
        java.lang.String str16 = cSVRecord14.toString();
        java.lang.String str17 = cSVRecord14.toString();
        boolean boolean19 = cSVRecord14.isMapped("");
        int int20 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str16, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        java.lang.String[] strArray8 = cSVRecord6.values();
        long long9 = cSVRecord6.getRecordNumber();
        java.lang.String str10 = cSVRecord6.getComment();
        boolean boolean11 = cSVRecord6.isConsistent();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (short) 0);
        boolean boolean22 = cSVRecord21.isConsistent();
        boolean boolean24 = cSVRecord21.isSet("[hi!, hi!, , , , hi!]");
        int int25 = cSVRecord21.size();
        java.lang.String str27 = cSVRecord21.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) 0);
        java.lang.String str15 = cSVRecord14.toString();
        boolean boolean17 = cSVRecord14.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.lang.String[] strArray20 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        int int20 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        java.lang.String str22 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        boolean boolean24 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[hi!, hi!, , , , hi!]", (long) (short) -1);
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord27.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator28);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap20 = cSVRecord10.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isMapped("[, ]");
        java.lang.String str20 = cSVRecord10.getComment();
        int int21 = cSVRecord10.size();
        java.lang.String str22 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isSet("[, hi!, , ]");
        java.lang.String str18 = cSVRecord10.get(4);
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, , ]");
        long long21 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, ]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "[hi!, hi!, , , , hi!]", 1L);
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord26.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.toString();
        long long21 = cSVRecord10.getRecordNumber();
        boolean boolean23 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean25 = cSVRecord10.isMapped("[, ]");
        java.lang.String str26 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str20, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str26, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.getComment();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "[, ]", 52L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "[, hi!, , ]", (long) (byte) 10);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        int int21 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", 0L);
        java.lang.String[] strArray24 = cSVRecord23.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[, ]", 0L);
        java.lang.String str29 = cSVRecord28.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap30 = cSVRecord28.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[, ]" + "'", str29, "[, ]");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        int int17 = cSVRecord10.size();
        int int18 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        int int21 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) '#');
        java.lang.String[] strArray15 = cSVRecord14.values();
        java.lang.String str16 = cSVRecord14.toString();
        boolean boolean18 = cSVRecord14.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord14.spliterator();
        long long20 = cSVRecord14.getRecordNumber();
        java.lang.String str21 = cSVRecord14.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord14.spliterator();
        java.lang.String str23 = cSVRecord14.getComment();
        java.lang.String[] strArray24 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str16, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isSet("");
        boolean boolean23 = cSVRecord10.isMapped("[, ]");
        boolean boolean25 = cSVRecord10.isSet("[]");
        java.lang.String str27 = cSVRecord10.get(1);
        java.lang.String[] strArray28 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray18 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isSet("");
        boolean boolean22 = cSVRecord10.isSet("");
        int int23 = cSVRecord10.size();
        java.lang.String str24 = cSVRecord10.toString();
        int int25 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        long long27 = cSVRecord10.getRecordNumber();
        boolean boolean29 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray30 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str24, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isMapped("hi!");
        java.lang.String str21 = cSVRecord10.getComment();
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.String str23 = cSVRecord10.getComment();
        boolean boolean25 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String str26 = cSVRecord10.toString();
        java.lang.String[] strArray27 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str26, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, , , , hi!]", (long) 1);
        long long22 = cSVRecord21.getRecordNumber();
        java.lang.String str24 = cSVRecord21.get((int) (short) 1);
        java.lang.String str25 = cSVRecord21.getComment();
        int int26 = cSVRecord21.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord21.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str25, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("");
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.String str24 = cSVRecord10.get(2);
        java.lang.String[] strArray25 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) '#');
        boolean boolean16 = cSVRecord14.isSet("");
        long long17 = cSVRecord14.getRecordNumber();
        boolean boolean19 = cSVRecord14.isMapped("hi!");
        boolean boolean21 = cSVRecord14.isSet("[, ]");
        java.lang.String[] strArray22 = cSVRecord14.values();
        int int23 = cSVRecord14.size();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord14.spliterator();
        int int25 = cSVRecord14.size();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str20 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        java.lang.String str22 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        long long20 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("[, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("");
        java.lang.String[] strArray20 = cSVRecord10.values();
        boolean boolean22 = cSVRecord10.isSet("");
        java.lang.String str23 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str23, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        long long18 = cSVRecord10.getRecordNumber();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        long long22 = cSVRecord10.getRecordNumber();
        int int23 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        boolean boolean26 = cSVRecord10.isMapped("hi!");
        boolean boolean28 = cSVRecord10.isSet("[]");
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator30 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strSpliterator30);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, ]", 10L);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.lang.String[] strArray24 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "hi!", (long) 'a');
        int int29 = cSVRecord28.size();
        long long30 = cSVRecord28.getRecordNumber();
        java.lang.String str31 = cSVRecord28.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str31, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean19 = cSVRecord10.isConsistent();
        long long20 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap24 = cSVRecord10.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isConsistent();
        long long21 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, hi!, , , , hi!]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[hi!, hi!, , , , hi!]", (long) (short) 0);
        boolean boolean28 = cSVRecord26.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap29 = cSVRecord26.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isSet("hi!");
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int20 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isConsistent();
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        long long13 = cSVRecord10.getRecordNumber();
        boolean boolean15 = cSVRecord10.isSet("[, ]");
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, ]", (long) (short) 100);
        java.lang.String str28 = cSVRecord27.getComment();
        java.lang.String str29 = cSVRecord27.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[, ]" + "'", str28, "[, ]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str29, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (long) 100);
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord19.iterator();
        int int21 = cSVRecord19.size();
        java.lang.String str22 = cSVRecord19.getComment();
        java.lang.String[] strArray23 = cSVRecord19.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "", (long) (short) 10);
        boolean boolean27 = cSVRecord25.isSet("[hi!, hi!, , , , hi!]");
        int int28 = cSVRecord25.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isSet("[, hi!, , ]");
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str15 = cSVRecord10.get(1);
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.get((int) (short) 1);
        boolean boolean19 = cSVRecord10.isSet("hi!");
        boolean boolean21 = cSVRecord10.isSet("[, ]");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        int int17 = cSVRecord10.size();
        int int18 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[, hi!, , ]", (long) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.get(1);
        java.lang.String str20 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, ]", 10L);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "hi!", 52L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        int int14 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("[, hi!, , ]");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, hi!, , , , hi!]", (long) 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        boolean boolean21 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str22 = cSVRecord10.toString();
        boolean boolean24 = cSVRecord10.isSet("[, hi!, , ]");
        int int25 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str22, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) ' ');
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord8.spliterator();
        java.lang.String[] strArray10 = cSVRecord8.values();
        long long11 = cSVRecord8.getRecordNumber();
        long long12 = cSVRecord8.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord8.iterator();
        long long14 = cSVRecord8.getRecordNumber();
        int int15 = cSVRecord8.size();
        long long16 = cSVRecord8.getRecordNumber();
        java.lang.String str18 = cSVRecord8.get((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = cSVRecord8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isConsistent();
        int int19 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[, hi!, , ]");
        java.lang.String[] strArray18 = cSVRecord10.values();
        int int19 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isConsistent();
        long long21 = cSVRecord10.getRecordNumber();
        boolean boolean23 = cSVRecord10.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("[, hi!, , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String str19 = cSVRecord10.getComment();
        java.lang.String str20 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str20, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String[] strArray15 = cSVRecord10.values();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass20 = strItor19.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("[, ]");
        long long20 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        boolean boolean25 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) ' ');
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord8.spliterator();
        boolean boolean11 = cSVRecord8.isMapped("hi!");
        boolean boolean12 = cSVRecord8.isConsistent();
        java.lang.String[] strArray13 = cSVRecord8.values();
        int int14 = cSVRecord8.size();
        boolean boolean15 = cSVRecord8.isConsistent();
        int int16 = cSVRecord8.size();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord6.iterator();
        boolean boolean10 = cSVRecord6.isMapped("[, ]");
        boolean boolean11 = cSVRecord6.isConsistent();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isSet("[, hi!, , ]");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        boolean boolean24 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str25 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("");
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass23 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) ' ');
        boolean boolean9 = cSVRecord8.isConsistent();
        boolean boolean11 = cSVRecord8.isSet("hi!");
        int int12 = cSVRecord8.size();
        boolean boolean14 = cSVRecord8.isSet("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        long long17 = cSVRecord10.getRecordNumber();
        int int18 = cSVRecord10.size();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isSet("[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, hi!, , , , hi!]", (long) (byte) 100);
        java.lang.String str26 = cSVRecord24.get(0);
        java.lang.String str27 = cSVRecord24.toString();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord24.iterator();
        long long29 = cSVRecord24.getRecordNumber();
        java.lang.String str30 = cSVRecord24.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str27, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str30, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String str19 = cSVRecord10.getComment();
        java.lang.String str21 = cSVRecord10.get(1);
        java.lang.String[] strArray22 = cSVRecord10.values();
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, hi!, , , , hi!]", (long) '#');
        int int19 = cSVRecord18.size();
        long long20 = cSVRecord18.getRecordNumber();
        boolean boolean22 = cSVRecord18.isSet("");
        boolean boolean24 = cSVRecord18.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord18.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isSet("[, ]");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        long long18 = cSVRecord10.getRecordNumber();
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isSet("[, ]");
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, ]", (long) 4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "hi!", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "[, ]", 2L);
        java.lang.String[] strArray29 = cSVRecord28.values();
        boolean boolean31 = cSVRecord28.isMapped("[, ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str13, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[, ]", 0L);
        long long28 = cSVRecord27.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) ' ');
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord8.spliterator();
        long long10 = cSVRecord8.getRecordNumber();
        boolean boolean12 = cSVRecord8.isMapped("hi!");
        boolean boolean13 = cSVRecord8.isConsistent();
        boolean boolean15 = cSVRecord8.isSet("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord8.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) ' ');
        boolean boolean9 = cSVRecord8.isConsistent();
        long long10 = cSVRecord8.getRecordNumber();
        boolean boolean12 = cSVRecord8.isSet("[, hi!, , ]");
        boolean boolean13 = cSVRecord8.isConsistent();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str13 = cSVRecord10.toString();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.getComment();
        int int21 = cSVRecord10.size();
        java.lang.String str23 = cSVRecord10.get((int) (byte) 1);
        boolean boolean24 = cSVRecord10.isConsistent();
        java.lang.String str25 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str13, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str25, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, ]", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[hi!, hi!, , , , hi!]", (long) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.lang.String[] strArray21 = cSVRecord10.values();
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String str22 = cSVRecord10.get(0);
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        boolean boolean25 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        long long26 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str22 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap23 = cSVRecord10.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str22, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.get(0);
        int int19 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.get((int) (short) 0);
        boolean boolean23 = cSVRecord10.isSet("[, ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isSet("hi!");
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) 'a');
        boolean boolean24 = cSVRecord22.isMapped("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        int int14 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str16, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str20, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        java.lang.String str8 = cSVRecord6.toString();
        java.lang.String str9 = cSVRecord6.getComment();
        boolean boolean10 = cSVRecord6.isConsistent();
        java.lang.String str11 = cSVRecord6.getComment();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[, ]" + "'", str8, "[, ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean19 = cSVRecord10.isMapped("");
        java.lang.String str21 = cSVRecord10.get(1);
        int int22 = cSVRecord10.size();
        java.lang.String[] strArray23 = cSVRecord10.values();
        long long24 = cSVRecord10.getRecordNumber();
        boolean boolean26 = cSVRecord10.isMapped("[, hi!, , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("");
        java.lang.String[] strArray20 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap21 = cSVRecord10.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray18 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isSet("");
        boolean boolean21 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[, hi!, , ]", (long) (short) 100);
        int int5 = cSVRecord4.size();
        java.lang.String[] strArray6 = cSVRecord4.values();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isMapped("");
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, , ]");
        java.lang.String str22 = cSVRecord10.get(1);
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean25 = cSVRecord10.isMapped("hi!");
        java.lang.String str26 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get("[hi!, hi!, , , , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, hi!, , , , hi!]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[hi!, hi!, , , , hi!]", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "", (long) 6);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray14, strMap27, "[, hi!, , ]", (long) (byte) 10);
        boolean boolean32 = cSVRecord30.isMapped("hi!");
        boolean boolean34 = cSVRecord30.isSet("hi!");
        int int35 = cSVRecord30.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isSet("[, hi!, , ]");
        java.lang.Class<?> wildcardClass23 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isMapped("");
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, , ]");
        java.lang.String str22 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        int int18 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, ]", 10L);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.lang.String[] strArray24 = cSVRecord22.values();
        java.lang.String str25 = cSVRecord22.toString();
        long long26 = cSVRecord22.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str25, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        int int18 = cSVRecord10.size();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean21 = cSVRecord10.isMapped("[, ]");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str17, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray18 = cSVRecord10.values();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.getComment();
        long long21 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[, hi!, , ]");
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String str23 = cSVRecord10.get(0);
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String str19 = cSVRecord10.getComment();
        java.lang.String str21 = cSVRecord10.get(1);
        boolean boolean22 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("[hi!, hi!, , , , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        java.lang.String str19 = cSVRecord10.get((int) (short) 0);
        java.lang.String str20 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        long long17 = cSVRecord10.getRecordNumber();
        int int18 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean22 = cSVRecord10.isSet("");
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", 97L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        java.lang.String[] strArray8 = cSVRecord6.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "", (long) (-1));
        java.lang.String str17 = cSVRecord16.toString();
        int int18 = cSVRecord16.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, ]" + "'", str17, "[, ]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        int int21 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, ]", 10L);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.lang.String[] strArray24 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "hi!", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray24, strMap29, "[, hi!, , ]", 35L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray24, strMap33, "hi!", 10L);
        long long37 = cSVRecord36.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str15 = cSVRecord10.get(1);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, , , , hi!]", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", 100L);
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27, "[hi!, hi!, , , , hi!]", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray26, strMap31, "[]", (long) 6);
        boolean boolean36 = cSVRecord34.isSet("[, hi!, , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        int int17 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str20 = cSVRecord10.toString();
        int int21 = cSVRecord10.size();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass23 = strArray22.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str20, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, ]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[, ]", (long) 0);
        int int24 = cSVRecord23.size();
        long long25 = cSVRecord23.getRecordNumber();
        boolean boolean27 = cSVRecord23.isSet("[]");
        boolean boolean29 = cSVRecord23.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean31 = cSVRecord23.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, , ]", 0L);
        boolean boolean21 = cSVRecord19.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String[] strArray22 = cSVRecord19.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[, hi!, , ]", 35L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isSet("[, ]");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isSet("[, ]");
        int int23 = cSVRecord10.size();
        java.lang.String str24 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str24, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray4, strMap9, "hi!", (long) (byte) 0);
        int int13 = cSVRecord12.size();
        java.lang.String str14 = cSVRecord12.toString();
        java.lang.String str15 = cSVRecord12.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, , ]" + "'", str14, "[, hi!, , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, , ]" + "'", str15, "[, hi!, , ]");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.String str20 = cSVRecord10.getComment();
        int int21 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "hi!", 35L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray21, strMap26, "", (long) (byte) 100);
        int int30 = cSVRecord29.size();
        java.lang.String[] strArray31 = cSVRecord29.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray31, strMap32, "", (long) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (short) 0);
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord21.iterator();
        java.lang.String str23 = cSVRecord21.getComment();
        boolean boolean25 = cSVRecord21.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap26 = cSVRecord21.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, hi!, , , , hi!]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[, ]", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[, hi!, , ]", (long) '#');
        boolean boolean28 = cSVRecord26.isMapped("[, ]");
        java.lang.String[] strArray29 = cSVRecord26.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String[] strArray21 = cSVRecord10.values();
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) '#');
        boolean boolean16 = cSVRecord14.isSet("");
        long long17 = cSVRecord14.getRecordNumber();
        boolean boolean19 = cSVRecord14.isMapped("hi!");
        boolean boolean21 = cSVRecord14.isSet("[, ]");
        java.lang.String[] strArray22 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray22, strMap27, "[, ]", (long) (byte) -1);
        java.lang.Class<?> wildcardClass31 = strArray22.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, hi!, , , , hi!]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[, ]", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[, hi!, , ]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray14, strMap27, "[hi!, hi!, , , , hi!]", 52L);
        java.lang.String[] strArray31 = cSVRecord30.values();
        java.lang.String[] strArray32 = cSVRecord30.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = cSVRecord30.get("[, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        java.lang.String[] strArray8 = cSVRecord6.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "[hi!, hi!, , , , hi!]", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray8, strMap17, "", (long) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        int int21 = cSVRecord10.size();
        long long22 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, , , , hi!]", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", 100L);
        java.lang.String[] strArray26 = cSVRecord25.values();
        boolean boolean27 = cSVRecord25.isConsistent();
        boolean boolean29 = cSVRecord25.isSet("[, ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.Class<?> wildcardClass20 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isSet("[, ]");
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str13, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str18 = cSVRecord10.toString();
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean23 = cSVRecord10.isMapped("[, hi!, , ]");
        boolean boolean25 = cSVRecord10.isMapped("[, ]");
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isSet("[, ]");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        boolean boolean23 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean19 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isConsistent();
        long long22 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "", (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord29.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        boolean boolean8 = cSVRecord6.isMapped("hi!");
        java.lang.String str9 = cSVRecord6.toString();
        java.lang.String[] strArray10 = cSVRecord6.values();
        java.lang.String str11 = cSVRecord6.toString();
        boolean boolean13 = cSVRecord6.isSet("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[, ]" + "'", str9, "[, ]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, ]" + "'", str11, "[, ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("");
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[, hi!, , ]", (-1L));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isSet("hi!");
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean19 = cSVRecord10.isConsistent();
        long long20 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String str25 = cSVRecord10.get(2);
        boolean boolean27 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str23, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, hi!, , , , hi!]", (long) (byte) 100);
        java.lang.String str26 = cSVRecord24.get(0);
        java.lang.String str27 = cSVRecord24.toString();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord24.iterator();
        java.lang.String[] strArray29 = cSVRecord24.values();
        long long30 = cSVRecord24.getRecordNumber();
        int int31 = cSVRecord24.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap32 = cSVRecord24.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str27, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        int int17 = cSVRecord10.size();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray22 = cSVRecord10.values();
        boolean boolean23 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.Class<?> wildcardClass19 = strSpliterator18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str21, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        java.lang.String[] strArray8 = cSVRecord6.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "hi!", (long) 'a');
        java.lang.String str14 = cSVRecord12.get(1);
        java.lang.String str15 = cSVRecord12.toString();
        int int16 = cSVRecord12.size();
        int int17 = cSVRecord12.size();
        java.lang.String str18 = cSVRecord12.getComment();
        long long19 = cSVRecord12.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, ]" + "'", str15, "[, ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("");
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String[] strArray22 = cSVRecord10.values();
        boolean boolean23 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", 0L);
        java.lang.String[] strArray24 = cSVRecord23.values();
        boolean boolean26 = cSVRecord23.isSet("[, ]");
        int int27 = cSVRecord23.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) '#');
        java.lang.String[] strArray15 = cSVRecord14.values();
        java.lang.String str16 = cSVRecord14.toString();
        boolean boolean18 = cSVRecord14.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord14.spliterator();
        java.lang.String str20 = cSVRecord14.getComment();
        long long21 = cSVRecord14.getRecordNumber();
        long long22 = cSVRecord14.getRecordNumber();
        boolean boolean23 = cSVRecord14.isConsistent();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord14.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str16, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 0L);
        boolean boolean6 = cSVRecord4.isSet("[, hi!, , ]");
        boolean boolean8 = cSVRecord4.isSet("[, hi!, , ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        long long17 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str13 = cSVRecord10.toString();
        long long14 = cSVRecord10.getRecordNumber();
        long long15 = cSVRecord10.getRecordNumber();
        int int16 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str13, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        int int18 = cSVRecord10.size();
        int int19 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.String[] strArray22 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.get(2);
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("");
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String[] strArray23 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        java.lang.String[] strArray20 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap21 = cSVRecord10.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str18, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean18 = cSVRecord10.isMapped("");
        boolean boolean20 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isSet("[, ]");
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, ]", (long) 4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "hi!", (long) (short) -1);
        boolean boolean26 = cSVRecord24.isSet("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str13, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[]", 2L);
        java.lang.String str28 = cSVRecord26.get((int) (short) 1);
        java.lang.String str30 = cSVRecord26.get(1);
        java.lang.String str31 = cSVRecord26.getComment();
        java.util.Iterator<java.lang.String> strItor32 = cSVRecord26.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertNotNull(strItor32);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String str12 = cSVRecord10.get(1);
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isSet("[, hi!, , ]");
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        boolean boolean24 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        long long19 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "[, ]", (long) (byte) 100);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.lang.String str19 = cSVRecord17.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord17.iterator();
        int int21 = cSVRecord17.size();
        java.lang.String[] strArray22 = cSVRecord17.values();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord17.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.lang.String str19 = cSVRecord10.get((int) (short) 1);
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.get(2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "hi!", 35L);
        int int26 = cSVRecord25.size();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord25.spliterator();
        int int28 = cSVRecord25.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        long long18 = cSVRecord10.getRecordNumber();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.String str23 = cSVRecord10.getComment();
        java.lang.String str24 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean22 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean19 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        boolean boolean24 = cSVRecord10.isMapped("[, ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int18 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean22 = cSVRecord10.isMapped("");
        boolean boolean24 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.lang.String str25 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "hi!", 35L);
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord25.spliterator();
        java.lang.String str27 = cSVRecord25.toString();
        boolean boolean29 = cSVRecord25.isSet("[, hi!, , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str27, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        long long13 = cSVRecord10.getRecordNumber();
        boolean boolean15 = cSVRecord10.isSet("[, ]");
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.getComment();
        int int21 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        long long17 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[hi!, hi!, , , , hi!]", (long) (short) -1);
        boolean boolean28 = cSVRecord27.isConsistent();
        boolean boolean30 = cSVRecord27.isSet("hi!");
        java.lang.String str31 = cSVRecord27.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str31, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        java.lang.String str21 = cSVRecord10.get((int) (short) 0);
        java.lang.String str23 = cSVRecord10.get(0);
        int int24 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str15, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", 52L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", (long) (byte) 10);
        int int24 = cSVRecord23.size();
        boolean boolean26 = cSVRecord23.isMapped("[]");
        java.lang.String str28 = cSVRecord23.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String[] strArray17 = cSVRecord10.values();
        long long18 = cSVRecord10.getRecordNumber();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.Class<?> wildcardClass20 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.String str22 = cSVRecord10.toString();
        int int23 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str20, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str22, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean18 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        boolean boolean21 = cSVRecord10.isSet("");
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        int int18 = cSVRecord10.size();
        int int19 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        int int21 = cSVRecord10.size();
        java.lang.String str23 = cSVRecord10.get(1);
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, hi!, , , , hi!]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[, ]", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[, hi!, , ]", (long) '#');
        java.lang.String str28 = cSVRecord26.get((int) (byte) 0);
        java.lang.String str29 = cSVRecord26.toString();
        java.lang.Class<?> wildcardClass30 = cSVRecord26.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str29, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean20 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        boolean boolean19 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        boolean boolean21 = cSVRecord10.isMapped("[]");
        boolean boolean23 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "hi!", (long) 100);
        int int24 = cSVRecord23.size();
        boolean boolean26 = cSVRecord23.isSet("[hi!, hi!, , , , hi!]");
        int int27 = cSVRecord23.size();
        boolean boolean29 = cSVRecord23.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, , ]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "hi!", (long) (byte) 0);
        java.lang.String str24 = cSVRecord23.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord23.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        int int18 = cSVRecord10.size();
        java.lang.String str19 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str19, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", 97L);
        boolean boolean21 = cSVRecord20.isConsistent();
        int int22 = cSVRecord20.size();
        java.lang.String[] strArray23 = cSVRecord20.values();
        java.lang.String[] strArray24 = cSVRecord20.values();
        java.lang.String[] strArray25 = cSVRecord20.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray25, strMap26, "[, ]", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray25, strMap30, "[, ]", (long) (short) 10);
        boolean boolean34 = cSVRecord33.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        boolean boolean22 = cSVRecord10.isSet("[, ]");
        java.lang.String str23 = cSVRecord10.getComment();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass25 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        long long17 = cSVRecord10.getRecordNumber();
        long long18 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[]", 2L);
        java.lang.String str28 = cSVRecord26.get((int) (short) 1);
        boolean boolean30 = cSVRecord26.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isMapped("");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("[hi!, hi!, , , , hi!]");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str22 = cSVRecord10.get(0);
        java.lang.String str23 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str23, "[hi!, hi!, , , , hi!]");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        boolean boolean12 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isSet("[hi!, hi!, , , , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[hi!, hi!, , , , hi!]", (long) (byte) 100);
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.lang.String str28 = cSVRecord25.get((int) (short) 0);
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord25.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strItor29);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[, hi!, , ]", 10L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = null;
        org.apache.commons.csv.CSVRecord cSVRecord6 = new org.apache.commons.csv.CSVRecord(strArray2, strMap3, "", (long) '4');
        long long7 = cSVRecord6.getRecordNumber();
        int int8 = cSVRecord6.size();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord6.iterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, hi!, , , , hi!]" + "'", str14, "[hi!, hi!, , , , hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) 0);
        java.lang.String[] strArray11 = cSVRecord10.values();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String[] strArray14 = cSVRecord10.values();
        long long15 = cSVRecord10.getRecordNumber();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[, hi!, , ]", (long) 2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "[hi!, hi!, , , , hi!]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "", 100L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }
}

