package org.apache.commons.cli;

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
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray30 = posixParser20.flatten(options21, strArray28, false);
        java.lang.String[] strArray32 = posixParser18.flatten(options19, strArray30, false);
        java.lang.String[] strArray34 = posixParser0.flatten(options17, strArray32, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray52 = posixParser42.flatten(options43, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray58 = posixParser42.flatten(options53, strArray56, false);
        java.lang.String[] strArray60 = posixParser0.flatten(options41, strArray56, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        org.apache.commons.cli.Options options15 = null;
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray28 = posixParser18.flatten(options19, strArray26, false);
        java.lang.String[] strArray30 = posixParser16.flatten(options17, strArray28, false);
        java.lang.String[] strArray32 = posixParser0.flatten(options15, strArray28, false);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray44 = posixParser34.flatten(options35, strArray42, false);
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray50 = posixParser34.flatten(options45, strArray48, false);
        java.lang.String[] strArray52 = posixParser0.flatten(options33, strArray50, true);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray66 = posixParser56.flatten(options57, strArray64, false);
        java.lang.String[] strArray68 = posixParser54.flatten(options55, strArray66, false);
        java.lang.String[] strArray70 = posixParser0.flatten(options53, strArray68, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options86 = null;
        java.lang.String[] strArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine88 = posixParser0.parse(options86, strArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option27 = null;
        java.util.ListIterator listIterator28 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option27, listIterator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        posixParser2.burstToken("", false);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray29 = posixParser19.flatten(options20, strArray27, false);
        java.lang.String[] strArray31 = posixParser17.flatten(options18, strArray29, false);
        java.lang.String[] strArray33 = posixParser2.flatten(options16, strArray29, false);
        java.lang.String[] strArray35 = posixParser0.flatten(options1, strArray29, true);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        java.lang.String[] strArray51 = posixParser37.flatten(options38, strArray49, false);
        posixParser37.burstToken("", false);
        posixParser37.burstToken("", true);
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray75 = posixParser59.flatten(options70, strArray73, false);
        java.lang.String[] strArray77 = posixParser37.flatten(options58, strArray75, true);
        java.lang.String[] strArray79 = posixParser0.flatten(options36, strArray75, false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray33 = posixParser23.flatten(options24, strArray31, false);
        posixParser23.burstToken("", false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray50 = posixParser40.flatten(options41, strArray48, false);
        java.lang.String[] strArray52 = posixParser38.flatten(options39, strArray50, false);
        java.lang.String[] strArray54 = posixParser23.flatten(options37, strArray50, false);
        java.lang.String[] strArray56 = posixParser21.flatten(options22, strArray50, true);
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray70 = posixParser60.flatten(options61, strArray68, false);
        java.lang.String[] strArray72 = posixParser58.flatten(options59, strArray70, false);
        java.lang.String[] strArray74 = posixParser21.flatten(options57, strArray72, false);
        java.lang.String[] strArray76 = posixParser0.flatten(options20, strArray72, false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray30 = posixParser20.flatten(options21, strArray28, false);
        java.lang.String[] strArray32 = posixParser18.flatten(options19, strArray30, false);
        java.lang.String[] strArray34 = posixParser0.flatten(options17, strArray32, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray67 = posixParser57.flatten(options58, strArray65, false);
        java.lang.String[] strArray69 = posixParser55.flatten(options56, strArray67, false);
        java.lang.String[] strArray71 = posixParser39.flatten(options54, strArray67, false);
        java.lang.String[] strArray73 = posixParser0.flatten(options38, strArray71, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options86 = null;
        java.lang.String[] strArray89 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray91 = posixParser0.flatten(options86, strArray89, true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass95 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray30 = posixParser20.flatten(options21, strArray28, false);
        java.lang.String[] strArray32 = posixParser18.flatten(options19, strArray30, false);
        java.lang.String[] strArray34 = posixParser0.flatten(options17, strArray32, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser0.flatten(options38, strArray51, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray67 = posixParser57.flatten(options58, strArray65, false);
        java.lang.String[] strArray69 = posixParser0.flatten(options56, strArray65, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.PosixParser posixParser5 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray15 = posixParser5.flatten(options6, strArray13, false);
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray21 = posixParser5.flatten(options16, strArray19, false);
        java.lang.String[] strArray23 = posixParser0.flatten(options4, strArray19, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options27 = null;
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        posixParser28.burstToken("", true);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray43 = posixParser33.flatten(options34, strArray41, false);
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray49 = posixParser33.flatten(options44, strArray47, false);
        java.lang.String[] strArray51 = posixParser28.flatten(options32, strArray47, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine53 = posixParser0.parse(options27, strArray47, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.PosixParser posixParser5 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray15 = posixParser5.flatten(options6, strArray13, false);
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray21 = posixParser5.flatten(options16, strArray19, false);
        java.lang.String[] strArray23 = posixParser0.flatten(options4, strArray19, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray43 = posixParser33.flatten(options34, strArray41, false);
        java.lang.String[] strArray45 = posixParser31.flatten(options32, strArray43, false);
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray59 = posixParser49.flatten(options50, strArray57, false);
        java.lang.String[] strArray61 = posixParser47.flatten(options48, strArray59, false);
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray75 = posixParser65.flatten(options66, strArray73, false);
        java.lang.String[] strArray77 = posixParser63.flatten(options64, strArray75, false);
        java.lang.String[] strArray79 = posixParser47.flatten(options62, strArray75, false);
        java.lang.String[] strArray81 = posixParser31.flatten(options46, strArray79, false);
        java.util.Properties properties82 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options30, strArray81, properties82, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray14 = posixParser4.flatten(options5, strArray12, false);
        posixParser4.burstToken("", false);
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        java.lang.String[] strArray33 = posixParser19.flatten(options20, strArray31, false);
        java.lang.String[] strArray35 = posixParser4.flatten(options18, strArray31, false);
        java.lang.String[] strArray37 = posixParser2.flatten(options3, strArray35, true);
        java.lang.String[] strArray39 = posixParser0.flatten(options1, strArray37, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option58 = null;
        java.util.ListIterator listIterator59 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option58, listIterator59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }
}

