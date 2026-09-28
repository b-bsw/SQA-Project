package org.apache.commons.collections4.keyvalue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]");
        java.lang.String str6 = strComparableMultiKey5.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky "1) test2501(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey5.getKeys();
        java.lang.Class<?> wildcardClass8 = strComparableMultiKey5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]" + "'", str6, "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]");
// flaky "1) test2501(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.String str5 = strComparableMultiKey3.toString();
        java.lang.String str6 = strComparableMultiKey3.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky "2) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = null; // flaky "2) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray7, true);
        java.lang.String str10 = null; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.toString();
        int int11 = 0; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.size();
        java.lang.String str12 = null; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.toString();
        java.lang.String str13 = null; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.toString();
        int int14 = 0; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj19 = null;
        boolean boolean20 = strComparableMultiKey18.equals(obj19);
        int int21 = strComparableMultiKey18.size();
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey18.getKey((int) (byte) 0);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = null; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey18.getKeys();
        java.lang.String str25 = strComparableMultiKey18.toString();
        int int26 = strComparableMultiKey18.size();
        boolean boolean27 = false; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.equals((java.lang.Object) strComparableMultiKey18);
        java.lang.Comparable<java.lang.String>[] strComparableArray28 = null; // flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey18.getKeys();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str4, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str5, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str6, "MultiKey[hi!, hi!, hi!]");
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray7);
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str10, "MultiKey[hi!, hi!, hi!]");
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str12, "MultiKey[hi!, hi!, hi!]");
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str13, "MultiKey[hi!, hi!, hi!]");
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str25, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "1) test2502(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray28);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27, true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35, true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray27, strArray35, strArray40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, true);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray56, true);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray48, strArray56, strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray70, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray27, strArray42, strArray48, strArray70);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        int int79 = strComparableMultiKey78.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5 + "'", int79 == 5);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!], ]]");
        int int5 = strComparableMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, null], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]", strComparable2, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, null], null, MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], , MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]");
        java.lang.String str6 = strComparableMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, null], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, null], null, MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[hi!, null], , MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]" + "'", str6, "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, null], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, null], null, MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[hi!, null], , MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[null, hi!, hi!], MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]");
        java.lang.String str3 = strComparableMultiKey2.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "3) test2507(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey2.getKeys();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = strComparableMultiKey12.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13, false);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMultiKey16.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray19 = strComparableMultiKey16.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray20 = strComparableMultiKey16.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray20);
        boolean boolean22 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey21);
        java.lang.Class<?> wildcardClass23 = strComparableMultiKey2.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray26, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type[]) wildcardClassArray26);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray26, (java.lang.Class<?>[]) classArray34);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray26, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray26, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]");
        java.lang.String str44 = strComparableMultiKey43.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray45 = null; // flaky "3) test2507(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey43.getKeys();
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray51, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray54 = strComparableMultiKey53.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray54);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray54, false);
        java.lang.Comparable<java.lang.String> strComparable59 = strComparableMultiKey57.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray60 = strComparableMultiKey57.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray61 = strComparableMultiKey57.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray61);
        boolean boolean63 = strComparableMultiKey43.equals((java.lang.Object) strComparableMultiKey62);
        java.lang.Class<?> wildcardClass64 = strComparableMultiKey43.getClass();
        java.lang.Class[] classArray66 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        wildcardClassArray67[0] = wildcardClass64;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey71 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray67, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray67);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type[]) wildcardClassArray67);
        java.lang.Class[] classArray75 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey77 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray67, (java.lang.Class<?>[]) classArray75);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray67);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>((java.lang.reflect.Type[]) wildcardClassArray26, (java.lang.reflect.Type[]) wildcardClassArray67);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray67, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]" + "'", str3, "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]");
// flaky "2) test2507(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertArrayEquals(strComparableArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray19);
        org.junit.Assert.assertArrayEquals(strComparableArray19, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray20);
        org.junit.Assert.assertArrayEquals(strComparableArray20, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] { org.apache.commons.collections4.keyvalue.MultiKey.class });
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] { org.apache.commons.collections4.keyvalue.MultiKey.class });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]" + "'", str44, "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]");
// flaky "2) test2507(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray54);
        org.junit.Assert.assertArrayEquals(strComparableArray54, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable59 + "' != '" + "hi!" + "'", strComparable59, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray60);
        org.junit.Assert.assertArrayEquals(strComparableArray60, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray61);
        org.junit.Assert.assertArrayEquals(strComparableArray61, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertArrayEquals(classArray66, new java.lang.Class[] { org.apache.commons.collections4.keyvalue.MultiKey.class });
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] { org.apache.commons.collections4.keyvalue.MultiKey.class });
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertArrayEquals(classArray75, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] {});
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null], MultiKey[, MultiKey[null, hi!, hi!]]]", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray9, strArray17, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray9, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9, true);
        java.lang.reflect.Type[][][][][] typeArray30 = new java.lang.reflect.Type[][][][][] {};
        java.lang.reflect.Type[][][][][] typeArray31 = new java.lang.reflect.Type[][][][][] {};
        java.lang.reflect.Type[][][][][] typeArray32 = new java.lang.reflect.Type[][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray33 = new java.lang.reflect.Type[][][][][][] { typeArray30, typeArray31, typeArray32 };
        java.lang.reflect.Type[] typeArray34 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray35 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray36 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray37 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray38 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray39 = new java.lang.reflect.Type[][] { typeArray34, typeArray35, typeArray36, typeArray37, typeArray38 };
        java.lang.reflect.Type[] typeArray40 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray41 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray42 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray44 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray45 = new java.lang.reflect.Type[][] { typeArray40, typeArray41, typeArray42, typeArray43, typeArray44 };
        java.lang.reflect.Type[][][] typeArray46 = new java.lang.reflect.Type[][][] { typeArray39, typeArray45 };
        java.lang.reflect.Type[][][][] typeArray47 = new java.lang.reflect.Type[][][][] { typeArray46 };
        java.lang.reflect.Type[][][][][] typeArray48 = new java.lang.reflect.Type[][][][][] { typeArray47 };
        java.lang.reflect.Type[] typeArray49 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray51 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray52 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray53 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray54 = new java.lang.reflect.Type[][] { typeArray49, typeArray50, typeArray51, typeArray52, typeArray53 };
        java.lang.reflect.Type[] typeArray55 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray56 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray57 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray58 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray59 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray60 = new java.lang.reflect.Type[][] { typeArray55, typeArray56, typeArray57, typeArray58, typeArray59 };
        java.lang.reflect.Type[][][] typeArray61 = new java.lang.reflect.Type[][][] { typeArray54, typeArray60 };
        java.lang.reflect.Type[][][][] typeArray62 = new java.lang.reflect.Type[][][][] { typeArray61 };
        java.lang.reflect.Type[][][][][] typeArray63 = new java.lang.reflect.Type[][][][][] { typeArray62 };
        java.lang.reflect.Type[] typeArray64 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray65 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray66 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray67 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray68 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray69 = new java.lang.reflect.Type[][] { typeArray64, typeArray65, typeArray66, typeArray67, typeArray68 };
        java.lang.reflect.Type[] typeArray70 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray71 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray72 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray73 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray74 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray75 = new java.lang.reflect.Type[][] { typeArray70, typeArray71, typeArray72, typeArray73, typeArray74 };
        java.lang.reflect.Type[][][] typeArray76 = new java.lang.reflect.Type[][][] { typeArray69, typeArray75 };
        java.lang.reflect.Type[][][][] typeArray77 = new java.lang.reflect.Type[][][][] { typeArray76 };
        java.lang.reflect.Type[][][][][] typeArray78 = new java.lang.reflect.Type[][][][][] { typeArray77 };
        java.lang.reflect.Type[][][][][][] typeArray79 = new java.lang.reflect.Type[][][][][][] { typeArray48, typeArray63, typeArray78 };
        java.lang.reflect.Type[][][][][][] typeArray80 = new java.lang.reflect.Type[][][][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]> typeArrayMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]>(typeArray80, true);
        java.lang.reflect.Type[][][][][][] typeArray83 = new java.lang.reflect.Type[][][][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]> typeArrayMultiKey85 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]>(typeArray83, true);
        java.lang.reflect.Type[][][][][][] typeArray86 = new java.lang.reflect.Type[][][][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]> typeArrayMultiKey88 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]>(typeArray86, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]> typeArrayMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]>(typeArray33, typeArray79, typeArray80, typeArray83, typeArray86);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]> typeArrayMultiKey91 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]>(typeArray83, true);
        boolean boolean92 = strComparableMultiKey29.equals((java.lang.Object) typeArray83);
        boolean boolean93 = strComparableMultiKey3.equals((java.lang.Object) typeArray83);
        java.lang.Comparable<java.lang.String>[] strComparableArray94 = null; // flaky "4) test2508(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertArrayEquals(typeArray30, new java.lang.reflect.Type[][][][][] {});
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertArrayEquals(typeArray31, new java.lang.reflect.Type[][][][][] {});
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[][][][][] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertArrayEquals(typeArray35, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertArrayEquals(typeArray36, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertArrayEquals(typeArray37, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertArrayEquals(typeArray38, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertArrayEquals(typeArray40, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertArrayEquals(typeArray41, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertArrayEquals(typeArray42, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertArrayEquals(typeArray43, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertArrayEquals(typeArray44, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertArrayEquals(typeArray49, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertArrayEquals(typeArray50, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertArrayEquals(typeArray51, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertArrayEquals(typeArray52, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertArrayEquals(typeArray53, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertArrayEquals(typeArray55, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertArrayEquals(typeArray56, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertArrayEquals(typeArray57, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertArrayEquals(typeArray58, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertArrayEquals(typeArray59, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertArrayEquals(typeArray64, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertArrayEquals(typeArray65, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertArrayEquals(typeArray66, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertArrayEquals(typeArray67, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertArrayEquals(typeArray68, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertArrayEquals(typeArray70, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertArrayEquals(typeArray71, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertArrayEquals(typeArray72, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertArrayEquals(typeArray73, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertArrayEquals(typeArray74, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertArrayEquals(typeArray80, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertArrayEquals(typeArray83, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertArrayEquals(typeArray86, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
// flaky "4) test2508(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray94);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable5, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMultiKey8.toString();
        boolean boolean10 = strComparableMultiKey3.equals((java.lang.Object) str9);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable22, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMultiKey25.toString();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray32, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray35 = strComparableMultiKey34.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray35);
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable37, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableMultiKey40.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey16, strComparableMultiKey21, strComparableMultiKey25, strComparableMultiKey36, strComparableMultiKey40);
        boolean boolean43 = strComparableMultiKey3.equals((java.lang.Object) strComparableMultiKey25);
        int int44 = strComparableMultiKey25.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]");
        boolean boolean49 = strComparableMultiKey25.equals((java.lang.Object) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str4, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str26, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray35);
        org.junit.Assert.assertArrayEquals(strComparableArray35, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str41, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMultiKey14.toString();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = strComparableMultiKey23.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray24);
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable26, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMultiKey29.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey5, strComparableMultiKey10, strComparableMultiKey14, strComparableMultiKey25, strComparableMultiKey29);
        boolean boolean33 = strComparableMultiKey29.equals((java.lang.Object) 1.0d);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable45 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable45, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str49 = strComparableMultiKey48.toString();
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray55, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray58 = strComparableMultiKey57.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray58);
        java.lang.Comparable<java.lang.String> strComparable60 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable60, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str64 = strComparableMultiKey63.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey39, strComparableMultiKey44, strComparableMultiKey48, strComparableMultiKey59, strComparableMultiKey63);
        boolean boolean66 = strComparableMultiKey29.equals((java.lang.Object) strComparableMultiKey39);
        java.lang.Comparable<java.lang.String>[] strComparableArray67 = null; // flaky "5) test2510(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey29.getKeys();
        int int68 = strComparableMultiKey29.size();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray24);
        org.junit.Assert.assertArrayEquals(strComparableArray24, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str30, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str49, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray58);
        org.junit.Assert.assertArrayEquals(strComparableArray58, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str64, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky "5) test2510(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, true);
        java.lang.String str13 = strComparableMultiKey12.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = strComparableMultiKey12.getKeys();
        int int15 = strComparableMultiKey12.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[, hi!, hi!, , hi!]" + "'", str13, "MultiKey[, hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!, hi!, MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMultiKey4.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "", strComparable2, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray20 = strComparableMultiKey19.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray20);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray20, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray20);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray20);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray20, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMultiKey31.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey5, strComparableMultiKey11, strComparableMultiKey27, strComparableMultiKey31);
        java.lang.Comparable<java.lang.String>[] strComparableArray34 = null; // flaky "6) test2514(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey5.getKeys();
        int int35 = strComparableMultiKey5.size();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray20);
        org.junit.Assert.assertArrayEquals(strComparableArray20, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]" + "'", str32, "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]");
// flaky "6) test2514(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky "7) test2515(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "7) test2515(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = null; // flaky "3) test2515(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = null; // flaky "3) test2515(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = null; // flaky "2) test2515(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6);
// flaky "2) test2515(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray5);
// flaky "2) test2515(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = strComparableMultiKey12.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13, false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertArrayEquals(strComparableArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky "8) test2517(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "8) test2517(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky "4) test2517(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray5);
// flaky "4) test2517(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey11.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = strComparableMultiKey11.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = strComparableMultiKey11.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15);
        java.lang.Comparable<java.lang.String>[] strComparableArray19 = strComparableMultiKey18.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray20 = strComparableMultiKey18.getKeys();
        java.io.Serializable serializable21 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String[] strArray25 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34, true);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray42, true);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray34, strArray42, strArray47);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray25, strArray28, strArray42, strArray54);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray42, true);
        boolean boolean60 = strComparableMultiKey24.equals((java.lang.Object) strArray42);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) strComparableArray20, serializable21, (java.io.Serializable) strArray42);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray42, false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertArrayEquals(strComparableArray15, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray19);
        org.junit.Assert.assertArrayEquals(strComparableArray19, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray20);
        org.junit.Assert.assertArrayEquals(strComparableArray20, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[hi!, null], null], MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]], MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray3 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]> strArrayMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]>(strArray3, false);
        java.lang.String[][][][][] strArray6 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray7 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray8 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray9 = new java.lang.String[][][][][][] { strArray6, strArray7, strArray8 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]> strArrayMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]>(strArray9, false);
        java.lang.String[][][] strArray12 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray13 = new java.lang.String[][][][] { strArray12 };
        java.lang.String[][][][][] strArray14 = new java.lang.String[][][][][] { strArray13 };
        java.lang.String[][][] strArray15 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray16 = new java.lang.String[][][][] { strArray15 };
        java.lang.String[][][][][] strArray17 = new java.lang.String[][][][][] { strArray16 };
        java.lang.String[][][][][][] strArray18 = new java.lang.String[][][][][][] { strArray14, strArray17 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][][]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][][]>(strArray3, strArray9, strArray18);
        java.lang.String[][][][][] strArray20 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray21 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray22 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray23 = new java.lang.String[][][][][][] { strArray20, strArray21, strArray22 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]> strArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]>(strArray23, false);
        java.lang.String[][][][][] strArray26 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray27 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray28 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray29 = new java.lang.String[][][][][][] { strArray26, strArray27, strArray28 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]> strArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]>(strArray29, false);
        java.lang.String[][][] strArray32 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray33 = new java.lang.String[][][][] { strArray32 };
        java.lang.String[][][][][] strArray34 = new java.lang.String[][][][][] { strArray33 };
        java.lang.String[][][] strArray35 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray36 = new java.lang.String[][][][] { strArray35 };
        java.lang.String[][][][][] strArray37 = new java.lang.String[][][][][] { strArray36 };
        java.lang.String[][][][][][] strArray38 = new java.lang.String[][][][][][] { strArray34, strArray37 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][][]> strArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][][]>(strArray23, strArray29, strArray38);
        java.lang.String[][][][][] strArray40 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray41 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray42 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray43 = new java.lang.String[][][][][][] { strArray40, strArray41, strArray42 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]> strArrayMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]>(strArray43, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][][][][]> strComparableArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][][][][]>((java.lang.Comparable<java.lang.String>[][][][][][]) strArray18, (java.lang.Comparable<java.lang.String>[][][][][][]) strArray38, (java.lang.Comparable<java.lang.String>[][][][][][]) strArray43);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray4 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray4, false);
        java.lang.String[][][][] strArray7 = new java.lang.String[][][][] {};
        java.lang.String[][][] strArray8 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray9 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray10 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray11 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray12 = new java.lang.String[][][][] { strArray8, strArray9, strArray10, strArray11 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray4, strArray7, strArray12);
        java.lang.String[][][] strArray16 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray17 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray18 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray19 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray20 = new java.lang.String[][][][] { strArray16, strArray17, strArray18, strArray19 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray20, false);
        java.lang.String[][][][] strArray23 = new java.lang.String[][][][] {};
        java.lang.String[][][] strArray24 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray25 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray26 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray27 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray28 = new java.lang.String[][][][] { strArray24, strArray25, strArray26, strArray27 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray20, strArray23, strArray28);
        java.lang.String[][][] strArray32 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray33 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray34 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray35 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray36 = new java.lang.String[][][][] { strArray32, strArray33, strArray34, strArray35 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray36, false);
        java.lang.String[][][][] strArray39 = new java.lang.String[][][][] {};
        java.lang.String[][][] strArray40 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray41 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray42 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray43 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray44 = new java.lang.String[][][][] { strArray40, strArray41, strArray42, strArray43 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray44, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray36, strArray39, strArray44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][][]> strComparableArrayMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][][]>((java.lang.Comparable<java.lang.String>[][][][]) strArray12, (java.lang.Comparable<java.lang.String>[][][][]) strArray23, (java.lang.Comparable<java.lang.String>[][][][]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray12);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.reflect.AnnotatedElement[][][][][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][][]> annotatedElementArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][][]>(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][][][][][] {});
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray8, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray11 = strComparableMultiKey10.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray11, false);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMultiKey14.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray17 = strComparableMultiKey14.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray18 = strComparableMultiKey14.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray18, false);
        boolean boolean21 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey20);
        int int22 = strComparableMultiKey2.size();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray11);
        org.junit.Assert.assertArrayEquals(strComparableArray11, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray17);
        org.junit.Assert.assertArrayEquals(strComparableArray17, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray18);
        org.junit.Assert.assertArrayEquals(strComparableArray18, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray2, true);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, true);
        java.lang.Class<?> wildcardClass13 = strComparableMultiKey12.getClass();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19, true);
        java.lang.Class<?> wildcardClass22 = strComparableMultiKey21.getClass();
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28, true);
        java.lang.Class<?> wildcardClass31 = strComparableMultiKey30.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass13, (java.lang.reflect.GenericDeclaration) wildcardClass22, (java.lang.reflect.GenericDeclaration) wildcardClass31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableMultiKey36.toString();
        java.lang.String str38 = strComparableMultiKey36.toString();
        java.lang.String str39 = strComparableMultiKey36.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray40 = null; // flaky "9) test2524(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey36.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = null; // flaky "9) test2524(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray40, true);
        java.lang.Class<?> wildcardClass43 = null; // flaky "5) test2524(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableArray40.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass31;
        wildcardClassArray46[1] = wildcardClass43;
        java.lang.Class[][] classArray52 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray53 = (java.lang.Class<?>[][]) classArray52;
        wildcardClassArray53[0] = wildcardClassArray46;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[][]> wildcardClassArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[][]>(wildcardClassArray2, wildcardClassArray53);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>((java.lang.reflect.Type[][]) wildcardClassArray53, false);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str37, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str38, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str39, "MultiKey[hi!, hi!, hi!]");
// flaky "5) test2524(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray40);
// flaky "3) test2524(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(classArray45);
// flaky "3) test2524(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertArrayEquals(classArray45, new java.lang.Class[] { org.apache.commons.collections4.keyvalue.MultiKey.class, java.lang.Object[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray46);
// flaky "3) test2524(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] { org.apache.commons.collections4.keyvalue.MultiKey.class, java.lang.Object[].class });
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky "10) test2525(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "10) test2525(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = null; // flaky "6) test2525(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]" + "'", str4, "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]");
// flaky "6) test2525(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray5);
// flaky "4) test2525(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[hi!, null], null], MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null]]", strComparable3);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]");
        int int3 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null], MultiKey[, MultiKey[null, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]], null, MultiKey[hi!, null], MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]]]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!]]");
        int int5 = strComparableMultiKey4.size();
        int int6 = strComparableMultiKey4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMultiKey4.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], , null, hi!, ], MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]]");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], , MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]], MultiKey[hi!, hi!, hi!, hi!, MultiKey[null, hi!, hi!]]], MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[hi!, null], MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[hi!, null], , MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]]");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]");
        int int6 = strComparableMultiKey5.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky "11) test2532(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable19, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMultiKey22.toString();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray29, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray32 = strComparableMultiKey31.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray32);
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable34, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableMultiKey37.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18, strComparableMultiKey22, strComparableMultiKey33, strComparableMultiKey37);
        boolean boolean41 = strComparableMultiKey37.equals((java.lang.Object) 1.0d);
        java.lang.Comparable<java.lang.String>[] strComparableArray42 = null; // flaky "11) test2532(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey37.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = null; // flaky "7) test2532(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray42, true);
        boolean boolean45 = strComparableMultiKey5.equals((java.lang.Object) strComparableArray42);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
// flaky "7) test2532(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str23, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray32);
        org.junit.Assert.assertArrayEquals(strComparableArray32, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str38, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky "5) test2532(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "12) test2533(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
// flaky "12) test2533(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, ]");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "MultiKey[, ]" + "'", strComparable5, "MultiKey[, ]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable5, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMultiKey8.toString();
        boolean boolean10 = strComparableMultiKey3.equals((java.lang.Object) str9);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable22, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMultiKey25.toString();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray32, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray35 = strComparableMultiKey34.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray35);
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable37, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableMultiKey40.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey16, strComparableMultiKey21, strComparableMultiKey25, strComparableMultiKey36, strComparableMultiKey40);
        boolean boolean43 = strComparableMultiKey3.equals((java.lang.Object) strComparableMultiKey25);
        int int44 = strComparableMultiKey25.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray45 = null; // flaky "13) test2536(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey25.getKeys();
        java.lang.String str46 = strComparableMultiKey25.toString();
        java.lang.String str47 = strComparableMultiKey25.toString();
        java.lang.Class<?> wildcardClass48 = strComparableMultiKey25.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str4, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str26, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray35);
        org.junit.Assert.assertArrayEquals(strComparableArray35, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str41, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
// flaky "13) test2536(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str46, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str47, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray5, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        java.lang.Class<?> wildcardClass30 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray9, strArray17, strArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray29, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray0, strArray3, strArray17, strArray29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, true);
        int int37 = strComparableMultiKey36.size();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], hi!]");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey5.getKey(1);
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable8, strComparable9, (java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        java.lang.Class<?> wildcardClass18 = strComparableMultiKey17.getClass();
        java.lang.String[] strArray20 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray24 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray30 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray31 = new java.lang.String[][] { strArray20, strArray22, strArray24, strArray26, strArray28, strArray30 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray31, true);
        java.lang.Class<?> wildcardClass34 = strArray31.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass18, (java.lang.reflect.Type) wildcardClass34);
        boolean boolean36 = strComparableMultiKey11.equals((java.lang.Object) wildcardClass18);
        boolean boolean37 = strComparableMultiKey5.equals((java.lang.Object) boolean36);
        int int38 = strComparableMultiKey5.size();
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]" + "'", strComparable7, "MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]", strComparable7, (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]");
        boolean boolean12 = strComparableMultiKey10.equals((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass13 = strComparableMultiKey10.getClass();
        boolean boolean14 = strComparableMultiKey3.equals((java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = strComparableMultiKey3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]" + "'", str4, "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray18, true);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26, true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray18, strArray26, strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray18, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray18, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) strArray18, false);
        boolean boolean39 = strComparableMultiKey12.equals((java.lang.Object) strArray18);
        int int40 = strComparableMultiKey12.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray41 = strComparableMultiKey12.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray41);
        int int43 = strComparableMultiKey42.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(strComparableArray41);
        org.junit.Assert.assertArrayEquals(strComparableArray41, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ]");
        int int6 = strComparableMultiKey5.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky "14) test2542(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey5.getKeys();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
// flaky "14) test2542(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str6 = strComparableMultiKey5.toString();
        int int7 = strComparableMultiKey5.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], hi!]" + "'", str6, "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], hi!]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, null, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "15) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = null; // flaky "15) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]");
        java.lang.String str10 = strComparableMultiKey9.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray11 = null; // flaky "8) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = null; // flaky "8) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray11, false);
        java.lang.String[] strArray14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray23, true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, true);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray23, strArray31, strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray43, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray14, strArray17, strArray31, strArray43);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray49 = strComparableMultiKey48.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray4, strComparableArray11, strComparableArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = null; // flaky "6) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey53 = null; // flaky "4) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) strComparableArray11, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = null; // flaky "4) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray11);
// flaky "2) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]" + "'", str10, "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]");
// flaky "2) test2544(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray49);
        org.junit.Assert.assertArrayEquals(strComparableArray49, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, null, hi!]");
        java.lang.String str5 = strComparableMultiKey4.toString();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11, true);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19, true);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray11, strArray19, strArray24);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11, false);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray33, true);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray41, true);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray33, strArray41, strArray46);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54, true);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray62, true);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray54, strArray62, strArray67);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54, false);
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray76, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray11, strArray33, strArray48, strArray54, strArray76);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray48, false);
        java.lang.Class<?> wildcardClass82 = strArray48.getClass();
        boolean boolean83 = strComparableMultiKey4.equals((java.lang.Object) strArray48);
        java.lang.Comparable<java.lang.String>[] strComparableArray84 = null; // flaky "16) test2545(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        java.lang.String str85 = strComparableMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]], MultiKey[null, null, hi!]]" + "'", str5, "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]], MultiKey[null, null, hi!]]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
// flaky "16) test2545(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]], MultiKey[null, null, hi!]]" + "'", str85, "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]], MultiKey[null, null, hi!]]");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, null, hi!], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray3 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray3);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky "17) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray11 = null; // flaky "17) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.getKeys();
        java.lang.String str12 = strComparableMultiKey9.toString();
        java.lang.reflect.Type[][] typeArray13 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray14 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray15 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray16 = new java.lang.reflect.Type[][][] { typeArray13, typeArray14, typeArray15 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray16);
        java.lang.reflect.Type[][][] typeArray18 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][] typeArray19 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray20 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray21 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray22 = new java.lang.reflect.Type[][][] { typeArray19, typeArray20, typeArray21 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray16, typeArray18, typeArray22);
        boolean boolean25 = strComparableMultiKey9.equals((java.lang.Object) typeArray22);
        java.lang.reflect.Type[][] typeArray26 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray27 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray28 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray29 = new java.lang.reflect.Type[][][] { typeArray26, typeArray27, typeArray28 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray29);
        java.lang.reflect.Type[][][] typeArray31 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][] typeArray32 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray33 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray34 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray35 = new java.lang.reflect.Type[][][] { typeArray32, typeArray33, typeArray34 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray29, typeArray31, typeArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray43 = null; // flaky "9) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey42.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray44 = null; // flaky "9) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey42.getKeys();
        java.lang.String str45 = strComparableMultiKey42.toString();
        java.lang.reflect.Type[][] typeArray46 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray47 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray48 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray49 = new java.lang.reflect.Type[][][] { typeArray46, typeArray47, typeArray48 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray49);
        java.lang.reflect.Type[][][] typeArray51 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][] typeArray52 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray53 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray54 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray55 = new java.lang.reflect.Type[][][] { typeArray52, typeArray53, typeArray54 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray49, typeArray51, typeArray55);
        boolean boolean58 = strComparableMultiKey42.equals((java.lang.Object) typeArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray3, typeArray22, typeArray35, typeArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray35);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray3);
// flaky "7) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray10);
// flaky "5) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]" + "'", str12, "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]");
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertArrayEquals(typeArray13, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertArrayEquals(typeArray14, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertArrayEquals(typeArray15, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertArrayEquals(typeArray18, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertArrayEquals(typeArray19, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertArrayEquals(typeArray20, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertArrayEquals(typeArray21, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertArrayEquals(typeArray26, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertArrayEquals(typeArray27, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertArrayEquals(typeArray28, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertArrayEquals(typeArray31, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertArrayEquals(typeArray33, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray35);
// flaky "5) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray43);
// flaky "3) test2547(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]" + "'", str45, "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]");
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertArrayEquals(typeArray46, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertArrayEquals(typeArray47, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertArrayEquals(typeArray48, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertArrayEquals(typeArray51, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertArrayEquals(typeArray52, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertArrayEquals(typeArray53, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertArrayEquals(typeArray54, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][][][][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][][][][] { annotatedElementArray0, annotatedElementArray1 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]> annotatedElementArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]>(annotatedElementArray2, true);
        java.lang.reflect.AnnotatedElement[][][][][] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[][][][][] {};
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][][][][] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[][][][][] { annotatedElementArray6, annotatedElementArray7 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]> annotatedElementArrayMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]>(annotatedElementArray8, true);
        java.lang.reflect.AnnotatedElement[][][][][] annotatedElementArray11 = null;
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray12 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray13 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][][][][] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[][][][][] { annotatedElementArray12, annotatedElementArray13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]> annotatedElementArrayMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]>(annotatedElementArray14, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][][]> annotatedElementArrayMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][][]>(annotatedElementArray8, annotatedElementArray11, annotatedElementArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][][]> annotatedElementArrayMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][][]>(annotatedElementArray2, annotatedElementArray5, annotatedElementArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]> annotatedElementArrayMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][][]>(annotatedElementArray2, false);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertArrayEquals(annotatedElementArray1, new java.lang.reflect.AnnotatedElement[][][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        org.junit.Assert.assertArrayEquals(annotatedElementArray5, new java.lang.reflect.AnnotatedElement[][][][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        org.junit.Assert.assertArrayEquals(annotatedElementArray6, new java.lang.reflect.AnnotatedElement[][][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        org.junit.Assert.assertArrayEquals(annotatedElementArray7, new java.lang.reflect.AnnotatedElement[][][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertNotNull(annotatedElementArray12);
        org.junit.Assert.assertArrayEquals(annotatedElementArray12, new java.lang.reflect.AnnotatedElement[][][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray13);
        org.junit.Assert.assertArrayEquals(annotatedElementArray13, new java.lang.reflect.AnnotatedElement[][][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray14);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], null, MultiKey[, hi!, hi!, , hi!], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null], MultiKey[hi!, null], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], hi!, MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]], MultiKey[null, null, hi!]]");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!, hi!, MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky "18) test2552(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[hi!, hi!, hi!, hi!, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]]" + "'", str4, "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[hi!, hi!, hi!, hi!, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]]");
// flaky "18) test2552(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "19) test2553(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        java.lang.String str5 = strComparableMultiKey3.toString();
        java.lang.reflect.Type[][][] typeArray6 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray7 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray8 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray9 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray10 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray11 = new java.lang.reflect.Type[][][][] { typeArray6, typeArray7, typeArray8, typeArray9, typeArray10 };
        java.lang.reflect.Type[][][] typeArray12 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray13 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray14 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray15 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray16 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray17 = new java.lang.reflect.Type[][][][] { typeArray12, typeArray13, typeArray14, typeArray15, typeArray16 };
        java.lang.reflect.Type[][][] typeArray18 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray19 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray20 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray21 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray22 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray23 = new java.lang.reflect.Type[][][][] { typeArray18, typeArray19, typeArray20, typeArray21, typeArray22 };
        java.lang.reflect.Type[][][] typeArray24 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray25 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray26 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray27 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray28 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray29 = new java.lang.reflect.Type[][][][] { typeArray24, typeArray25, typeArray26, typeArray27, typeArray28 };
        java.lang.reflect.Type[][][] typeArray30 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray31 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray32 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray33 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray34 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray35 = new java.lang.reflect.Type[][][][] { typeArray30, typeArray31, typeArray32, typeArray33, typeArray34 };
        java.lang.reflect.Type[][][][][] typeArray36 = new java.lang.reflect.Type[][][][][] { typeArray11, typeArray17, typeArray23, typeArray29, typeArray35 };
        java.lang.reflect.Type[][][][][][] typeArray37 = new java.lang.reflect.Type[][][][][][] { typeArray36 };
        java.lang.reflect.Type[][][] typeArray38 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray39 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray40 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray41 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray42 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray43 = new java.lang.reflect.Type[][][][] { typeArray38, typeArray39, typeArray40, typeArray41, typeArray42 };
        java.lang.reflect.Type[][][] typeArray44 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray45 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray46 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray47 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray48 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray49 = new java.lang.reflect.Type[][][][] { typeArray44, typeArray45, typeArray46, typeArray47, typeArray48 };
        java.lang.reflect.Type[][][] typeArray50 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray51 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray52 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray53 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray54 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray55 = new java.lang.reflect.Type[][][][] { typeArray50, typeArray51, typeArray52, typeArray53, typeArray54 };
        java.lang.reflect.Type[][][] typeArray56 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray57 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray58 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray59 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray60 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray61 = new java.lang.reflect.Type[][][][] { typeArray56, typeArray57, typeArray58, typeArray59, typeArray60 };
        java.lang.reflect.Type[][][] typeArray62 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray63 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray64 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray65 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray66 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray67 = new java.lang.reflect.Type[][][][] { typeArray62, typeArray63, typeArray64, typeArray65, typeArray66 };
        java.lang.reflect.Type[][][][][] typeArray68 = new java.lang.reflect.Type[][][][][] { typeArray43, typeArray49, typeArray55, typeArray61, typeArray67 };
        java.lang.reflect.Type[][][][][][] typeArray69 = new java.lang.reflect.Type[][][][][][] { typeArray68 };
        java.lang.reflect.Type[][][][][][][] typeArray70 = new java.lang.reflect.Type[][][][][][][] { typeArray37, typeArray69 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]> typeArrayMultiKey71 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]>(typeArray70);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]> typeArrayMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]>(typeArray70);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]> typeArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]>(typeArray70, true);
        boolean boolean75 = strComparableMultiKey3.equals((java.lang.Object) typeArrayMultiKey74);
        java.lang.Class<?> wildcardClass76 = strComparableMultiKey3.getClass();
// flaky "19) test2553(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]" + "'", str5, "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]");
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertArrayEquals(typeArray6, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertArrayEquals(typeArray7, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertArrayEquals(typeArray8, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertArrayEquals(typeArray9, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertArrayEquals(typeArray10, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertArrayEquals(typeArray12, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertArrayEquals(typeArray13, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertArrayEquals(typeArray14, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertArrayEquals(typeArray15, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertArrayEquals(typeArray16, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertArrayEquals(typeArray18, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertArrayEquals(typeArray19, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertArrayEquals(typeArray20, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertArrayEquals(typeArray21, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertArrayEquals(typeArray22, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertArrayEquals(typeArray24, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertArrayEquals(typeArray25, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertArrayEquals(typeArray26, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertArrayEquals(typeArray27, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertArrayEquals(typeArray28, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertArrayEquals(typeArray30, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertArrayEquals(typeArray31, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertArrayEquals(typeArray33, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertArrayEquals(typeArray38, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertArrayEquals(typeArray39, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertArrayEquals(typeArray40, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertArrayEquals(typeArray41, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertArrayEquals(typeArray42, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertArrayEquals(typeArray44, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertArrayEquals(typeArray45, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertArrayEquals(typeArray46, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertArrayEquals(typeArray47, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertArrayEquals(typeArray48, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertArrayEquals(typeArray50, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertArrayEquals(typeArray51, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertArrayEquals(typeArray52, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertArrayEquals(typeArray53, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertArrayEquals(typeArray54, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertArrayEquals(typeArray56, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertArrayEquals(typeArray57, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertArrayEquals(typeArray58, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertArrayEquals(typeArray59, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertArrayEquals(typeArray60, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertArrayEquals(typeArray62, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertArrayEquals(typeArray63, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertArrayEquals(typeArray64, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertArrayEquals(typeArray65, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertArrayEquals(typeArray66, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[hi!, null], , MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]]");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27, true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35, true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray27, strArray35, strArray40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, true);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray56, true);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray48, strArray56, strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray70, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray27, strArray42, strArray48, strArray70);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        java.lang.Comparable<java.lang.String>[] strComparableArray76 = strComparableMultiKey75.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray76, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable80 = strComparableMultiKey78.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray76);
        org.junit.Assert.assertArrayEquals(strComparableArray76, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.reflect.Type[][][][][][][][] typeArray0 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray1 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray2 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray3 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray4 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray5 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][][] typeArray6 = new java.lang.reflect.Type[][][][][][][][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray6, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray6, true);
        java.lang.reflect.Type[][][][][][][][] typeArray11 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray12 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray13 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray14 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray15 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray16 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][][] typeArray17 = new java.lang.reflect.Type[][][][][][][][][] { typeArray11, typeArray12, typeArray13, typeArray14, typeArray15, typeArray16 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray17, false);
        java.lang.reflect.Type[][][][][][][][] typeArray20 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray21 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray22 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray23 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray24 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray25 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][][] typeArray26 = new java.lang.reflect.Type[][][][][][][][][] { typeArray20, typeArray21, typeArray22, typeArray23, typeArray24, typeArray25 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray26, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray26, true);
        java.lang.reflect.Type[][][][][][][][] typeArray31 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray32 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray33 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray34 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][][] typeArray35 = new java.lang.reflect.Type[][][][][][][][][] { typeArray31, typeArray32, typeArray33, typeArray34 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]> typeArrayMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]>(typeArray17, typeArray26, typeArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]> typeArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]>(typeArray6, typeArray26);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertArrayEquals(typeArray3, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertArrayEquals(typeArray4, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertArrayEquals(typeArray5, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertArrayEquals(typeArray11, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertArrayEquals(typeArray12, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertArrayEquals(typeArray13, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertArrayEquals(typeArray14, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertArrayEquals(typeArray15, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertArrayEquals(typeArray16, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertArrayEquals(typeArray20, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertArrayEquals(typeArray21, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertArrayEquals(typeArray22, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertArrayEquals(typeArray23, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertArrayEquals(typeArray24, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertArrayEquals(typeArray25, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertArrayEquals(typeArray31, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertArrayEquals(typeArray33, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray2, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray6 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray7 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray6;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray11 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray12 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray11;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray12, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray12, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray17 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]> comparableMultiKeyArrayMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]>(strComparableMultiKeyArray2, strComparableMultiKeyArray7, strComparableMultiKeyArray12, strComparableMultiKeyArray17);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray20 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray21 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray20;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray21, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray24 = null;
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray26 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray27 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray26;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray27, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray31 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray32 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray31;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray32, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray36 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray37 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray37, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray37, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray42 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]> comparableMultiKeyArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]>(strComparableMultiKeyArray27, strComparableMultiKeyArray32, strComparableMultiKeyArray37, strComparableMultiKeyArray42);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray45 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray46 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray45;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray46, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray50 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray51 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray50;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray51, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray55 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray56 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray55;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray56, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray56, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray61 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]> comparableMultiKeyArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]>(strComparableMultiKeyArray46, strComparableMultiKeyArray51, strComparableMultiKeyArray56, strComparableMultiKeyArray61);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray64 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray65 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray64;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray65, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray69 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray70 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray69;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray70, true);
        org.apache.commons.collections4.keyvalue.MultiKey[][][][] multiKeyArray74 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray75 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]) multiKeyArray74;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey77 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray75, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]> comparableMultiKeyArrayMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][]>(strComparableMultiKeyArray75, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][] strComparableMultiKeyArray80 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]> comparableMultiKeyArrayMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]>(strComparableMultiKeyArray65, strComparableMultiKeyArray70, strComparableMultiKeyArray75, strComparableMultiKeyArray80);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]> comparableMultiKeyArrayMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]>(strComparableMultiKeyArray32, strComparableMultiKeyArray61, strComparableMultiKeyArray70);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]> comparableMultiKeyArrayMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][]>(strComparableMultiKeyArray2, strComparableMultiKeyArray21, strComparableMultiKeyArray24, strComparableMultiKeyArray61);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertArrayEquals(multiKeyArray1, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray2);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray2, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray6);
        org.junit.Assert.assertArrayEquals(multiKeyArray6, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray7);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray7, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray11);
        org.junit.Assert.assertArrayEquals(multiKeyArray11, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray12);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray12, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray20);
        org.junit.Assert.assertArrayEquals(multiKeyArray20, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray21);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray21, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray26);
        org.junit.Assert.assertArrayEquals(multiKeyArray26, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray27);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray27, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray31);
        org.junit.Assert.assertArrayEquals(multiKeyArray31, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray32);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray32, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray36);
        org.junit.Assert.assertArrayEquals(multiKeyArray36, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray37);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray37, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray45);
        org.junit.Assert.assertArrayEquals(multiKeyArray45, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray46);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray46, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray50);
        org.junit.Assert.assertArrayEquals(multiKeyArray50, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray51);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray51, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray55);
        org.junit.Assert.assertArrayEquals(multiKeyArray55, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray56);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray56, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray64);
        org.junit.Assert.assertArrayEquals(multiKeyArray64, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray65);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray65, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray69);
        org.junit.Assert.assertArrayEquals(multiKeyArray69, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray70);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray70, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(multiKeyArray74);
        org.junit.Assert.assertArrayEquals(multiKeyArray74, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray75);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray75, new org.apache.commons.collections4.keyvalue.MultiKey[][][][] {});
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ]", strComparable2);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!]]" + "'", strComparable5, "MultiKey[, MultiKey[null, hi!, hi!]]");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ]], MultiKey[, MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[, MultiKey[null, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12, true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20, true);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray12, strArray20, strArray25);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray32, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray3, strArray6, strArray20, strArray32);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20, true);
        boolean boolean38 = strComparableMultiKey2.equals((java.lang.Object) strArray20);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20);
        java.lang.String str40 = strComparableMultiKey39.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "MultiKey[, hi!, hi!, , hi!]" + "'", str40, "MultiKey[, hi!, hi!, , hi!]");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky "20) test2562(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = null; // flaky "20) test2562(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray5, true);
        java.lang.Comparable<java.lang.String> strComparable9 = null; // flaky "10) test2562(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey7.getKey(0);
// flaky "10) test2562(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray5);
// flaky "8) test2562(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]" + "'", strComparable9, "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey11.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = strComparableMultiKey11.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = strComparableMultiKey11.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15, false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertArrayEquals(strComparableArray15, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "21) test2564(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        int int7 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = null; // flaky "21) test2564(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        java.lang.Class<?> wildcardClass9 = strComparableMultiKey3.getClass();
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
// flaky "11) test2564(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
// flaky "11) test2564(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "22) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        int int7 = strComparableMultiKey3.size();
        int int8 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = null; // flaky "22) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky "12) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = null; // flaky "12) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = null; // flaky "9) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray10);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
// flaky "6) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky "6) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray9);
// flaky "4) test2566(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray10);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "23) test2567(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey5.getKeys();
        java.lang.Class<?> wildcardClass7 = null; // flaky "23) test2567(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableArray6.getClass();
// flaky "13) test2567(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
// flaky "13) test2567(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]");
        java.lang.String str4 = strComparableMultiKey3.toString();
        boolean boolean6 = strComparableMultiKey3.equals((java.lang.Object) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky "24) test2568(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = null; // flaky "24) test2568(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray7, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]" + "'", str4, "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "14) test2568(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], hi!]");
        int int6 = strComparableMultiKey5.size();
        java.lang.String str7 = strComparableMultiKey5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[hi!, null], MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]], MultiKey[, ], MultiKey[MultiKey[hi!, hi!, hi!], hi!]]" + "'", str7, "MultiKey[, MultiKey[hi!, null], MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]], MultiKey[, ], MultiKey[MultiKey[hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]", strComparable2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass5 = strComparableMultiKey4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[hi!, null], null], MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null]]");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null], hi!, MultiKey[null, null, hi!], null, MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null], MultiKey[, MultiKey[null, hi!, hi!]]]");
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey11.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = strComparableMultiKey11.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = strComparableMultiKey11.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15);
        java.lang.Comparable<java.lang.String>[] strComparableArray19 = strComparableMultiKey18.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray26 = null; // flaky "25) test2573(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey25.getKeys();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray32, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray35 = strComparableMultiKey34.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray35, false);
        java.lang.Comparable<java.lang.String> strComparable40 = strComparableMultiKey38.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray41 = strComparableMultiKey38.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray42 = strComparableMultiKey38.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray42, false);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray50, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray53 = strComparableMultiKey52.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray53);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray53, false);
        java.lang.Comparable<java.lang.String>[] strComparableArray57 = strComparableMultiKey56.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray58 = strComparableMultiKey56.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray19, strComparableArray26, strComparableArray42, strComparableArray58);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray19);
        java.lang.String str61 = strComparableMultiKey60.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertArrayEquals(strComparableArray15, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray19);
        org.junit.Assert.assertArrayEquals(strComparableArray19, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
// flaky "25) test2573(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray35);
        org.junit.Assert.assertArrayEquals(strComparableArray35, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable40 + "' != '" + "hi!" + "'", strComparable40, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray41);
        org.junit.Assert.assertArrayEquals(strComparableArray41, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray42);
        org.junit.Assert.assertArrayEquals(strComparableArray42, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray53);
        org.junit.Assert.assertArrayEquals(strComparableArray53, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray57);
        org.junit.Assert.assertArrayEquals(strComparableArray57, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray58);
        org.junit.Assert.assertArrayEquals(strComparableArray58, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "MultiKey[, hi!, hi!, , hi!]" + "'", str61, "MultiKey[, hi!, hi!, , hi!]");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.String str5 = strComparableMultiKey3.toString();
        java.lang.String str6 = strComparableMultiKey3.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky "26) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = null; // flaky "26) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray7, true);
        java.lang.String str10 = null; // flaky "15) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.toString();
        int int11 = 0; // flaky "14) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.size();
        java.lang.String str12 = null; // flaky "10) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.toString();
        java.lang.String str13 = null; // flaky "7) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.toString();
        int int14 = 0; // flaky "7) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj19 = null;
        boolean boolean20 = strComparableMultiKey18.equals(obj19);
        int int21 = strComparableMultiKey18.size();
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey18.getKey((int) (byte) 0);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = null; // flaky "5) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey18.getKeys();
        java.lang.String str25 = strComparableMultiKey18.toString();
        int int26 = strComparableMultiKey18.size();
        boolean boolean27 = false; // flaky "3) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.equals((java.lang.Object) strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]");
        java.lang.Comparable<java.lang.String>[] strComparableArray38 = null; // flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey37.getKeys();
        boolean boolean39 = strComparableMultiKey32.equals((java.lang.Object) strComparableMultiKey37);
        boolean boolean40 = false; // flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.equals((java.lang.Object) strComparableMultiKey32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str4, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str5, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str6, "MultiKey[hi!, hi!, hi!]");
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray7);
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str10, "MultiKey[hi!, hi!, hi!]");
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str12, "MultiKey[hi!, hi!, hi!]");
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str13, "MultiKey[hi!, hi!, hi!]");
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiKey[hi!, hi!, hi!]" + "'", str25, "MultiKey[hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
// flaky "2) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "1) test2574(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMultiKey7.equals((java.lang.Object) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = strComparableMultiKey7.getKeys();
        java.lang.Class<?> wildcardClass15 = strComparableMultiKey7.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable11, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMultiKey14.toString();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = strComparableMultiKey23.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray24);
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable26, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMultiKey29.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey5, strComparableMultiKey10, strComparableMultiKey14, strComparableMultiKey25, strComparableMultiKey29);
        java.lang.String str32 = strComparableMultiKey10.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray33 = null; // flaky "27) test2576(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey10.getKeys();
        java.lang.Class<?> wildcardClass34 = strComparableMultiKey10.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray24);
        org.junit.Assert.assertArrayEquals(strComparableArray24, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str30, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]" + "'", str32, "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]");
// flaky "27) test2576(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = null; // flaky "28) test2577(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[, hi!, hi!, , hi!], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], hi!, MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]");
        boolean boolean9 = strComparableMultiKey2.equals((java.lang.Object) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], hi!, MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!]]");
// flaky "28) test2577(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]");
        java.lang.Comparable[][] comparableArray5 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][]) comparableArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray16 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray18 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray8, strArray10, strArray12, strArray14, strArray16, strArray18 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray19, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray6, (java.lang.Comparable<java.lang.String>[][]) strArray19);
        java.lang.Comparable[][] comparableArray24 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray25 = (java.lang.Comparable<java.lang.String>[][]) comparableArray24;
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray29 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray31 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray35 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray37 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray38 = new java.lang.String[][] { strArray27, strArray29, strArray31, strArray33, strArray35, strArray37 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray38, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray25, (java.lang.Comparable<java.lang.String>[][]) strArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray6, (java.lang.Comparable<java.lang.String>[][]) strArray38);
        boolean boolean43 = strComparableMultiKey3.equals((java.lang.Object) strArray38);
        java.lang.Object obj44 = null;
        boolean boolean45 = strComparableMultiKey3.equals(obj44);
        int int46 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray47 = null; // flaky "29) test2578(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertArrayEquals(comparableArray5, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertArrayEquals(strComparableArray6, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(comparableArray24);
        org.junit.Assert.assertArrayEquals(comparableArray24, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray25);
        org.junit.Assert.assertArrayEquals(strComparableArray25, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
// flaky "29) test2578(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray47);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]");
        int int4 = strComparableMultiKey3.size();
        java.lang.String str5 = strComparableMultiKey3.toString();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray6, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray6, true);
        boolean boolean11 = strComparableMultiKey3.equals((java.lang.Object) typeMultiKey10);
        java.lang.Comparable<java.lang.String>[] strComparableArray12 = null; // flaky "30) test2579(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray14 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[]>(genericDeclarationArray14);
        java.lang.Class<?> wildcardClass16 = genericDeclarationArray14.getClass();
        boolean boolean17 = strComparableMultiKey3.equals((java.lang.Object) genericDeclarationArray14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[null, hi!, hi!]]" + "'", str5, "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[null, hi!, hi!]]");
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertArrayEquals(typeArray6, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "30) test2579(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray13, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[, hi!, hi!, , hi!], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!, hi!], MultiKey[, MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]], MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!]], MultiKey[null, hi!, hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[hi!, null], , MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[hi!, null], null], MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]], MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]]]");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMultiKey13.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, hi!, hi!], , ]");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], , null, hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null], MultiKey[, MultiKey[null, hi!, hi!]]], MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray18, true);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26, true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray18, strArray26, strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray18, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray18, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) strArray18, false);
        boolean boolean39 = strComparableMultiKey12.equals((java.lang.Object) strArray18);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray45, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray48 = strComparableMultiKey47.getKeys();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray57 = strComparableMultiKey56.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray57);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray57, false);
        java.lang.Comparable<java.lang.String>[] strComparableArray61 = strComparableMultiKey60.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray62 = strComparableMultiKey60.getKeys();
        java.lang.Comparable<java.lang.String> strComparable63 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable63, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String>[] strComparableArray67 = null; // flaky "31) test2584(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey66.getKeys();
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray73, true);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray81, true);
        java.lang.String[] strArray86 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey87 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray73, strArray81, strArray86);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray73, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey91 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray73, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) strArray73, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray73, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[]) strArray18, strComparableArray48, strComparableArray62, strComparableArray67, (java.lang.Comparable<java.lang.String>[]) strArray73);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey97 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray73);
        java.lang.String str98 = strComparableMultiKey97.toString();
        int int99 = strComparableMultiKey97.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray48);
        org.junit.Assert.assertArrayEquals(strComparableArray48, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray57);
        org.junit.Assert.assertArrayEquals(strComparableArray57, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray61);
        org.junit.Assert.assertArrayEquals(strComparableArray61, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray62);
        org.junit.Assert.assertArrayEquals(strComparableArray62, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
// flaky "31) test2584(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "MultiKey[, hi!, hi!, , hi!]" + "'", str98, "MultiKey[, hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 5 + "'", int99 == 5);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]", strComparable1);
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = null; // flaky "32) test2585(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey2.getKeys();
// flaky "32) test2585(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        int int3 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[, MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], , , MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, null, hi!], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]]]");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]], MultiKey[null, null, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27, true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35, true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray27, strArray35, strArray40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, true);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray56, true);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray48, strArray56, strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray70, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray27, strArray42, strArray48, strArray70);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        java.lang.Comparable<java.lang.String>[] strComparableArray76 = strComparableMultiKey75.getKeys();
        java.lang.Comparable<java.lang.String> strComparable78 = strComparableMultiKey75.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray79 = strComparableMultiKey75.getKeys();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray76);
        org.junit.Assert.assertArrayEquals(strComparableArray76, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable78 + "' != '" + "hi!" + "'", strComparable78, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray79);
        org.junit.Assert.assertArrayEquals(strComparableArray79, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!]], MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!], MultiKey[null, MultiKey[hi!, null], MultiKey[, hi!, hi!, , hi!]], MultiKey[, MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]], MultiKey[null, null, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], , null, hi!, ], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], MultiKey[, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!], ]");
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = null; // flaky "33) test2590(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey7.getKeys();
        boolean boolean9 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey7);
// flaky "33) test2590(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]");
        int int4 = strComparableMultiKey3.size();
        int int5 = strComparableMultiKey3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey3.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky "34) test2592(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "34) test2592(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        int int7 = strComparableMultiKey4.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = null; // flaky "16) test2592(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!]]");
        boolean boolean14 = strComparableMultiKey4.equals((java.lang.Object) "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[, hi!, hi!, , hi!], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!, hi!]");
        boolean boolean18 = strComparableMultiKey4.equals((java.lang.Object) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[, hi!, hi!, , hi!], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!, hi!]");
        int int19 = strComparableMultiKey4.size();
// flaky "15) test2592(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray5);
// flaky "11) test2592(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
// flaky "8) test2592(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.Comparable<java.lang.String>[] strComparableArray27 = strComparableMultiKey26.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray27, true);
        boolean boolean31 = strComparableMultiKey29.equals((java.lang.Object) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[hi!, null], MultiKey[MultiKey[hi!, null], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]]");
        java.lang.String str32 = strComparableMultiKey29.toString();
        int int33 = strComparableMultiKey29.size();
        java.lang.String str34 = strComparableMultiKey29.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray27);
        org.junit.Assert.assertArrayEquals(strComparableArray27, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiKey[, hi!, hi!, , hi!]" + "'", str32, "MultiKey[, hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MultiKey[, hi!, hi!, , hi!]" + "'", str34, "MultiKey[, hi!, hi!, , hi!]");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[hi!, null], null], MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null]]", strComparable1);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey11.getKey((int) (short) 0);
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = strComparableMultiKey11.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj20 = null;
        boolean boolean21 = strComparableMultiKey19.equals(obj20);
        boolean boolean23 = strComparableMultiKey19.equals((java.lang.Object) (byte) 0);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = null; // flaky "35) test2595(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey19.getKeys();
        int int25 = strComparableMultiKey19.size();
        boolean boolean26 = strComparableMultiKey15.equals((java.lang.Object) int25);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "35) test2595(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, null, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]");
        java.lang.String str6 = strComparableMultiKey5.toString();
        java.lang.String[] strArray7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray16, true);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray24, true);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray16, strArray24, strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray7, strArray10, strArray24, strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean42 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey41);
        int int43 = strComparableMultiKey41.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null], hi!, MultiKey[null, null, hi!], null, MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]]" + "'", str6, "MultiKey[MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], hi!, MultiKey[hi!, null], null], hi!, MultiKey[null, null, hi!], null, MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.String[] strArray1 = new java.lang.String[] { "MultiKey[, MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray1, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMultiKey6.size();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable8, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMultiKey11.toString();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable13, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMultiKey16.toString();
        boolean boolean18 = strComparableMultiKey11.equals((java.lang.Object) str17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable30, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMultiKey33.toString();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray40, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray43 = strComparableMultiKey42.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray43);
        java.lang.Comparable<java.lang.String> strComparable45 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable45, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str49 = strComparableMultiKey48.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey24, strComparableMultiKey29, strComparableMultiKey33, strComparableMultiKey44, strComparableMultiKey48);
        boolean boolean51 = strComparableMultiKey11.equals((java.lang.Object) strComparableMultiKey33);
        java.lang.Comparable<java.lang.String> strComparable53 = strComparableMultiKey11.getKey(1);
        java.lang.String str54 = strComparableMultiKey11.toString();
        int int55 = strComparableMultiKey11.size();
        boolean boolean56 = strComparableMultiKey6.equals((java.lang.Object) strComparableMultiKey11);
        boolean boolean57 = strComparableMultiKey3.equals((java.lang.Object) strComparableMultiKey11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        java.lang.Class<?> wildcardClass64 = strComparableMultiKey63.getClass();
        java.lang.String[] strArray66 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray68 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray70 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray72 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray74 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray76 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray77 = new java.lang.String[][] { strArray66, strArray68, strArray70, strArray72, strArray74, strArray76 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray77, true);
        java.lang.Class<?> wildcardClass80 = strArray77.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass64, (java.lang.reflect.Type) wildcardClass80);
        boolean boolean82 = strComparableMultiKey3.equals((java.lang.Object) wildcardClass80);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "MultiKey[, MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]]" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str12, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str17, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str34, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray43);
        org.junit.Assert.assertArrayEquals(strComparableArray43, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str49, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + strComparable53 + "' != '" + "hi!" + "'", strComparable53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str54, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray4 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray4, false);
        java.lang.String[][][][] strArray7 = new java.lang.String[][][][] {};
        java.lang.String[][][] strArray8 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray9 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray10 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray11 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray12 = new java.lang.String[][][][] { strArray8, strArray9, strArray10, strArray11 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray4, strArray7, strArray12);
        java.lang.String[][][] strArray16 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray17 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray18 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray19 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray20 = new java.lang.String[][][][] { strArray16, strArray17, strArray18, strArray19 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray20, false);
        java.lang.String[][][][] strArray23 = new java.lang.String[][][][] {};
        java.lang.String[][][] strArray24 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray25 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray26 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray27 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray28 = new java.lang.String[][][][] { strArray24, strArray25, strArray26, strArray27 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray20, strArray23, strArray28);
        java.lang.String[][][] strArray32 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray33 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray34 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray35 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray36 = new java.lang.String[][][][] { strArray32, strArray33, strArray34, strArray35 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray36, false);
        java.lang.String[][][][] strArray39 = new java.lang.String[][][][] {};
        java.lang.String[][][] strArray40 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray41 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray42 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray43 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray44 = new java.lang.String[][][][] { strArray40, strArray41, strArray42, strArray43 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray44, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray36, strArray39, strArray44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][][]> strComparableArrayMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][][]>((java.lang.Comparable<java.lang.String>[][][][]) strArray12, (java.lang.Comparable<java.lang.String>[][][][]) strArray23, (java.lang.Comparable<java.lang.String>[][][][]) strArray36);
        java.lang.String[][][] strArray49 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray50 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray51 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray52 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray53 = new java.lang.String[][][][] { strArray49, strArray50, strArray51, strArray52 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray53, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray53, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray36, strArray53);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray53);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], , MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, null, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "36) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = null; // flaky "36) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]");
        java.lang.String str10 = strComparableMultiKey9.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray11 = null; // flaky "17) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey9.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = null; // flaky "16) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray11, false);
        java.lang.String[] strArray14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray23, true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, true);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray23, strArray31, strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray43, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray14, strArray17, strArray31, strArray43);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray49 = strComparableMultiKey48.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray4, strComparableArray11, strComparableArray49);
        java.lang.Class<?> wildcardClass51 = null; // flaky "12) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableArray4.getClass();
// flaky "9) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]" + "'", str10, "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]");
// flaky "8) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray49);
        org.junit.Assert.assertArrayEquals(strComparableArray49, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
// flaky "6) test2600(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[hi!, null], null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, ], MultiKey[, MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!], MultiKey[MultiKey[hi!, hi!, hi!], hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[, MultiKey[null, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], null, MultiKey[hi!, MultiKey[null, hi!, hi!], , ], , hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[MultiKey[hi!, null], MultiKey[hi!, null], , MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]], hi!, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], null, MultiKey[hi!, MultiKey[null, hi!, hi!], , ], , hi!]]");
        boolean boolean9 = strComparableMultiKey4.equals((java.lang.Object) "MultiKey[null, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[, MultiKey[null, hi!, hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.collections4.keyvalue.MultiKey[][][][][][][][][][] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0][][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][][][][][][][] strComparableMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][][][][][][][]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][][][][][][]> comparableMultiKeyArrayMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][][][][][][][][]>(strComparableMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertArrayEquals(multiKeyArray1, new org.apache.commons.collections4.keyvalue.MultiKey[][][][][][][][][][] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray2);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray2, new org.apache.commons.collections4.keyvalue.MultiKey[][][][][][][][][][] {});
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray2 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray3 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray4 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray5 = new java.lang.reflect.Type[][][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.lang.reflect.Type[][][] typeArray6 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray7 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray8 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray9 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray10 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray11 = new java.lang.reflect.Type[][][][] { typeArray6, typeArray7, typeArray8, typeArray9, typeArray10 };
        java.lang.reflect.Type[][][] typeArray12 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray13 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray14 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray15 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray16 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray17 = new java.lang.reflect.Type[][][][] { typeArray12, typeArray13, typeArray14, typeArray15, typeArray16 };
        java.lang.reflect.Type[][][] typeArray18 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray19 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray20 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray21 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray22 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray23 = new java.lang.reflect.Type[][][][] { typeArray18, typeArray19, typeArray20, typeArray21, typeArray22 };
        java.lang.reflect.Type[][][] typeArray24 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray25 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray26 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray27 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray28 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray29 = new java.lang.reflect.Type[][][][] { typeArray24, typeArray25, typeArray26, typeArray27, typeArray28 };
        java.lang.reflect.Type[][][][][] typeArray30 = new java.lang.reflect.Type[][][][][] { typeArray5, typeArray11, typeArray17, typeArray23, typeArray29 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray30);
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray33 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray34 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray35 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray36 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray37 = new java.lang.reflect.Type[][] { typeArray32, typeArray33, typeArray34, typeArray35, typeArray36 };
        java.lang.reflect.Type[][][] typeArray38 = new java.lang.reflect.Type[][][] { typeArray37 };
        java.lang.reflect.Type[][][][] typeArray39 = new java.lang.reflect.Type[][][][] { typeArray38 };
        java.lang.reflect.Type[] typeArray40 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray41 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray42 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray44 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray45 = new java.lang.reflect.Type[][] { typeArray40, typeArray41, typeArray42, typeArray43, typeArray44 };
        java.lang.reflect.Type[][][] typeArray46 = new java.lang.reflect.Type[][][] { typeArray45 };
        java.lang.reflect.Type[][][][] typeArray47 = new java.lang.reflect.Type[][][][] { typeArray46 };
        java.lang.reflect.Type[] typeArray48 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray49 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray51 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray52 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray53 = new java.lang.reflect.Type[][] { typeArray48, typeArray49, typeArray50, typeArray51, typeArray52 };
        java.lang.reflect.Type[][][] typeArray54 = new java.lang.reflect.Type[][][] { typeArray53 };
        java.lang.reflect.Type[][][][] typeArray55 = new java.lang.reflect.Type[][][][] { typeArray54 };
        java.lang.reflect.Type[][][][][] typeArray56 = new java.lang.reflect.Type[][][][][] { typeArray39, typeArray47, typeArray55 };
        java.lang.reflect.Type[][][] typeArray57 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray58 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray59 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray60 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray61 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray62 = new java.lang.reflect.Type[][][][] { typeArray57, typeArray58, typeArray59, typeArray60, typeArray61 };
        java.lang.reflect.Type[][][] typeArray63 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray64 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray65 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray66 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray67 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray68 = new java.lang.reflect.Type[][][][] { typeArray63, typeArray64, typeArray65, typeArray66, typeArray67 };
        java.lang.reflect.Type[][][] typeArray69 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray70 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray71 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray72 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray73 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray74 = new java.lang.reflect.Type[][][][] { typeArray69, typeArray70, typeArray71, typeArray72, typeArray73 };
        java.lang.reflect.Type[][][] typeArray75 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray76 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray77 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray78 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray79 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray80 = new java.lang.reflect.Type[][][][] { typeArray75, typeArray76, typeArray77, typeArray78, typeArray79 };
        java.lang.reflect.Type[][][] typeArray81 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray82 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray83 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray84 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray85 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray86 = new java.lang.reflect.Type[][][][] { typeArray81, typeArray82, typeArray83, typeArray84, typeArray85 };
        java.lang.reflect.Type[][][][][] typeArray87 = new java.lang.reflect.Type[][][][][] { typeArray62, typeArray68, typeArray74, typeArray80, typeArray86 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey88 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray87);
        java.lang.reflect.Type[][][][] typeArray89 = new java.lang.reflect.Type[][][][] {};
        java.lang.reflect.Type[][][][] typeArray90 = new java.lang.reflect.Type[][][][] {};
        java.lang.reflect.Type[][][][][] typeArray91 = new java.lang.reflect.Type[][][][][] { typeArray89, typeArray90 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]> typeArrayMultiKey92 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][]>(typeArray30, typeArray56, typeArray87, typeArray91);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey94 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray30, false);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertArrayEquals(typeArray3, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertArrayEquals(typeArray4, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertArrayEquals(typeArray6, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertArrayEquals(typeArray7, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertArrayEquals(typeArray8, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertArrayEquals(typeArray9, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertArrayEquals(typeArray10, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertArrayEquals(typeArray12, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertArrayEquals(typeArray13, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertArrayEquals(typeArray14, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertArrayEquals(typeArray15, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertArrayEquals(typeArray16, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertArrayEquals(typeArray18, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertArrayEquals(typeArray19, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertArrayEquals(typeArray20, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertArrayEquals(typeArray21, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertArrayEquals(typeArray22, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertArrayEquals(typeArray24, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertArrayEquals(typeArray25, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertArrayEquals(typeArray26, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertArrayEquals(typeArray27, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertArrayEquals(typeArray28, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertArrayEquals(typeArray33, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertArrayEquals(typeArray35, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertArrayEquals(typeArray36, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertArrayEquals(typeArray40, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertArrayEquals(typeArray41, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertArrayEquals(typeArray42, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertArrayEquals(typeArray43, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertArrayEquals(typeArray44, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertArrayEquals(typeArray48, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertArrayEquals(typeArray49, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertArrayEquals(typeArray50, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertArrayEquals(typeArray51, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertArrayEquals(typeArray52, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertArrayEquals(typeArray57, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertArrayEquals(typeArray58, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertArrayEquals(typeArray59, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertArrayEquals(typeArray60, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertArrayEquals(typeArray61, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertArrayEquals(typeArray63, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertArrayEquals(typeArray64, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertArrayEquals(typeArray65, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertArrayEquals(typeArray66, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertArrayEquals(typeArray67, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertArrayEquals(typeArray69, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertArrayEquals(typeArray70, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertArrayEquals(typeArray71, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertArrayEquals(typeArray72, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertArrayEquals(typeArray73, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertArrayEquals(typeArray75, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertArrayEquals(typeArray76, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertArrayEquals(typeArray77, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertArrayEquals(typeArray78, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertArrayEquals(typeArray79, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertArrayEquals(typeArray81, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertArrayEquals(typeArray82, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertArrayEquals(typeArray83, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertArrayEquals(typeArray84, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertArrayEquals(typeArray85, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(typeArray89);
        org.junit.Assert.assertArrayEquals(typeArray89, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertArrayEquals(typeArray90, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray91);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, null]");
        java.lang.String str3 = strComparableMultiKey2.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "37) test2604(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = null; // flaky "37) test2604(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray4, false);
        java.lang.String str7 = null; // flaky "18) test2604(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]" + "'", str3, "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]");
// flaky "17) test2604(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
// flaky "13) test2604(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]" + "'", str7, "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, null]]");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable15, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMultiKey18.toString();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray25, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray28 = strComparableMultiKey27.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray28);
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable30, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMultiKey33.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey9, strComparableMultiKey14, strComparableMultiKey18, strComparableMultiKey29, strComparableMultiKey33);
        java.lang.Comparable[][] comparableArray37 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray38 = (java.lang.Comparable<java.lang.String>[][]) comparableArray37;
        java.lang.String[] strArray40 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray42 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray44 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray46 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray48 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray50 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray51 = new java.lang.String[][] { strArray40, strArray42, strArray44, strArray46, strArray48, strArray50 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray51, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray38, (java.lang.Comparable<java.lang.String>[][]) strArray51);
        java.lang.Comparable<java.lang.String>[][] strComparableArray55 = null;
        java.lang.Comparable[][] comparableArray57 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray58 = (java.lang.Comparable<java.lang.String>[][]) comparableArray57;
        java.lang.String[] strArray60 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray62 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray64 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray66 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray68 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray70 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray71 = new java.lang.String[][] { strArray60, strArray62, strArray64, strArray66, strArray68, strArray70 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray71, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray58, (java.lang.Comparable<java.lang.String>[][]) strArray71);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>((java.lang.Comparable<java.lang.String>[][]) strArray51, strComparableArray55, (java.lang.Comparable<java.lang.String>[][]) strArray71);
        boolean boolean76 = strComparableMultiKey18.equals((java.lang.Object) strArray51);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray51, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray51);
        boolean boolean80 = strComparableMultiKey3.equals((java.lang.Object) strArray51);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray51, false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str19, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray28);
        org.junit.Assert.assertArrayEquals(strComparableArray28, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str34, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(comparableArray37);
        org.junit.Assert.assertArrayEquals(comparableArray37, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray38);
        org.junit.Assert.assertArrayEquals(strComparableArray38, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(comparableArray57);
        org.junit.Assert.assertArrayEquals(comparableArray57, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray58);
        org.junit.Assert.assertArrayEquals(strComparableArray58, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = null; // flaky "38) test2606(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey2.getKeys();
        int int4 = strComparableMultiKey2.size();
// flaky "38) test2606(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "39) test2607(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = null; // flaky "39) test2607(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = null; // flaky "19) test2607(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray4, false);
// flaky "18) test2607(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], hi!, MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray8 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray9 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray8;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray22 = new org.apache.commons.collections4.keyvalue.MultiKey[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray23 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray22;
        strComparableMultiKeyArray23[0] = strComparableMultiKey15;
        strComparableMultiKeyArray23[1] = strComparableMultiKey19;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableMultiKey38.size();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray41 = new org.apache.commons.collections4.keyvalue.MultiKey[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray42 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray41;
        strComparableMultiKeyArray42[0] = strComparableMultiKey34;
        strComparableMultiKeyArray42[1] = strComparableMultiKey38;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray42);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray49 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray50 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray49;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]> comparableMultiKeyArrayMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]>(strComparableMultiKeyArray23, strComparableMultiKeyArray42, (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int62 = strComparableMultiKey61.size();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray64 = new org.apache.commons.collections4.keyvalue.MultiKey[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray65 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray64;
        strComparableMultiKeyArray65[0] = strComparableMultiKey57;
        strComparableMultiKeyArray65[1] = strComparableMultiKey61;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray65);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey80 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int81 = strComparableMultiKey80.size();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray83 = new org.apache.commons.collections4.keyvalue.MultiKey[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray84 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray83;
        strComparableMultiKeyArray84[0] = strComparableMultiKey76;
        strComparableMultiKeyArray84[1] = strComparableMultiKey80;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray84);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray91 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray92 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray91;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]> comparableMultiKeyArrayMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]>(strComparableMultiKeyArray65, strComparableMultiKeyArray84, (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray91);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]> comparableMultiKeyArrayMultiKey94 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]>(strComparableMultiKeyArray6, strComparableMultiKeyArray9, strComparableMultiKeyArray23, strComparableMultiKeyArray65);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray9);
        boolean boolean96 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKeyMultiKey95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable98 = strComparableMultiKey5.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(multiKeyArray8);
        org.junit.Assert.assertArrayEquals(multiKeyArray8, new org.apache.commons.collections4.keyvalue.MultiKey[] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray9);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray9, new org.apache.commons.collections4.keyvalue.MultiKey[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(multiKeyArray22);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray23);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(multiKeyArray41);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray42);
        org.junit.Assert.assertNotNull(multiKeyArray49);
        org.junit.Assert.assertArrayEquals(multiKeyArray49, new org.apache.commons.collections4.keyvalue.MultiKey[] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray50);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray50, new org.apache.commons.collections4.keyvalue.MultiKey[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(multiKeyArray64);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray65);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
        org.junit.Assert.assertNotNull(multiKeyArray83);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray84);
        org.junit.Assert.assertNotNull(multiKeyArray91);
        org.junit.Assert.assertArrayEquals(multiKeyArray91, new org.apache.commons.collections4.keyvalue.MultiKey[] {});
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray92);
        org.junit.Assert.assertArrayEquals(strComparableMultiKeyArray92, new org.apache.commons.collections4.keyvalue.MultiKey[] {});
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]");
        boolean boolean6 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey5);
        int int7 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!], MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]]");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]");
        int int17 = strComparableMultiKey16.size();
        boolean boolean18 = strComparableMultiKey13.equals((java.lang.Object) int17);
        int int19 = strComparableMultiKey13.size();
        java.lang.reflect.Type[][][][] typeArray20 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray20);
        java.lang.reflect.Type[][][][] typeArray22 = null;
        java.lang.reflect.Type[][][][] typeArray23 = null;
        java.lang.reflect.Type[][][][] typeArray24 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray20, typeArray22, typeArray23, typeArray24);
        java.lang.reflect.Type[][][] typeArray26 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray27 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray28 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray29 = new java.lang.reflect.Type[][][][] { typeArray26, typeArray27, typeArray28 };
        java.lang.reflect.Type[][][][] typeArray30 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray30);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray29, typeArray30);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray20, typeArray30);
        java.lang.reflect.Type[][][][] typeArray34 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray34);
        java.lang.reflect.Type[][][][] typeArray36 = null;
        java.lang.reflect.Type[][][][] typeArray37 = null;
        java.lang.reflect.Type[][][][] typeArray38 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray34, typeArray36, typeArray37, typeArray38);
        java.lang.reflect.Type[][][] typeArray40 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray41 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray42 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray43 = new java.lang.reflect.Type[][][][] { typeArray40, typeArray41, typeArray42 };
        java.lang.reflect.Type[][][][] typeArray44 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray43, typeArray44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray34, typeArray44);
        java.lang.reflect.Type[][][][] typeArray48 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray48);
        java.lang.reflect.Type[][][][] typeArray50 = null;
        java.lang.reflect.Type[][][][] typeArray51 = null;
        java.lang.reflect.Type[][][][] typeArray52 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray48, typeArray50, typeArray51, typeArray52);
        java.lang.reflect.Type[][][] typeArray54 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray55 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray56 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray57 = new java.lang.reflect.Type[][][][] { typeArray54, typeArray55, typeArray56 };
        java.lang.reflect.Type[][][][] typeArray58 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray58);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray57, typeArray58);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray48, typeArray58);
        java.lang.reflect.Type[][][][] typeArray62 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray62);
        java.lang.reflect.Type[][][][] typeArray64 = null;
        java.lang.reflect.Type[][][][] typeArray65 = null;
        java.lang.reflect.Type[][][][] typeArray66 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray62, typeArray64, typeArray65, typeArray66);
        java.lang.reflect.Type[][][] typeArray68 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray69 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray70 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray71 = new java.lang.reflect.Type[][][][] { typeArray68, typeArray69, typeArray70 };
        java.lang.reflect.Type[][][][] typeArray72 = new java.lang.reflect.Type[][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray72);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray71, typeArray72);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray62, typeArray72);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]> typeArrayMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][]>(typeArray30, typeArray34, typeArray58, typeArray62);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray34, false);
        boolean boolean79 = strComparableMultiKey13.equals((java.lang.Object) typeArray34);
        java.lang.Class<?> wildcardClass80 = typeArray34.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertArrayEquals(typeArray20, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertArrayEquals(typeArray26, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertArrayEquals(typeArray27, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertArrayEquals(typeArray28, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertArrayEquals(typeArray30, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertArrayEquals(typeArray40, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertArrayEquals(typeArray41, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertArrayEquals(typeArray42, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertArrayEquals(typeArray44, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertArrayEquals(typeArray48, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertArrayEquals(typeArray54, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertArrayEquals(typeArray55, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertArrayEquals(typeArray56, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertArrayEquals(typeArray58, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertArrayEquals(typeArray62, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertArrayEquals(typeArray68, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertArrayEquals(typeArray69, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertArrayEquals(typeArray70, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertArrayEquals(typeArray72, new java.lang.reflect.Type[][][][] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], , hi!, hi!, ]", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ]]");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "40) test2613(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = null; // flaky "40) test2613(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray4, false);
        java.lang.String str7 = null; // flaky "20) test2613(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey6.toString();
        int int8 = 0; // flaky "19) test2613(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey6.size();
// flaky "14) test2613(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
// flaky "10) test2613(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str7, "MultiKey[null, hi!, hi!]");
// flaky "9) test2613(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.reflect.Type[][][][][][] typeArray0 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray1 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray2 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray3 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray4 = new java.lang.reflect.Type[][][][][][][] { typeArray0, typeArray1, typeArray2, typeArray3 };
        java.lang.reflect.Type[][][][][][] typeArray5 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray6 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray7 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray8 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray9 = new java.lang.reflect.Type[][][][][][][] { typeArray5, typeArray6, typeArray7, typeArray8 };
        java.lang.reflect.Type[][][][][][] typeArray10 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray11 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray12 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray13 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray14 = new java.lang.reflect.Type[][][][][][][] { typeArray10, typeArray11, typeArray12, typeArray13 };
        java.lang.reflect.Type[][][][][][] typeArray15 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray16 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray17 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray18 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray19 = new java.lang.reflect.Type[][][][][][][] { typeArray15, typeArray16, typeArray17, typeArray18 };
        java.lang.reflect.Type[][][][][][] typeArray20 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray21 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray22 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray23 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray24 = new java.lang.reflect.Type[][][][][][][] { typeArray20, typeArray21, typeArray22, typeArray23 };
        java.lang.reflect.Type[][][][][][] typeArray25 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray26 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray27 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray28 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray29 = new java.lang.reflect.Type[][][][][][][] { typeArray25, typeArray26, typeArray27, typeArray28 };
        java.lang.reflect.Type[][][][][][][][] typeArray30 = new java.lang.reflect.Type[][][][][][][][] { typeArray4, typeArray9, typeArray14, typeArray19, typeArray24, typeArray29 };
        java.lang.reflect.Type[][][][][][] typeArray31 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray32 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray33 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray34 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray35 = new java.lang.reflect.Type[][][][][][][] { typeArray31, typeArray32, typeArray33, typeArray34 };
        java.lang.reflect.Type[][][][][][] typeArray36 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray37 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray38 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray39 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray40 = new java.lang.reflect.Type[][][][][][][] { typeArray36, typeArray37, typeArray38, typeArray39 };
        java.lang.reflect.Type[][][][][][] typeArray41 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray42 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray43 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray44 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray45 = new java.lang.reflect.Type[][][][][][][] { typeArray41, typeArray42, typeArray43, typeArray44 };
        java.lang.reflect.Type[][][][][][] typeArray46 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray47 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray48 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray49 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray50 = new java.lang.reflect.Type[][][][][][][] { typeArray46, typeArray47, typeArray48, typeArray49 };
        java.lang.reflect.Type[][][][][][] typeArray51 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray52 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray53 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray54 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray55 = new java.lang.reflect.Type[][][][][][][] { typeArray51, typeArray52, typeArray53, typeArray54 };
        java.lang.reflect.Type[][][][][][] typeArray56 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray57 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray58 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][] typeArray59 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][][][] typeArray60 = new java.lang.reflect.Type[][][][][][][] { typeArray56, typeArray57, typeArray58, typeArray59 };
        java.lang.reflect.Type[][][][][][][][] typeArray61 = new java.lang.reflect.Type[][][][][][][][] { typeArray35, typeArray40, typeArray45, typeArray50, typeArray55, typeArray60 };
        java.lang.reflect.Type[][][][][][][][][] typeArray62 = new java.lang.reflect.Type[][][][][][][][][] { typeArray30, typeArray61 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray62, true);
        java.lang.reflect.Type[][][][][][][][] typeArray65 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray66 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray67 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray68 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray69 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray70 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][][] typeArray71 = new java.lang.reflect.Type[][][][][][][][][] { typeArray65, typeArray66, typeArray67, typeArray68, typeArray69, typeArray70 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray71, false);
        java.lang.reflect.Type[][][][][][][][] typeArray74 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray75 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray76 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray77 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray78 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray79 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][][] typeArray80 = new java.lang.reflect.Type[][][][][][][][][] { typeArray74, typeArray75, typeArray76, typeArray77, typeArray78, typeArray79 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray80, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]> typeArrayMultiKey84 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][]>(typeArray80, true);
        java.lang.reflect.Type[][][][][][][][] typeArray85 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray86 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray87 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][] typeArray88 = new java.lang.reflect.Type[][][][][][][][] {};
        java.lang.reflect.Type[][][][][][][][][] typeArray89 = new java.lang.reflect.Type[][][][][][][][][] { typeArray85, typeArray86, typeArray87, typeArray88 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]> typeArrayMultiKey90 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]>(typeArray71, typeArray80, typeArray89);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]> typeArrayMultiKey91 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][][][][]>(typeArray62, typeArray80);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertArrayEquals(typeArray3, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertArrayEquals(typeArray5, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertArrayEquals(typeArray6, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertArrayEquals(typeArray7, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertArrayEquals(typeArray8, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertArrayEquals(typeArray10, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertArrayEquals(typeArray11, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertArrayEquals(typeArray12, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertArrayEquals(typeArray13, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertArrayEquals(typeArray15, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertArrayEquals(typeArray16, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertArrayEquals(typeArray17, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertArrayEquals(typeArray18, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertArrayEquals(typeArray20, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertArrayEquals(typeArray21, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertArrayEquals(typeArray22, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertArrayEquals(typeArray23, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertArrayEquals(typeArray25, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertArrayEquals(typeArray26, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertArrayEquals(typeArray27, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertArrayEquals(typeArray28, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertArrayEquals(typeArray31, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertArrayEquals(typeArray33, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertArrayEquals(typeArray36, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertArrayEquals(typeArray37, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertArrayEquals(typeArray38, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertArrayEquals(typeArray39, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertArrayEquals(typeArray41, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertArrayEquals(typeArray42, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertArrayEquals(typeArray43, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertArrayEquals(typeArray44, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertArrayEquals(typeArray46, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertArrayEquals(typeArray47, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertArrayEquals(typeArray48, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertArrayEquals(typeArray49, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertArrayEquals(typeArray51, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertArrayEquals(typeArray52, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertArrayEquals(typeArray53, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertArrayEquals(typeArray54, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertArrayEquals(typeArray56, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertArrayEquals(typeArray57, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertArrayEquals(typeArray58, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertArrayEquals(typeArray59, new java.lang.reflect.Type[][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertArrayEquals(typeArray65, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertArrayEquals(typeArray66, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertArrayEquals(typeArray67, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertArrayEquals(typeArray68, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertArrayEquals(typeArray69, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertArrayEquals(typeArray70, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertArrayEquals(typeArray74, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertArrayEquals(typeArray75, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertArrayEquals(typeArray76, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertArrayEquals(typeArray77, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertArrayEquals(typeArray78, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertArrayEquals(typeArray79, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertArrayEquals(typeArray85, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertArrayEquals(typeArray86, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertArrayEquals(typeArray87, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertArrayEquals(typeArray88, new java.lang.reflect.Type[][][][][][][][] {});
        org.junit.Assert.assertNotNull(typeArray89);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], null, MultiKey[hi!, MultiKey[null, hi!, hi!], , ], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, null], null, MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]]");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], hi!]");
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = null; // flaky "41) test2616(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = null; // flaky "41) test2616(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray3);
// flaky "21) test2616(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky "42) test2617(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey6.getKeys();
        boolean boolean8 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey6);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = null; // flaky "42) test2617(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = null; // flaky "22) test2617(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray9);
// flaky "20) test2617(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "15) test2617(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        java.lang.Comparable<java.lang.String>[] strComparableArray22 = strComparableMultiKey21.getKeys();
        int int23 = strComparableMultiKey21.size();
        java.lang.Class<?> wildcardClass24 = strComparableMultiKey21.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray22);
        org.junit.Assert.assertArrayEquals(strComparableArray22, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMultiKey4.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableMultiKey4.getKey((int) (short) 0);
        org.junit.Assert.assertEquals("'" + strComparable6 + "' != '" + "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]" + "'", strComparable6, "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[MultiKey[, MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!], ], MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!]], MultiKey[, MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]]");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray8, false);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey11.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = strComparableMultiKey11.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = strComparableMultiKey11.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15, false);
        java.lang.reflect.Type[][][] typeArray18 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray19 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray20 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray21 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray22 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray23 = new java.lang.reflect.Type[][][][] { typeArray18, typeArray19, typeArray20, typeArray21, typeArray22 };
        java.lang.reflect.Type[][][] typeArray24 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray25 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray26 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray27 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray28 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray29 = new java.lang.reflect.Type[][][][] { typeArray24, typeArray25, typeArray26, typeArray27, typeArray28 };
        java.lang.reflect.Type[][][] typeArray30 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray31 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray32 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray33 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray34 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray35 = new java.lang.reflect.Type[][][][] { typeArray30, typeArray31, typeArray32, typeArray33, typeArray34 };
        java.lang.reflect.Type[][][] typeArray36 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray37 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray38 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray39 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray40 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray41 = new java.lang.reflect.Type[][][][] { typeArray36, typeArray37, typeArray38, typeArray39, typeArray40 };
        java.lang.reflect.Type[][][] typeArray42 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray43 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray44 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray45 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray46 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray47 = new java.lang.reflect.Type[][][][] { typeArray42, typeArray43, typeArray44, typeArray45, typeArray46 };
        java.lang.reflect.Type[][][][][] typeArray48 = new java.lang.reflect.Type[][][][][] { typeArray23, typeArray29, typeArray35, typeArray41, typeArray47 };
        java.lang.reflect.Type[][][][][][] typeArray49 = new java.lang.reflect.Type[][][][][][] { typeArray48 };
        java.lang.reflect.Type[][][] typeArray50 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray51 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray52 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray53 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray54 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray55 = new java.lang.reflect.Type[][][][] { typeArray50, typeArray51, typeArray52, typeArray53, typeArray54 };
        java.lang.reflect.Type[][][] typeArray56 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray57 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray58 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray59 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray60 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray61 = new java.lang.reflect.Type[][][][] { typeArray56, typeArray57, typeArray58, typeArray59, typeArray60 };
        java.lang.reflect.Type[][][] typeArray62 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray63 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray64 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray65 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray66 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray67 = new java.lang.reflect.Type[][][][] { typeArray62, typeArray63, typeArray64, typeArray65, typeArray66 };
        java.lang.reflect.Type[][][] typeArray68 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray69 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray70 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray71 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray72 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray73 = new java.lang.reflect.Type[][][][] { typeArray68, typeArray69, typeArray70, typeArray71, typeArray72 };
        java.lang.reflect.Type[][][] typeArray74 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray75 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray76 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray77 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray78 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray79 = new java.lang.reflect.Type[][][][] { typeArray74, typeArray75, typeArray76, typeArray77, typeArray78 };
        java.lang.reflect.Type[][][][][] typeArray80 = new java.lang.reflect.Type[][][][][] { typeArray55, typeArray61, typeArray67, typeArray73, typeArray79 };
        java.lang.reflect.Type[][][][][][] typeArray81 = new java.lang.reflect.Type[][][][][][] { typeArray80 };
        java.lang.reflect.Type[][][][][][][] typeArray82 = new java.lang.reflect.Type[][][][][][][] { typeArray49, typeArray81 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]> typeArrayMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]>(typeArray82);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]> typeArrayMultiKey84 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][][][][]>(typeArray82);
        java.lang.Class<?> wildcardClass85 = typeArray82.getClass();
        boolean boolean86 = strComparableMultiKey17.equals((java.lang.Object) wildcardClass85);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray8);
        org.junit.Assert.assertArrayEquals(strComparableArray8, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertArrayEquals(strComparableArray15, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertArrayEquals(typeArray18, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertArrayEquals(typeArray19, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertArrayEquals(typeArray20, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertArrayEquals(typeArray21, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertArrayEquals(typeArray22, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertArrayEquals(typeArray24, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertArrayEquals(typeArray25, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertArrayEquals(typeArray26, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertArrayEquals(typeArray27, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertArrayEquals(typeArray28, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertArrayEquals(typeArray30, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertArrayEquals(typeArray31, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertArrayEquals(typeArray33, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertArrayEquals(typeArray36, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertArrayEquals(typeArray37, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertArrayEquals(typeArray38, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertArrayEquals(typeArray39, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertArrayEquals(typeArray40, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertArrayEquals(typeArray42, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertArrayEquals(typeArray43, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertArrayEquals(typeArray44, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertArrayEquals(typeArray45, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertArrayEquals(typeArray46, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertArrayEquals(typeArray50, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertArrayEquals(typeArray51, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertArrayEquals(typeArray52, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertArrayEquals(typeArray53, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertArrayEquals(typeArray54, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertArrayEquals(typeArray56, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertArrayEquals(typeArray57, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertArrayEquals(typeArray58, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertArrayEquals(typeArray59, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertArrayEquals(typeArray60, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertArrayEquals(typeArray62, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertArrayEquals(typeArray63, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertArrayEquals(typeArray64, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertArrayEquals(typeArray65, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertArrayEquals(typeArray66, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertArrayEquals(typeArray68, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertArrayEquals(typeArray69, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertArrayEquals(typeArray70, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertArrayEquals(typeArray71, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertArrayEquals(typeArray72, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertArrayEquals(typeArray74, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertArrayEquals(typeArray75, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertArrayEquals(typeArray76, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertArrayEquals(typeArray77, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertArrayEquals(typeArray78, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]" + "'", strComparable5, "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!], MultiKey[, MultiKey[null, hi!, hi!]], MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]], MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[MultiKey[hi!, null], MultiKey[null, hi!, hi!], hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], hi!]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27, true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35, true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray27, strArray35, strArray40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, true);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray56, true);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray48, strArray56, strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray70, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray27, strArray42, strArray48, strArray70);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        java.lang.Comparable<java.lang.String>[] strComparableArray76 = strComparableMultiKey75.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray77 = strComparableMultiKey75.getKeys();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray76);
        org.junit.Assert.assertArrayEquals(strComparableArray76, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray77);
        org.junit.Assert.assertArrayEquals(strComparableArray77, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[hi!, null], MultiKey[MultiKey[hi!, hi!, hi!], , MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky "43) test2626(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
// flaky "43) test2626(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]], MultiKey[null, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!], MultiKey[hi!, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]]", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "44) test2627(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = null; // flaky "44) test2627(org.apache.commons.collections4.keyvalue.RegressionTest5)": new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6);
// flaky "23) test2627(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.Comparable[][] comparableArray1 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][]) comparableArray1;
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray6 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray8 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray4, strArray6, strArray8, strArray10, strArray12, strArray14 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray15, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray2, (java.lang.Comparable<java.lang.String>[][]) strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.Comparable[][] comparableArray21 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray22 = (java.lang.Comparable<java.lang.String>[][]) comparableArray21;
        strComparableArray22[0] = strArray19;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray22);
        java.lang.Comparable[][] comparableArray27 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray28 = (java.lang.Comparable<java.lang.String>[][]) comparableArray27;
        java.lang.String[] strArray30 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray32 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray34 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray36 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray38 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray40 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray41 = new java.lang.String[][] { strArray30, strArray32, strArray34, strArray36, strArray38, strArray40 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray41, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray28, (java.lang.Comparable<java.lang.String>[][]) strArray41);
        java.lang.Comparable<java.lang.String>[][] strComparableArray45 = null;
        java.lang.Comparable[][] comparableArray47 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray48 = (java.lang.Comparable<java.lang.String>[][]) comparableArray47;
        java.lang.String[] strArray50 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray52 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray54 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray56 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray58 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray60 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray61 = new java.lang.String[][] { strArray50, strArray52, strArray54, strArray56, strArray58, strArray60 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray61, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray48, (java.lang.Comparable<java.lang.String>[][]) strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>((java.lang.Comparable<java.lang.String>[][]) strArray41, strComparableArray45, (java.lang.Comparable<java.lang.String>[][]) strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]");
        java.lang.Comparable[][] comparableArray74 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray75 = (java.lang.Comparable<java.lang.String>[][]) comparableArray74;
        java.lang.String[] strArray77 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray79 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray81 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray83 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray85 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[] strArray87 = new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" };
        java.lang.String[][] strArray88 = new java.lang.String[][] { strArray77, strArray79, strArray81, strArray83, strArray85, strArray87 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey90 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray88, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey91 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray75, (java.lang.Comparable<java.lang.String>[][]) strArray88);
        boolean boolean92 = strComparableMultiKey72.equals((java.lang.Object) strArray88);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray88);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray88, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray2, strComparableArray22, (java.lang.Comparable<java.lang.String>[][]) strArray61, (java.lang.Comparable<java.lang.String>[][]) strArray88);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey97 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray61);
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertArrayEquals(comparableArray1, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray2);
        org.junit.Assert.assertArrayEquals(strComparableArray2, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(comparableArray21);
        org.junit.Assert.assertNotNull(strComparableArray22);
        org.junit.Assert.assertNotNull(comparableArray27);
        org.junit.Assert.assertArrayEquals(comparableArray27, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray28);
        org.junit.Assert.assertArrayEquals(strComparableArray28, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(comparableArray47);
        org.junit.Assert.assertArrayEquals(comparableArray47, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray48);
        org.junit.Assert.assertArrayEquals(strComparableArray48, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(comparableArray74);
        org.junit.Assert.assertArrayEquals(comparableArray74, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray75);
        org.junit.Assert.assertArrayEquals(strComparableArray75, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "MultiKey[, hi!, hi!, , hi!]" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, ], MultiKey[, MultiKey[hi!, hi!, hi!], MultiKey[null, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[, MultiKey[MultiKey[MultiKey[null, hi!, hi!], MultiKey[, hi!, hi!, , hi!], MultiKey[hi!, hi!, hi!]], ], null, hi!], MultiKey[MultiKey[hi!, hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!, hi!, , hi!], , null, MultiKey[, hi!, hi!, , hi!], MultiKey[, hi!, hi!, , hi!]], MultiKey[hi!, hi!, hi!], , ]");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!], , ], MultiKey[hi!, hi!, hi!], , MultiKey[, hi!, hi!, , hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky "45) test2630(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey4.getKeys();
        java.lang.String[][] strArray6 = new java.lang.String[][] {};
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][][] strArray11 = new java.lang.String[][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableMultiKey17.equals((java.lang.Object) (-1.0d));
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable20, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMultiKey23.toString();
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable25, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMultiKey28.toString();
        boolean boolean30 = strComparableMultiKey23.equals((java.lang.Object) str29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable42 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable42, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str46 = strComparableMultiKey45.toString();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray52, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray55 = strComparableMultiKey54.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray55);
        java.lang.Comparable<java.lang.String> strComparable57 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable57, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str61 = strComparableMultiKey60.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey36, strComparableMultiKey41, strComparableMultiKey45, strComparableMultiKey56, strComparableMultiKey60);
        boolean boolean63 = strComparableMultiKey23.equals((java.lang.Object) strComparableMultiKey45);
        boolean boolean64 = strComparableMultiKey17.equals((java.lang.Object) strComparableMultiKey23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strComparableMultiKey4, (java.lang.Object) strArray11, (java.lang.Object) strComparableMultiKey17);
        java.lang.Comparable[][][] comparableArray67 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray68 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray67;
        java.lang.Comparable[][][] comparableArray70 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray71 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray70;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][]> strComparableArrayMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][]>((java.lang.Comparable<java.lang.String>[][][]) strArray11, strComparableArray68, strComparableArray71);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strComparableArray68);
// flaky "45) test2630(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str24, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str29, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str46, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray55);
        org.junit.Assert.assertArrayEquals(strComparableArray55, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "MultiKey[null, hi!, hi!]" + "'", str61, "MultiKey[null, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(comparableArray67);
        org.junit.Assert.assertArrayEquals(comparableArray67, new java.lang.Comparable[][][] {});
        org.junit.Assert.assertNotNull(strComparableArray68);
        org.junit.Assert.assertArrayEquals(strComparableArray68, new java.lang.Comparable[][][] {});
        org.junit.Assert.assertNotNull(comparableArray70);
        org.junit.Assert.assertArrayEquals(comparableArray70, new java.lang.Comparable[][][] {});
        org.junit.Assert.assertNotNull(strComparableArray71);
        org.junit.Assert.assertArrayEquals(strComparableArray71, new java.lang.Comparable[][][] {});
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>(annotatedElementArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str4 = strComparableMultiKey3.toString();
        int int5 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky "46) test2632(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey3.getKeys();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]" + "'", str4, "MultiKey[MultiKey[, hi!, hi!, , hi!], MultiKey[null, hi!, hi!], ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky "46) test2632(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray13, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray13, strArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        java.lang.Class<?> wildcardClass26 = strArray5.getClass();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray32, true);
        java.lang.Class<?> wildcardClass35 = strComparableMultiKey34.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!], , ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, hi!, , hi!]");
        java.lang.Class<?> wildcardClass42 = strComparableMultiKey41.getClass();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, true);
        java.lang.Class<?> wildcardClass51 = strComparableMultiKey50.getClass();
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray57, true);
        java.lang.Class<?> wildcardClass60 = strComparableMultiKey59.getClass();
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray66, true);
        java.lang.Class<?> wildcardClass69 = strComparableMultiKey68.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass51, (java.lang.reflect.GenericDeclaration) wildcardClass60, (java.lang.reflect.GenericDeclaration) wildcardClass69);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass74 = strComparableMultiKey73.getClass();
        java.lang.Comparable<java.lang.String> strComparable75 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable75, (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String>[] strComparableArray79 = null; // flaky "47) test2633(org.apache.commons.collections4.keyvalue.RegressionTest5)": strComparableMultiKey78.getKeys();
        java.lang.Class<?> wildcardClass80 = strComparableMultiKey78.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass35, (java.lang.reflect.Type) wildcardClass42, (java.lang.reflect.Type) wildcardClass60, (java.lang.reflect.Type) wildcardClass74, (java.lang.reflect.Type) wildcardClass80);
        java.lang.reflect.Type[] typeArray82 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray83 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray84 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray85 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray86 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray87 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray88 = new java.lang.reflect.Type[][] { typeArray82, typeArray83, typeArray84, typeArray85, typeArray86, typeArray87 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey90 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray88, false);
        java.lang.Class<?> wildcardClass91 = typeArray88.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey92 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass26, (java.lang.reflect.Type) wildcardClass35, (java.lang.reflect.Type) wildcardClass91);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass74);
// flaky "47) test2633(org.apache.commons.collections4.keyvalue.RegressionTest5)":         org.junit.Assert.assertNotNull(strComparableArray79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertArrayEquals(typeArray82, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertArrayEquals(typeArray83, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertArrayEquals(typeArray84, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertArrayEquals(typeArray85, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertArrayEquals(typeArray86, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertArrayEquals(typeArray87, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2, annotatedElementArray3, annotatedElementArray4 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]>(annotatedElementArray5);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray9 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray10 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray11 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray12 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray7, annotatedElementArray8, annotatedElementArray9, annotatedElementArray10, annotatedElementArray11 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]>(annotatedElementArray12);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray15 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray16 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray17 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray18 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray19 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray14, annotatedElementArray15, annotatedElementArray16, annotatedElementArray17, annotatedElementArray18 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]>(annotatedElementArray19);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray21 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray22 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray23 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray24 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray25 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray26 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray21, annotatedElementArray22, annotatedElementArray23, annotatedElementArray24, annotatedElementArray25 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray27 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray28 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray29 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray30 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray31 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray32 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray27, annotatedElementArray28, annotatedElementArray29, annotatedElementArray30, annotatedElementArray31 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray33 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray34 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray35 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray36 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray37 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray38 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray33, annotatedElementArray34, annotatedElementArray35, annotatedElementArray36, annotatedElementArray37 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray39 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray40 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray41 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray42 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray43 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray44 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray39, annotatedElementArray40, annotatedElementArray41, annotatedElementArray42, annotatedElementArray43 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray45 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray46 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray47 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray48 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray49 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray50 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray45, annotatedElementArray46, annotatedElementArray47, annotatedElementArray48, annotatedElementArray49 };
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray51 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray26, annotatedElementArray32, annotatedElementArray38, annotatedElementArray44, annotatedElementArray50 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArrayMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]>(annotatedElementArray5, annotatedElementArray12, annotatedElementArray19, annotatedElementArray51);
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray53 = new java.lang.reflect.GenericDeclaration[][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[][]>(genericDeclarationArray53);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray55 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray56 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray55 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray57 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray58 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray57 };
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray59 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray56, annotatedElementArray58 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]>(annotatedElementArray59, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]>(annotatedElementArray59);
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray63 = new java.lang.reflect.GenericDeclaration[][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[][]>(genericDeclarationArray63);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArrayMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]>(annotatedElementArray59, (java.lang.reflect.AnnotatedElement[][][]) genericDeclarationArray63);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray66 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray67 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray66 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray68 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray69 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray68 };
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray70 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray67, annotatedElementArray69 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]>(annotatedElementArray70, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][]>(annotatedElementArray70);
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray74 = new java.lang.reflect.GenericDeclaration[][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration[][]>(genericDeclarationArray74);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArrayMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]>(annotatedElementArray70, (java.lang.reflect.AnnotatedElement[][][]) genericDeclarationArray74);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArrayMultiKey77 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[][][]>(annotatedElementArray12, (java.lang.reflect.AnnotatedElement[][][]) genericDeclarationArray53, (java.lang.reflect.AnnotatedElement[][][]) genericDeclarationArray63, (java.lang.reflect.AnnotatedElement[][][]) genericDeclarationArray74);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertArrayEquals(annotatedElementArray1, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertArrayEquals(annotatedElementArray2, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertArrayEquals(annotatedElementArray3, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertArrayEquals(annotatedElementArray4, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        org.junit.Assert.assertArrayEquals(annotatedElementArray7, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertArrayEquals(annotatedElementArray8, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray9);
        org.junit.Assert.assertArrayEquals(annotatedElementArray9, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray10);
        org.junit.Assert.assertArrayEquals(annotatedElementArray10, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray11);
        org.junit.Assert.assertArrayEquals(annotatedElementArray11, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray12);
        org.junit.Assert.assertNotNull(annotatedElementArray14);
        org.junit.Assert.assertArrayEquals(annotatedElementArray14, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray15);
        org.junit.Assert.assertArrayEquals(annotatedElementArray15, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray16);
        org.junit.Assert.assertArrayEquals(annotatedElementArray16, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray17);
        org.junit.Assert.assertArrayEquals(annotatedElementArray17, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray18);
        org.junit.Assert.assertArrayEquals(annotatedElementArray18, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray19);
        org.junit.Assert.assertNotNull(annotatedElementArray21);
        org.junit.Assert.assertArrayEquals(annotatedElementArray21, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray22);
        org.junit.Assert.assertArrayEquals(annotatedElementArray22, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray23);
        org.junit.Assert.assertArrayEquals(annotatedElementArray23, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray24);
        org.junit.Assert.assertArrayEquals(annotatedElementArray24, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray25);
        org.junit.Assert.assertArrayEquals(annotatedElementArray25, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray26);
        org.junit.Assert.assertNotNull(annotatedElementArray27);
        org.junit.Assert.assertArrayEquals(annotatedElementArray27, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray28);
        org.junit.Assert.assertArrayEquals(annotatedElementArray28, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray29);
        org.junit.Assert.assertArrayEquals(annotatedElementArray29, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray30);
        org.junit.Assert.assertArrayEquals(annotatedElementArray30, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray31);
        org.junit.Assert.assertArrayEquals(annotatedElementArray31, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray32);
        org.junit.Assert.assertNotNull(annotatedElementArray33);
        org.junit.Assert.assertArrayEquals(annotatedElementArray33, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray34);
        org.junit.Assert.assertArrayEquals(annotatedElementArray34, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray35);
        org.junit.Assert.assertArrayEquals(annotatedElementArray35, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray36);
        org.junit.Assert.assertArrayEquals(annotatedElementArray36, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray37);
        org.junit.Assert.assertArrayEquals(annotatedElementArray37, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray38);
        org.junit.Assert.assertNotNull(annotatedElementArray39);
        org.junit.Assert.assertArrayEquals(annotatedElementArray39, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray40);
        org.junit.Assert.assertArrayEquals(annotatedElementArray40, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray41);
        org.junit.Assert.assertArrayEquals(annotatedElementArray41, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray42);
        org.junit.Assert.assertArrayEquals(annotatedElementArray42, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray43);
        org.junit.Assert.assertArrayEquals(annotatedElementArray43, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray44);
        org.junit.Assert.assertNotNull(annotatedElementArray45);
        org.junit.Assert.assertArrayEquals(annotatedElementArray45, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray46);
        org.junit.Assert.assertArrayEquals(annotatedElementArray46, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray47);
        org.junit.Assert.assertArrayEquals(annotatedElementArray47, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray48);
        org.junit.Assert.assertArrayEquals(annotatedElementArray48, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray49);
        org.junit.Assert.assertArrayEquals(annotatedElementArray49, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray50);
        org.junit.Assert.assertNotNull(annotatedElementArray51);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray53, new java.lang.reflect.GenericDeclaration[][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertArrayEquals(annotatedElementArray55, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray56);
        org.junit.Assert.assertNotNull(annotatedElementArray57);
        org.junit.Assert.assertArrayEquals(annotatedElementArray57, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray58);
        org.junit.Assert.assertNotNull(annotatedElementArray59);
        org.junit.Assert.assertNotNull(genericDeclarationArray63);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray63, new java.lang.reflect.GenericDeclaration[][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray66);
        org.junit.Assert.assertArrayEquals(annotatedElementArray66, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray67);
        org.junit.Assert.assertNotNull(annotatedElementArray68);
        org.junit.Assert.assertArrayEquals(annotatedElementArray68, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray69);
        org.junit.Assert.assertNotNull(annotatedElementArray70);
        org.junit.Assert.assertNotNull(genericDeclarationArray74);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray74, new java.lang.reflect.GenericDeclaration[][][] {});
    }
}
