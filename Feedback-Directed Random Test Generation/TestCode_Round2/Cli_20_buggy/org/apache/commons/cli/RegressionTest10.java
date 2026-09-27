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
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        java.lang.String[] strArray71 = posixParser57.flatten(options58, strArray69, false);
        java.lang.String[] strArray73 = posixParser0.flatten(options56, strArray71, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options77 = null;
        org.apache.commons.cli.PosixParser posixParser78 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray86 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray88 = posixParser78.flatten(options79, strArray86, false);
        org.apache.commons.cli.Options options89 = null;
        java.lang.String[] strArray92 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray94 = posixParser78.flatten(options89, strArray92, false);
        java.util.Properties properties95 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine97 = posixParser0.parse(options77, strArray94, properties95, false);
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
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options79 = null;
        org.apache.commons.cli.PosixParser posixParser80 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options81 = null;
        java.lang.String[] strArray88 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray90 = posixParser80.flatten(options81, strArray88, false);
        org.apache.commons.cli.Options options91 = null;
        java.lang.String[] strArray94 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray96 = posixParser80.flatten(options91, strArray94, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine97 = posixParser0.parse(options79, strArray96);
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
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray39 = posixParser23.flatten(options34, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray53 = posixParser43.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser41.flatten(options42, strArray53, false);
        java.lang.String[] strArray57 = posixParser23.flatten(options40, strArray55, true);
        java.lang.String[] strArray59 = posixParser21.flatten(options22, strArray55, false);
        java.lang.String[] strArray61 = posixParser0.flatten(options20, strArray55, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray26 = posixParser16.flatten(options17, strArray24, false);
        posixParser16.burstToken("", false);
        posixParser16.burstToken("", false);
        posixParser16.burstToken("", false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        java.lang.String[] strArray71 = posixParser57.flatten(options58, strArray69, false);
        java.lang.String[] strArray73 = posixParser39.flatten(options56, strArray71, true);
        java.lang.String[] strArray75 = posixParser37.flatten(options38, strArray71, false);
        java.lang.String[] strArray77 = posixParser16.flatten(options36, strArray71, true);
        java.lang.String[] strArray79 = posixParser0.flatten(options15, strArray71, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        java.lang.String[] strArray31 = posixParser0.flatten(options14, strArray27, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        posixParser39.burstToken("", true);
        posixParser39.burstToken("", false);
        posixParser39.burstToken("", false);
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        posixParser66.burstToken("", true);
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray81 = posixParser71.flatten(options72, strArray79, false);
        org.apache.commons.cli.Options options82 = null;
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray87 = posixParser71.flatten(options82, strArray85, false);
        java.lang.String[] strArray89 = posixParser66.flatten(options70, strArray85, true);
        java.lang.String[] strArray91 = posixParser39.flatten(options65, strArray85, true);
        java.lang.String[] strArray93 = posixParser0.flatten(options38, strArray91, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option97 = null;
        java.util.ListIterator listIterator98 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option97, listIterator98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        posixParser34.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        java.lang.String[] strArray57 = posixParser34.flatten(options38, strArray55, false);
        java.lang.String[] strArray59 = posixParser0.flatten(options33, strArray55, true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray64 = null;
        java.util.Properties properties65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine66 = posixParser0.parse(options63, strArray64, properties65);
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
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
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray60 = posixParser44.flatten(options55, strArray58, false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray74 = posixParser64.flatten(options65, strArray72, false);
        java.lang.String[] strArray76 = posixParser62.flatten(options63, strArray74, false);
        java.lang.String[] strArray78 = posixParser44.flatten(options61, strArray76, true);
        java.lang.String[] strArray80 = posixParser42.flatten(options43, strArray76, false);
        java.lang.String[] strArray82 = posixParser21.flatten(options41, strArray76, true);
        java.lang.String[] strArray84 = posixParser0.flatten(options20, strArray82, false);
        org.apache.commons.cli.Options options85 = null;
        java.lang.String[] strArray86 = null;
        java.util.Properties properties87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine88 = posixParser0.parse(options85, strArray86, properties87);
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
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
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
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray81 = posixParser71.flatten(options72, strArray79, false);
        java.lang.String[] strArray83 = posixParser0.flatten(options70, strArray81, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass93 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
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
        java.lang.String[] strArray70 = posixParser0.flatten(options53, strArray66, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray84 = posixParser0.flatten(options77, strArray82, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        java.lang.String[] strArray31 = posixParser0.flatten(options14, strArray27, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        java.lang.String[] strArray35 = posixParser0.flatten(options1, strArray33, true);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        posixParser41.burstToken("", false);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray68 = posixParser58.flatten(options59, strArray66, false);
        java.lang.String[] strArray70 = posixParser56.flatten(options57, strArray68, false);
        java.lang.String[] strArray72 = posixParser41.flatten(options55, strArray68, false);
        java.lang.String[] strArray74 = posixParser39.flatten(options40, strArray72, true);
        java.lang.String[] strArray76 = posixParser37.flatten(options38, strArray74, true);
        java.lang.String[] strArray78 = posixParser0.flatten(options36, strArray76, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
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
        java.lang.String[] strArray58 = posixParser0.flatten(options20, strArray50, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray66 = null;
        java.util.Properties properties67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine68 = posixParser0.parse(options65, strArray66, properties67);
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
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
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
        java.lang.String[] strArray58 = posixParser0.flatten(options20, strArray50, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass74 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
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
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray44 = posixParser34.flatten(options35, strArray42, false);
        java.lang.String[] strArray46 = posixParser32.flatten(options33, strArray44, false);
        java.lang.String[] strArray48 = posixParser16.flatten(options31, strArray44, false);
        org.apache.commons.cli.Options options49 = null;
        org.apache.commons.cli.PosixParser posixParser50 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray60 = posixParser50.flatten(options51, strArray58, false);
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray66 = posixParser50.flatten(options61, strArray64, false);
        java.lang.String[] strArray68 = posixParser16.flatten(options49, strArray66, true);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        org.apache.commons.cli.PosixParser posixParser72 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options73 = null;
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray82 = posixParser72.flatten(options73, strArray80, false);
        java.lang.String[] strArray84 = posixParser70.flatten(options71, strArray82, false);
        java.lang.String[] strArray86 = posixParser16.flatten(options69, strArray82, false);
        java.lang.String[] strArray88 = posixParser0.flatten(options15, strArray82, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option95 = null;
        java.util.ListIterator listIterator96 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option95, listIterator96);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
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
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray37 = posixParser27.flatten(options28, strArray35, false);
        java.lang.String[] strArray39 = posixParser25.flatten(options26, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray53 = posixParser43.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser41.flatten(options42, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        java.lang.String[] strArray71 = posixParser57.flatten(options58, strArray69, false);
        java.lang.String[] strArray73 = posixParser41.flatten(options56, strArray69, false);
        java.lang.String[] strArray75 = posixParser25.flatten(options40, strArray73, false);
        java.lang.String[] strArray77 = posixParser0.flatten(options24, strArray75, false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray25 = posixParser15.flatten(options16, strArray23, false);
        posixParser15.burstToken("", false);
        posixParser15.burstToken("", false);
        posixParser15.burstToken("", false);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray46 = posixParser36.flatten(options37, strArray44, false);
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray52 = posixParser36.flatten(options47, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray66 = posixParser56.flatten(options57, strArray64, false);
        java.lang.String[] strArray68 = posixParser54.flatten(options55, strArray66, false);
        java.lang.String[] strArray70 = posixParser36.flatten(options53, strArray68, true);
        java.lang.String[] strArray72 = posixParser15.flatten(options35, strArray68, true);
        java.util.Properties properties73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine74 = posixParser0.parse(options14, strArray72, properties73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray55 = posixParser45.flatten(options46, strArray53, false);
        posixParser45.burstToken("", false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray72 = posixParser62.flatten(options63, strArray70, false);
        java.lang.String[] strArray74 = posixParser60.flatten(options61, strArray72, false);
        java.lang.String[] strArray76 = posixParser45.flatten(options59, strArray72, false);
        java.lang.String[] strArray78 = posixParser43.flatten(options44, strArray76, true);
        java.lang.String[] strArray80 = posixParser0.flatten(options42, strArray76, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        posixParser34.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        java.lang.String[] strArray57 = posixParser34.flatten(options38, strArray55, false);
        java.lang.String[] strArray59 = posixParser0.flatten(options33, strArray55, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option63 = null;
        java.util.ListIterator listIterator64 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option63, listIterator64);
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        posixParser34.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        java.lang.String[] strArray57 = posixParser34.flatten(options38, strArray55, false);
        java.lang.String[] strArray59 = posixParser0.flatten(options33, strArray55, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine65 = posixParser0.parse(options63, strArray64);
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray32 = posixParser22.flatten(options23, strArray30, false);
        java.lang.String[] strArray34 = posixParser0.flatten(options21, strArray32, true);
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
        org.apache.commons.cli.Options options72 = null;
        org.apache.commons.cli.PosixParser posixParser73 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray81 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray83 = posixParser73.flatten(options74, strArray81, false);
        org.apache.commons.cli.Options options84 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray89 = posixParser73.flatten(options84, strArray87, false);
        java.lang.String[] strArray91 = posixParser39.flatten(options72, strArray89, true);
        java.lang.String[] strArray93 = posixParser0.flatten(options38, strArray89, true);
        java.lang.Class<?> wildcardClass94 = strArray89.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
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
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray58 = posixParser0.flatten(options55, strArray56, false);
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

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
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
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray47 = null;
        java.util.Properties properties48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine50 = posixParser0.parse(options46, strArray47, properties48, true);
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

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        posixParser20.burstToken("", false);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray47 = posixParser37.flatten(options38, strArray45, false);
        java.lang.String[] strArray49 = posixParser35.flatten(options36, strArray47, false);
        java.lang.String[] strArray51 = posixParser20.flatten(options34, strArray47, false);
        java.lang.String[] strArray53 = posixParser18.flatten(options19, strArray47, true);
        java.lang.String[] strArray55 = posixParser0.flatten(options17, strArray53, true);
        org.apache.commons.cli.Option option56 = null;
        java.util.ListIterator listIterator57 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option56, listIterator57);
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
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option92 = null;
        java.util.ListIterator listIterator93 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option92, listIterator93);
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
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray37 = posixParser21.flatten(options32, strArray35, false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser21.flatten(options38, strArray53, true);
        java.lang.String[] strArray57 = posixParser0.flatten(options20, strArray53, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray80 = posixParser70.flatten(options71, strArray78, false);
        java.lang.String[] strArray82 = posixParser68.flatten(options69, strArray80, false);
        java.lang.String[] strArray84 = posixParser0.flatten(options67, strArray80, false);
        org.apache.commons.cli.Options options85 = null;
        java.lang.String[] strArray86 = null;
        java.util.Properties properties87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine89 = posixParser0.parse(options85, strArray86, properties87, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = posixParser24.flatten(options25, strArray32, false);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray40 = posixParser24.flatten(options35, strArray38, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        java.lang.String[] strArray56 = posixParser42.flatten(options43, strArray54, false);
        java.lang.String[] strArray58 = posixParser24.flatten(options41, strArray56, true);
        java.lang.String[] strArray60 = posixParser0.flatten(options23, strArray58, false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray74 = posixParser64.flatten(options65, strArray72, false);
        posixParser64.burstToken("", false);
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        org.apache.commons.cli.PosixParser posixParser81 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options82 = null;
        java.lang.String[] strArray89 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray91 = posixParser81.flatten(options82, strArray89, false);
        java.lang.String[] strArray93 = posixParser79.flatten(options80, strArray91, false);
        java.lang.String[] strArray95 = posixParser64.flatten(options78, strArray91, false);
        java.lang.String[] strArray97 = posixParser62.flatten(options63, strArray91, true);
        java.lang.String[] strArray99 = posixParser0.flatten(options61, strArray91, true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray97);
        org.junit.Assert.assertArrayEquals(strArray97, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray99);
        org.junit.Assert.assertArrayEquals(strArray99, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options13 = null;
        org.apache.commons.cli.PosixParser posixParser14 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray24 = posixParser14.flatten(options15, strArray22, false);
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray30 = posixParser14.flatten(options25, strArray28, false);
        posixParser14.burstToken("", false);
        posixParser14.burstToken("", false);
        org.apache.commons.cli.Options options37 = null;
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray48 = posixParser38.flatten(options39, strArray46, false);
        org.apache.commons.cli.Options options49 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray54 = posixParser38.flatten(options49, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray68 = posixParser58.flatten(options59, strArray66, false);
        java.lang.String[] strArray70 = posixParser56.flatten(options57, strArray68, false);
        java.lang.String[] strArray72 = posixParser38.flatten(options55, strArray70, true);
        java.lang.String[] strArray74 = posixParser14.flatten(options37, strArray70, true);
        java.lang.String[] strArray76 = posixParser0.flatten(options13, strArray74, false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray44 = posixParser34.flatten(options35, strArray42, false);
        java.lang.String[] strArray46 = posixParser32.flatten(options33, strArray44, false);
        java.lang.String[] strArray48 = posixParser16.flatten(options31, strArray44, false);
        java.lang.String[] strArray50 = posixParser0.flatten(options15, strArray48, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options7 = null;
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = null;
        org.apache.commons.cli.PosixParser posixParser10 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray20 = posixParser10.flatten(options11, strArray18, false);
        posixParser10.burstToken("", false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray37 = posixParser27.flatten(options28, strArray35, false);
        java.lang.String[] strArray39 = posixParser25.flatten(options26, strArray37, false);
        java.lang.String[] strArray41 = posixParser10.flatten(options24, strArray37, false);
        java.lang.String[] strArray43 = posixParser8.flatten(options9, strArray37, true);
        posixParser8.burstToken("", false);
        posixParser8.burstToken("", false);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray63 = posixParser53.flatten(options54, strArray61, false);
        posixParser53.burstToken("", false);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray80 = posixParser70.flatten(options71, strArray78, false);
        java.lang.String[] strArray82 = posixParser68.flatten(options69, strArray80, false);
        java.lang.String[] strArray84 = posixParser53.flatten(options67, strArray80, false);
        java.lang.String[] strArray86 = posixParser51.flatten(options52, strArray84, true);
        java.lang.String[] strArray88 = posixParser8.flatten(options50, strArray84, true);
        java.lang.String[] strArray90 = posixParser0.flatten(options7, strArray84, true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine35 = posixParser0.parse(options32, strArray33, false);
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
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        java.lang.String[] strArray54 = posixParser0.flatten(options41, strArray52, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option70 = null;
        java.util.ListIterator listIterator71 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option70, listIterator71);
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
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray55 = posixParser45.flatten(options46, strArray53, false);
        java.lang.String[] strArray57 = posixParser43.flatten(options44, strArray55, false);
        java.lang.String[] strArray59 = posixParser0.flatten(options42, strArray57, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option63 = null;
        java.util.ListIterator listIterator64 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option63, listIterator64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray43 = posixParser33.flatten(options34, strArray41, false);
        java.lang.String[] strArray45 = posixParser31.flatten(options32, strArray43, false);
        java.lang.String[] strArray47 = posixParser15.flatten(options30, strArray43, false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray59 = posixParser49.flatten(options50, strArray57, false);
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray65 = posixParser49.flatten(options60, strArray63, false);
        java.lang.String[] strArray67 = posixParser15.flatten(options48, strArray65, true);
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray79 = posixParser69.flatten(options70, strArray77, false);
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray85 = posixParser69.flatten(options80, strArray83, false);
        java.lang.String[] strArray87 = posixParser15.flatten(options68, strArray85, true);
        java.lang.String[] strArray89 = posixParser0.flatten(options14, strArray87, true);
        org.apache.commons.cli.Options options90 = null;
        java.lang.String[] strArray91 = null;
        java.util.Properties properties92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine94 = posixParser0.parse(options90, strArray91, properties92, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "--", "hi!", "hi!" });
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        org.apache.commons.cli.Options options30 = null;
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray43 = posixParser33.flatten(options34, strArray41, false);
        java.lang.String[] strArray45 = posixParser31.flatten(options32, strArray43, false);
        java.lang.String[] strArray47 = posixParser15.flatten(options30, strArray43, false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray59 = posixParser49.flatten(options50, strArray57, false);
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray65 = posixParser49.flatten(options60, strArray63, false);
        java.lang.String[] strArray67 = posixParser15.flatten(options48, strArray65, true);
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray79 = posixParser69.flatten(options70, strArray77, false);
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray85 = posixParser69.flatten(options80, strArray83, false);
        java.lang.String[] strArray87 = posixParser15.flatten(options68, strArray85, true);
        java.lang.String[] strArray89 = posixParser0.flatten(options14, strArray87, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "--", "--", "hi!", "hi!" });
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
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
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray37 = posixParser27.flatten(options28, strArray35, false);
        java.lang.String[] strArray39 = posixParser25.flatten(options26, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray53 = posixParser43.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser41.flatten(options42, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        java.lang.String[] strArray71 = posixParser57.flatten(options58, strArray69, false);
        java.lang.String[] strArray73 = posixParser41.flatten(options56, strArray69, false);
        java.lang.String[] strArray75 = posixParser25.flatten(options40, strArray73, false);
        java.lang.String[] strArray77 = posixParser0.flatten(options24, strArray75, false);
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray89 = posixParser79.flatten(options80, strArray87, false);
        org.apache.commons.cli.Options options90 = null;
        java.lang.String[] strArray93 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray95 = posixParser79.flatten(options90, strArray93, false);
        java.lang.String[] strArray97 = posixParser0.flatten(options78, strArray93, true);
        java.lang.Class<?> wildcardClass98 = strArray97.getClass();
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray97);
        org.junit.Assert.assertArrayEquals(strArray97, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray37 = posixParser27.flatten(options28, strArray35, false);
        java.lang.String[] strArray39 = posixParser25.flatten(options26, strArray37, false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray53 = posixParser43.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser41.flatten(options42, strArray53, false);
        java.lang.String[] strArray57 = posixParser25.flatten(options40, strArray53, false);
        java.util.Properties properties58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine60 = posixParser0.parse(options24, strArray53, properties58, false);
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
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
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray37 = posixParser27.flatten(options28, strArray35, false);
        posixParser27.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        java.lang.String[] strArray56 = posixParser42.flatten(options43, strArray54, false);
        java.lang.String[] strArray58 = posixParser27.flatten(options41, strArray54, false);
        java.lang.String[] strArray60 = posixParser25.flatten(options26, strArray54, true);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray74 = posixParser64.flatten(options65, strArray72, false);
        java.lang.String[] strArray76 = posixParser62.flatten(options63, strArray74, false);
        java.lang.String[] strArray78 = posixParser25.flatten(options61, strArray76, false);
        java.lang.String[] strArray80 = posixParser0.flatten(options24, strArray78, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass93 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray36 = posixParser26.flatten(options27, strArray34, false);
        posixParser26.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray53 = posixParser43.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser41.flatten(options42, strArray53, false);
        java.lang.String[] strArray57 = posixParser26.flatten(options40, strArray53, false);
        java.lang.String[] strArray59 = posixParser24.flatten(options25, strArray53, true);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray73 = posixParser63.flatten(options64, strArray71, false);
        java.lang.String[] strArray75 = posixParser61.flatten(options62, strArray73, false);
        java.lang.String[] strArray77 = posixParser24.flatten(options60, strArray75, false);
        java.lang.String[] strArray79 = posixParser0.flatten(options23, strArray75, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass86 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray40 = posixParser30.flatten(options31, strArray38, false);
        java.lang.String[] strArray42 = posixParser28.flatten(options29, strArray40, false);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray56 = posixParser46.flatten(options47, strArray54, false);
        java.lang.String[] strArray58 = posixParser44.flatten(options45, strArray56, false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray72 = posixParser62.flatten(options63, strArray70, false);
        java.lang.String[] strArray74 = posixParser60.flatten(options61, strArray72, false);
        java.lang.String[] strArray76 = posixParser44.flatten(options59, strArray72, false);
        java.lang.String[] strArray78 = posixParser28.flatten(options43, strArray76, false);
        java.lang.String[] strArray80 = posixParser0.flatten(options27, strArray78, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options90 = null;
        java.lang.String[] strArray91 = null;
        java.util.Properties properties92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine93 = posixParser0.parse(options90, strArray91, properties92);
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray14 = posixParser4.flatten(options5, strArray12, false);
        java.lang.String[] strArray16 = posixParser2.flatten(options3, strArray14, false);
        java.lang.String[] strArray18 = posixParser0.flatten(options1, strArray16, false);
        org.apache.commons.cli.Options options19 = null;
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray32 = posixParser22.flatten(options23, strArray30, false);
        java.lang.String[] strArray34 = posixParser20.flatten(options21, strArray32, false);
        java.util.Properties properties35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine36 = posixParser0.parse(options19, strArray32, properties35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option64 = null;
        java.util.ListIterator listIterator65 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option64, listIterator65);
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

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray32 = posixParser22.flatten(options23, strArray30, false);
        posixParser22.burstToken("", false);
        posixParser22.burstToken("", false);
        posixParser22.burstToken("", false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray55 = posixParser45.flatten(options46, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray61 = posixParser45.flatten(options56, strArray59, false);
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray75 = posixParser65.flatten(options66, strArray73, false);
        java.lang.String[] strArray77 = posixParser63.flatten(options64, strArray75, false);
        java.lang.String[] strArray79 = posixParser45.flatten(options62, strArray77, true);
        java.lang.String[] strArray81 = posixParser43.flatten(options44, strArray77, false);
        java.lang.String[] strArray83 = posixParser22.flatten(options42, strArray77, true);
        java.lang.String[] strArray85 = posixParser0.flatten(options21, strArray77, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options89 = null;
        java.lang.String[] strArray91 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray93 = posixParser0.flatten(options89, strArray91, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "hi!" });
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        java.lang.String[] strArray31 = posixParser0.flatten(options14, strArray27, false);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray45 = posixParser35.flatten(options36, strArray43, false);
        java.lang.String[] strArray47 = posixParser33.flatten(options34, strArray45, false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray61 = posixParser51.flatten(options52, strArray59, false);
        java.lang.String[] strArray63 = posixParser49.flatten(options50, strArray61, false);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray77 = posixParser67.flatten(options68, strArray75, false);
        java.lang.String[] strArray79 = posixParser65.flatten(options66, strArray77, false);
        java.lang.String[] strArray81 = posixParser49.flatten(options64, strArray77, false);
        java.lang.String[] strArray83 = posixParser33.flatten(options48, strArray81, true);
        java.lang.String[] strArray85 = posixParser0.flatten(options32, strArray83, true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass89 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass92 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray14 = posixParser4.flatten(options5, strArray12, false);
        java.lang.String[] strArray16 = posixParser2.flatten(options3, strArray14, false);
        java.lang.String[] strArray18 = posixParser0.flatten(options1, strArray16, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray35 = posixParser25.flatten(options26, strArray33, false);
        posixParser25.burstToken("", false);
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray52 = posixParser42.flatten(options43, strArray50, false);
        java.lang.String[] strArray54 = posixParser40.flatten(options41, strArray52, false);
        java.lang.String[] strArray56 = posixParser25.flatten(options39, strArray52, false);
        java.lang.String[] strArray58 = posixParser23.flatten(options24, strArray52, true);
        posixParser23.burstToken("", false);
        posixParser23.burstToken("", false);
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.lang.String[] strArray68 = posixParser23.flatten(options65, strArray66, true);
        java.lang.String[] strArray70 = posixParser0.flatten(options22, strArray66, true);
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray72 = null;
        java.util.Properties properties73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine75 = posixParser0.parse(options71, strArray72, properties73, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] {});
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray29 = posixParser19.flatten(options20, strArray27, false);
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray35 = posixParser19.flatten(options30, strArray33, false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", false);
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        posixParser46.burstToken("", true);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray61 = posixParser51.flatten(options52, strArray59, false);
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray67 = posixParser51.flatten(options62, strArray65, false);
        java.lang.String[] strArray69 = posixParser46.flatten(options50, strArray65, true);
        java.lang.String[] strArray71 = posixParser19.flatten(options45, strArray65, true);
        java.lang.String[] strArray73 = posixParser0.flatten(options18, strArray71, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass80 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray37 = null;
        java.util.Properties properties38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine39 = posixParser0.parse(options36, strArray37, properties38);
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
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        java.lang.String[] strArray31 = posixParser0.flatten(options14, strArray27, false);
        org.apache.commons.cli.Options options32 = null;
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray45 = posixParser35.flatten(options36, strArray43, false);
        java.lang.String[] strArray47 = posixParser33.flatten(options34, strArray45, false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray61 = posixParser51.flatten(options52, strArray59, false);
        java.lang.String[] strArray63 = posixParser49.flatten(options50, strArray61, false);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray77 = posixParser67.flatten(options68, strArray75, false);
        java.lang.String[] strArray79 = posixParser65.flatten(options66, strArray77, false);
        java.lang.String[] strArray81 = posixParser49.flatten(options64, strArray77, false);
        java.lang.String[] strArray83 = posixParser33.flatten(options48, strArray81, true);
        java.lang.String[] strArray85 = posixParser0.flatten(options32, strArray83, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.PosixParser posixParser5 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options6 = null;
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray17 = posixParser7.flatten(options8, strArray15, false);
        java.lang.String[] strArray19 = posixParser5.flatten(options6, strArray17, false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray33 = posixParser23.flatten(options24, strArray31, false);
        java.lang.String[] strArray35 = posixParser21.flatten(options22, strArray33, false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        java.lang.String[] strArray51 = posixParser37.flatten(options38, strArray49, false);
        java.lang.String[] strArray53 = posixParser21.flatten(options36, strArray49, false);
        java.lang.String[] strArray55 = posixParser5.flatten(options20, strArray53, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options4, strArray53, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        posixParser65.burstToken("", true);
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray80 = posixParser70.flatten(options71, strArray78, false);
        org.apache.commons.cli.Options options81 = null;
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray86 = posixParser70.flatten(options81, strArray84, false);
        java.lang.String[] strArray88 = posixParser65.flatten(options69, strArray86, false);
        java.lang.String[] strArray90 = posixParser0.flatten(options64, strArray88, false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray40 = posixParser30.flatten(options31, strArray38, false);
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray46 = posixParser30.flatten(options41, strArray44, false);
        posixParser30.burstToken("", false);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray63 = posixParser53.flatten(options54, strArray61, false);
        posixParser53.burstToken("", false);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray80 = posixParser70.flatten(options71, strArray78, false);
        java.lang.String[] strArray82 = posixParser68.flatten(options69, strArray80, false);
        java.lang.String[] strArray84 = posixParser53.flatten(options67, strArray80, false);
        java.lang.String[] strArray86 = posixParser51.flatten(options52, strArray80, true);
        java.lang.String[] strArray88 = posixParser30.flatten(options50, strArray80, false);
        java.lang.String[] strArray90 = posixParser0.flatten(options29, strArray80, false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray14 = posixParser4.flatten(options5, strArray12, false);
        java.lang.String[] strArray16 = posixParser2.flatten(options3, strArray14, false);
        java.lang.String[] strArray18 = posixParser0.flatten(options1, strArray16, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray35 = posixParser25.flatten(options26, strArray33, false);
        posixParser25.burstToken("", false);
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray52 = posixParser42.flatten(options43, strArray50, false);
        java.lang.String[] strArray54 = posixParser40.flatten(options41, strArray52, false);
        java.lang.String[] strArray56 = posixParser25.flatten(options39, strArray52, false);
        java.lang.String[] strArray58 = posixParser23.flatten(options24, strArray52, true);
        posixParser23.burstToken("", false);
        posixParser23.burstToken("", false);
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.lang.String[] strArray68 = posixParser23.flatten(options65, strArray66, true);
        java.lang.String[] strArray70 = posixParser0.flatten(options22, strArray66, true);
        java.lang.Class<?> wildcardClass71 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options35 = null;
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray46 = posixParser36.flatten(options37, strArray44, false);
        posixParser36.burstToken("", false);
        posixParser36.burstToken("", false);
        posixParser36.burstToken("", false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray75 = posixParser59.flatten(options70, strArray73, false);
        org.apache.commons.cli.Options options76 = null;
        org.apache.commons.cli.PosixParser posixParser77 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray89 = posixParser79.flatten(options80, strArray87, false);
        java.lang.String[] strArray91 = posixParser77.flatten(options78, strArray89, false);
        java.lang.String[] strArray93 = posixParser59.flatten(options76, strArray91, true);
        java.lang.String[] strArray95 = posixParser57.flatten(options58, strArray91, false);
        java.lang.String[] strArray97 = posixParser36.flatten(options56, strArray91, true);
        java.util.Properties properties98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine99 = posixParser0.parse(options35, strArray97, properties98);
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
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray97);
        org.junit.Assert.assertArrayEquals(strArray97, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.PosixParser posixParser5 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options6 = null;
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray17 = posixParser7.flatten(options8, strArray15, false);
        java.lang.String[] strArray19 = posixParser5.flatten(options6, strArray17, false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray33 = posixParser23.flatten(options24, strArray31, false);
        java.lang.String[] strArray35 = posixParser21.flatten(options22, strArray33, false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        java.lang.String[] strArray51 = posixParser37.flatten(options38, strArray49, false);
        java.lang.String[] strArray53 = posixParser21.flatten(options36, strArray49, false);
        java.lang.String[] strArray55 = posixParser5.flatten(options20, strArray53, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options4, strArray53, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray60 = posixParser44.flatten(options55, strArray58, false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray74 = posixParser64.flatten(options65, strArray72, false);
        java.lang.String[] strArray76 = posixParser62.flatten(options63, strArray74, false);
        java.lang.String[] strArray78 = posixParser44.flatten(options61, strArray76, true);
        java.lang.String[] strArray80 = posixParser42.flatten(options43, strArray76, false);
        java.lang.String[] strArray82 = posixParser21.flatten(options41, strArray76, true);
        java.lang.String[] strArray84 = posixParser0.flatten(options20, strArray82, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray44 = posixParser34.flatten(options35, strArray42, false);
        java.lang.String[] strArray46 = posixParser32.flatten(options33, strArray44, false);
        java.lang.String[] strArray48 = posixParser16.flatten(options31, strArray44, false);
        java.lang.String[] strArray50 = posixParser0.flatten(options15, strArray48, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray81 = posixParser71.flatten(options72, strArray79, false);
        java.lang.String[] strArray83 = posixParser69.flatten(options70, strArray81, false);
        java.lang.String[] strArray85 = posixParser67.flatten(options68, strArray83, false);
        java.lang.String[] strArray87 = posixParser0.flatten(options66, strArray85, true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = posixParser24.flatten(options25, strArray32, false);
        posixParser24.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser24.flatten(options38, strArray51, false);
        java.lang.String[] strArray57 = posixParser22.flatten(options23, strArray51, true);
        java.lang.String[] strArray59 = posixParser0.flatten(options21, strArray57, false);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray71 = posixParser61.flatten(options62, strArray69, false);
        posixParser61.burstToken("", false);
        org.apache.commons.cli.Options options75 = null;
        org.apache.commons.cli.PosixParser posixParser76 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options77 = null;
        org.apache.commons.cli.PosixParser posixParser78 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray86 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray88 = posixParser78.flatten(options79, strArray86, false);
        java.lang.String[] strArray90 = posixParser76.flatten(options77, strArray88, false);
        java.lang.String[] strArray92 = posixParser61.flatten(options75, strArray88, false);
        java.lang.String[] strArray94 = posixParser0.flatten(options60, strArray92, false);
        org.apache.commons.cli.Options options95 = null;
        java.lang.String[] strArray96 = null;
        java.util.Properties properties97 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine98 = posixParser0.parse(options95, strArray96, properties97);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
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
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray64 = posixParser54.flatten(options55, strArray62, false);
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray70 = posixParser54.flatten(options65, strArray68, false);
        java.lang.String[] strArray72 = posixParser0.flatten(options53, strArray70, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options95 = null;
        java.lang.String[] strArray96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray98 = posixParser0.flatten(options95, strArray96, false);
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
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options89 = null;
        java.lang.String[] strArray90 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine92 = posixParser0.parse(options89, strArray90, true);
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
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options26 = null;
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        posixParser27.burstToken("", true);
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray42 = posixParser32.flatten(options33, strArray40, false);
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray48 = posixParser32.flatten(options43, strArray46, false);
        java.lang.String[] strArray50 = posixParser27.flatten(options31, strArray46, true);
        java.lang.String[] strArray52 = posixParser0.flatten(options26, strArray46, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine65 = posixParser0.parse(options62, strArray63, true);
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
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
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
        java.lang.String[] strArray46 = posixParser0.flatten(options33, strArray42, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
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
        java.lang.String[] strArray63 = posixParser31.flatten(options46, strArray59, false);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray75 = posixParser65.flatten(options66, strArray73, false);
        org.apache.commons.cli.Options options76 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray81 = posixParser65.flatten(options76, strArray79, false);
        java.lang.String[] strArray83 = posixParser31.flatten(options64, strArray81, true);
        java.lang.String[] strArray85 = posixParser0.flatten(options30, strArray83, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option22 = null;
        java.util.ListIterator listIterator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option22, listIterator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        posixParser37.burstToken("", true);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray52 = posixParser42.flatten(options43, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray58 = posixParser42.flatten(options53, strArray56, false);
        java.lang.String[] strArray60 = posixParser37.flatten(options41, strArray56, true);
        java.lang.String[] strArray62 = posixParser0.flatten(options36, strArray60, true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray81 = posixParser71.flatten(options72, strArray79, false);
        java.lang.String[] strArray83 = posixParser69.flatten(options70, strArray81, false);
        java.lang.String[] strArray85 = posixParser67.flatten(options68, strArray83, false);
        java.lang.String[] strArray87 = posixParser0.flatten(options66, strArray85, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        java.lang.String[] strArray35 = posixParser0.flatten(options1, strArray33, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray57 = posixParser47.flatten(options48, strArray55, false);
        posixParser47.burstToken("", false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray74 = posixParser64.flatten(options65, strArray72, false);
        java.lang.String[] strArray76 = posixParser62.flatten(options63, strArray74, false);
        java.lang.String[] strArray78 = posixParser47.flatten(options61, strArray74, false);
        java.lang.String[] strArray80 = posixParser45.flatten(options46, strArray78, true);
        java.lang.String[] strArray82 = posixParser43.flatten(options44, strArray80, true);
        java.lang.String[] strArray84 = posixParser0.flatten(options42, strArray80, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray26 = posixParser16.flatten(options17, strArray24, false);
        posixParser16.burstToken("", false);
        posixParser16.burstToken("", false);
        posixParser16.burstToken("", false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        java.lang.String[] strArray71 = posixParser57.flatten(options58, strArray69, false);
        java.lang.String[] strArray73 = posixParser39.flatten(options56, strArray71, true);
        java.lang.String[] strArray75 = posixParser37.flatten(options38, strArray71, false);
        java.lang.String[] strArray77 = posixParser16.flatten(options36, strArray71, true);
        java.lang.String[] strArray79 = posixParser0.flatten(options15, strArray71, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = posixParser24.flatten(options25, strArray32, false);
        posixParser24.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser24.flatten(options38, strArray51, false);
        java.lang.String[] strArray57 = posixParser0.flatten(options23, strArray55, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        posixParser21.burstToken("", true);
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray36 = posixParser26.flatten(options27, strArray34, false);
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray42 = posixParser26.flatten(options37, strArray40, false);
        java.lang.String[] strArray44 = posixParser21.flatten(options25, strArray40, true);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options48 = null;
        org.apache.commons.cli.PosixParser posixParser49 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray61 = posixParser51.flatten(options52, strArray59, false);
        java.lang.String[] strArray63 = posixParser49.flatten(options50, strArray61, false);
        org.apache.commons.cli.Options options64 = null;
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray77 = posixParser67.flatten(options68, strArray75, false);
        java.lang.String[] strArray79 = posixParser65.flatten(options66, strArray77, false);
        java.lang.String[] strArray81 = posixParser49.flatten(options64, strArray77, false);
        java.lang.String[] strArray83 = posixParser21.flatten(options48, strArray81, true);
        java.lang.String[] strArray85 = posixParser0.flatten(options20, strArray81, true);
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        java.lang.String[] strArray31 = posixParser0.flatten(options14, strArray27, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options50 = null;
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray63 = posixParser53.flatten(options54, strArray61, false);
        java.lang.String[] strArray65 = posixParser51.flatten(options52, strArray63, false);
        org.apache.commons.cli.Options options66 = null;
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = null;
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray79 = posixParser69.flatten(options70, strArray77, false);
        java.lang.String[] strArray81 = posixParser67.flatten(options68, strArray79, false);
        java.lang.String[] strArray83 = posixParser51.flatten(options66, strArray79, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options50, strArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = posixParser24.flatten(options25, strArray32, false);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray40 = posixParser24.flatten(options35, strArray38, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        java.lang.String[] strArray56 = posixParser42.flatten(options43, strArray54, false);
        java.lang.String[] strArray58 = posixParser24.flatten(options41, strArray56, true);
        java.lang.String[] strArray60 = posixParser0.flatten(options23, strArray58, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray65 = posixParser55.flatten(options56, strArray63, false);
        java.lang.String[] strArray67 = posixParser0.flatten(options54, strArray65, true);
        java.lang.Class<?> wildcardClass68 = strArray67.getClass();
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
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = posixParser24.flatten(options25, strArray32, false);
        posixParser24.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser24.flatten(options38, strArray51, false);
        java.lang.String[] strArray57 = posixParser22.flatten(options23, strArray51, true);
        java.lang.String[] strArray59 = posixParser0.flatten(options21, strArray57, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option75 = null;
        java.util.ListIterator listIterator76 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option75, listIterator76);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        posixParser34.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        java.lang.String[] strArray57 = posixParser34.flatten(options38, strArray55, false);
        java.lang.String[] strArray59 = posixParser0.flatten(options33, strArray55, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass66 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
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
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
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
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray53 = posixParser43.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser41.flatten(options42, strArray53, false);
        org.apache.commons.cli.Options options56 = null;
        org.apache.commons.cli.PosixParser posixParser57 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        java.lang.String[] strArray71 = posixParser57.flatten(options58, strArray69, false);
        java.lang.String[] strArray73 = posixParser41.flatten(options56, strArray69, false);
        java.lang.String[] strArray75 = posixParser0.flatten(options40, strArray69, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
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
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray29 = posixParser19.flatten(options20, strArray27, false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", false);
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray52 = posixParser42.flatten(options43, strArray50, false);
        org.apache.commons.cli.Options options53 = null;
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray58 = posixParser42.flatten(options53, strArray56, false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray72 = posixParser62.flatten(options63, strArray70, false);
        java.lang.String[] strArray74 = posixParser60.flatten(options61, strArray72, false);
        java.lang.String[] strArray76 = posixParser42.flatten(options59, strArray74, true);
        java.lang.String[] strArray78 = posixParser40.flatten(options41, strArray74, false);
        java.lang.String[] strArray80 = posixParser19.flatten(options39, strArray74, true);
        java.lang.String[] strArray82 = posixParser0.flatten(options18, strArray80, true);
        org.apache.commons.cli.Options options83 = null;
        java.lang.String[] strArray84 = null;
        java.util.Properties properties85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine87 = posixParser0.parse(options83, strArray84, properties85, false);
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
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray37 = posixParser21.flatten(options32, strArray35, false);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        posixParser44.burstToken("", false);
        org.apache.commons.cli.Options options58 = null;
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray71 = posixParser61.flatten(options62, strArray69, false);
        java.lang.String[] strArray73 = posixParser59.flatten(options60, strArray71, false);
        java.lang.String[] strArray75 = posixParser44.flatten(options58, strArray71, false);
        java.lang.String[] strArray77 = posixParser42.flatten(options43, strArray71, true);
        java.lang.String[] strArray79 = posixParser21.flatten(options41, strArray71, false);
        java.lang.String[] strArray81 = posixParser0.flatten(options20, strArray79, false);
        org.apache.commons.cli.Options options82 = null;
        java.lang.String[] strArray83 = null;
        java.util.Properties properties84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options82, strArray83, properties84, false);
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
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
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
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray37 = posixParser21.flatten(options32, strArray35, false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser21.flatten(options38, strArray53, true);
        java.lang.String[] strArray57 = posixParser0.flatten(options20, strArray53, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
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
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        posixParser34.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        java.lang.String[] strArray57 = posixParser34.flatten(options38, strArray55, false);
        java.lang.String[] strArray59 = posixParser0.flatten(options33, strArray55, true);
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine62 = posixParser0.parse(options60, strArray61);
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        org.apache.commons.cli.PosixParser posixParser59 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options60 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray69 = posixParser59.flatten(options60, strArray67, false);
        java.lang.String[] strArray71 = posixParser57.flatten(options58, strArray69, false);
        java.lang.String[] strArray73 = posixParser0.flatten(options56, strArray71, true);
        org.apache.commons.cli.Options options74 = null;
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = null;
        org.apache.commons.cli.PosixParser posixParser77 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options78 = null;
        java.lang.String[] strArray85 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray87 = posixParser77.flatten(options78, strArray85, false);
        java.lang.String[] strArray89 = posixParser75.flatten(options76, strArray87, false);
        java.lang.String[] strArray91 = posixParser0.flatten(options74, strArray87, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass98 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray33 = posixParser23.flatten(options24, strArray31, false);
        java.lang.String[] strArray35 = posixParser21.flatten(options22, strArray33, false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        java.lang.String[] strArray51 = posixParser37.flatten(options38, strArray49, false);
        org.apache.commons.cli.Options options52 = null;
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = null;
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray65 = posixParser55.flatten(options56, strArray63, false);
        java.lang.String[] strArray67 = posixParser53.flatten(options54, strArray65, false);
        java.lang.String[] strArray69 = posixParser37.flatten(options52, strArray65, false);
        java.lang.String[] strArray71 = posixParser21.flatten(options36, strArray69, false);
        java.lang.String[] strArray73 = posixParser0.flatten(options20, strArray69, true);
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray77 = posixParser0.flatten(options74, strArray75, true);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
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
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options24 = null;
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray35 = posixParser25.flatten(options26, strArray33, false);
        org.apache.commons.cli.Options options36 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray41 = posixParser25.flatten(options36, strArray39, false);
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray55 = posixParser45.flatten(options46, strArray53, false);
        java.lang.String[] strArray57 = posixParser43.flatten(options44, strArray55, false);
        java.lang.String[] strArray59 = posixParser25.flatten(options42, strArray57, true);
        posixParser25.burstToken("", false);
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray76 = posixParser66.flatten(options67, strArray74, false);
        java.lang.String[] strArray78 = posixParser64.flatten(options65, strArray76, false);
        java.lang.String[] strArray80 = posixParser25.flatten(options63, strArray76, false);
        org.apache.commons.cli.Options options81 = null;
        org.apache.commons.cli.PosixParser posixParser82 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options83 = null;
        java.lang.String[] strArray90 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray92 = posixParser82.flatten(options83, strArray90, false);
        java.lang.String[] strArray94 = posixParser25.flatten(options81, strArray90, false);
        java.lang.String[] strArray96 = posixParser0.flatten(options24, strArray90, false);
        org.apache.commons.cli.Option option97 = null;
        java.util.ListIterator listIterator98 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option97, listIterator98);
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray60 = posixParser44.flatten(options55, strArray58, false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray74 = posixParser64.flatten(options65, strArray72, false);
        java.lang.String[] strArray76 = posixParser62.flatten(options63, strArray74, false);
        java.lang.String[] strArray78 = posixParser44.flatten(options61, strArray76, true);
        java.lang.String[] strArray80 = posixParser42.flatten(options43, strArray76, false);
        java.lang.String[] strArray82 = posixParser21.flatten(options41, strArray76, true);
        java.lang.String[] strArray84 = posixParser0.flatten(options20, strArray82, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options91 = null;
        java.lang.String[] strArray95 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray97 = posixParser0.flatten(options91, strArray95, false);
        java.lang.Class<?> wildcardClass98 = strArray95.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray97);
        org.junit.Assert.assertArrayEquals(strArray97, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options27 = null;
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray40 = posixParser30.flatten(options31, strArray38, false);
        java.lang.String[] strArray42 = posixParser28.flatten(options29, strArray40, false);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray56 = posixParser46.flatten(options47, strArray54, false);
        java.lang.String[] strArray58 = posixParser44.flatten(options45, strArray56, false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray72 = posixParser62.flatten(options63, strArray70, false);
        java.lang.String[] strArray74 = posixParser60.flatten(options61, strArray72, false);
        java.lang.String[] strArray76 = posixParser44.flatten(options59, strArray72, false);
        java.lang.String[] strArray78 = posixParser28.flatten(options43, strArray76, true);
        java.lang.String[] strArray80 = posixParser0.flatten(options27, strArray78, false);
        java.lang.Class<?> wildcardClass81 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        java.lang.String[] strArray46 = posixParser0.flatten(options33, strArray42, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
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
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
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
        java.lang.String[] strArray58 = posixParser0.flatten(options20, strArray50, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = posixParser24.flatten(options25, strArray32, false);
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray40 = posixParser24.flatten(options35, strArray38, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        java.lang.String[] strArray56 = posixParser42.flatten(options43, strArray54, false);
        java.lang.String[] strArray58 = posixParser24.flatten(options41, strArray56, true);
        java.lang.String[] strArray60 = posixParser0.flatten(options23, strArray56, true);
        posixParser0.burstToken("", true);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        posixParser39.burstToken("", true);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray60 = posixParser44.flatten(options55, strArray58, false);
        java.lang.String[] strArray62 = posixParser39.flatten(options43, strArray58, true);
        posixParser39.burstToken("", false);
        posixParser39.burstToken("", true);
        posixParser39.burstToken("", true);
        posixParser39.burstToken("", true);
        posixParser39.burstToken("", false);
        org.apache.commons.cli.Options options78 = null;
        org.apache.commons.cli.PosixParser posixParser79 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options80 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray89 = posixParser79.flatten(options80, strArray87, false);
        java.lang.String[] strArray91 = posixParser39.flatten(options78, strArray87, true);
        java.lang.String[] strArray93 = posixParser0.flatten(options38, strArray91, true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options20 = null;
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        posixParser21.burstToken("", false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray54 = posixParser44.flatten(options45, strArray52, false);
        org.apache.commons.cli.Options options55 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray60 = posixParser44.flatten(options55, strArray58, false);
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray74 = posixParser64.flatten(options65, strArray72, false);
        java.lang.String[] strArray76 = posixParser62.flatten(options63, strArray74, false);
        java.lang.String[] strArray78 = posixParser44.flatten(options61, strArray76, true);
        java.lang.String[] strArray80 = posixParser42.flatten(options43, strArray76, false);
        java.lang.String[] strArray82 = posixParser21.flatten(options41, strArray76, true);
        java.lang.String[] strArray84 = posixParser0.flatten(options20, strArray82, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        java.lang.Class<?> wildcardClass97 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
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
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = posixParser0.parse(options20, strArray21, false);
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
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
        java.lang.String[] strArray35 = posixParser0.flatten(options1, strArray33, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.PosixParser posixParser5 = new org.apache.commons.cli.PosixParser();
        posixParser5.burstToken("", true);
        posixParser5.burstToken("", false);
        posixParser5.burstToken("", false);
        posixParser5.burstToken("", false);
        org.apache.commons.cli.Options options18 = null;
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray29 = posixParser19.flatten(options20, strArray27, false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", false);
        posixParser19.burstToken("", false);
        org.apache.commons.cli.Options options39 = null;
        org.apache.commons.cli.PosixParser posixParser40 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options41 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray50 = posixParser40.flatten(options41, strArray48, false);
        org.apache.commons.cli.Options options51 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray56 = posixParser40.flatten(options51, strArray54, false);
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray70 = posixParser60.flatten(options61, strArray68, false);
        java.lang.String[] strArray72 = posixParser58.flatten(options59, strArray70, false);
        java.lang.String[] strArray74 = posixParser40.flatten(options57, strArray72, true);
        java.lang.String[] strArray76 = posixParser19.flatten(options39, strArray72, true);
        java.lang.String[] strArray78 = posixParser5.flatten(options18, strArray72, true);
        java.util.Properties properties79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine81 = posixParser0.parse(options4, strArray72, properties79, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = posixParser17.flatten(options18, strArray25, false);
        java.lang.String[] strArray29 = posixParser15.flatten(options16, strArray27, false);
        java.lang.String[] strArray31 = posixParser0.flatten(options14, strArray27, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option53 = null;
        java.util.ListIterator listIterator54 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option53, listIterator54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
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
        java.lang.String[] strArray53 = posixParser0.flatten(options36, strArray51, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass63 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
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
        java.lang.String[] strArray70 = posixParser0.flatten(options53, strArray66, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray84 = posixParser0.flatten(options77, strArray82, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "--", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray37 = posixParser21.flatten(options32, strArray35, false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser21.flatten(options38, strArray53, true);
        java.lang.String[] strArray57 = posixParser0.flatten(options20, strArray53, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        org.apache.commons.cli.PosixParser posixParser70 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray80 = posixParser70.flatten(options71, strArray78, false);
        java.lang.String[] strArray82 = posixParser68.flatten(options69, strArray80, false);
        java.lang.String[] strArray84 = posixParser0.flatten(options67, strArray80, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option94 = null;
        java.util.ListIterator listIterator95 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option94, listIterator95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
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
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        posixParser34.burstToken("", true);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray49 = posixParser39.flatten(options40, strArray47, false);
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray55 = posixParser39.flatten(options50, strArray53, false);
        java.lang.String[] strArray57 = posixParser34.flatten(options38, strArray55, false);
        java.lang.String[] strArray59 = posixParser0.flatten(options33, strArray55, true);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        posixParser61.burstToken("", true);
        org.apache.commons.cli.Options options65 = null;
        org.apache.commons.cli.PosixParser posixParser66 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options67 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray76 = posixParser66.flatten(options67, strArray74, false);
        org.apache.commons.cli.Options options77 = null;
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray82 = posixParser66.flatten(options77, strArray80, false);
        java.lang.String[] strArray84 = posixParser61.flatten(options65, strArray82, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options60, strArray82, true);
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
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
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
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray37 = posixParser21.flatten(options32, strArray35, false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser21.flatten(options38, strArray53, true);
        java.lang.String[] strArray57 = posixParser0.flatten(options20, strArray53, true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options67 = null;
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = null;
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray78 = posixParser68.flatten(options69, strArray76, false);
        org.apache.commons.cli.Options options79 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray84 = posixParser68.flatten(options79, strArray82, false);
        java.lang.String[] strArray86 = posixParser0.flatten(options67, strArray82, false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Option option90 = null;
        java.util.ListIterator listIterator91 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option90, listIterator91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options27 = null;
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = null;
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray40 = posixParser30.flatten(options31, strArray38, false);
        java.lang.String[] strArray42 = posixParser28.flatten(options29, strArray40, false);
        org.apache.commons.cli.Options options43 = null;
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = null;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray56 = posixParser46.flatten(options47, strArray54, false);
        java.lang.String[] strArray58 = posixParser44.flatten(options45, strArray56, false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        org.apache.commons.cli.PosixParser posixParser62 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options63 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray72 = posixParser62.flatten(options63, strArray70, false);
        java.lang.String[] strArray74 = posixParser60.flatten(options61, strArray72, false);
        java.lang.String[] strArray76 = posixParser44.flatten(options59, strArray72, false);
        java.lang.String[] strArray78 = posixParser28.flatten(options43, strArray76, true);
        java.lang.String[] strArray80 = posixParser0.flatten(options27, strArray78, false);
        org.apache.commons.cli.Option option81 = null;
        java.util.ListIterator listIterator82 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option81, listIterator82);
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
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
        java.lang.String[] strArray54 = posixParser0.flatten(options41, strArray52, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Option option67 = null;
        java.util.ListIterator listIterator68 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option67, listIterator68);
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
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray31 = posixParser21.flatten(options22, strArray29, false);
        org.apache.commons.cli.Options options32 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray37 = posixParser21.flatten(options32, strArray35, false);
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        java.lang.String[] strArray53 = posixParser39.flatten(options40, strArray51, false);
        java.lang.String[] strArray55 = posixParser21.flatten(options38, strArray53, true);
        java.lang.String[] strArray57 = posixParser0.flatten(options20, strArray53, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options17 = null;
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray28 = posixParser18.flatten(options19, strArray26, false);
        org.apache.commons.cli.Options options29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray34 = posixParser18.flatten(options29, strArray32, false);
        posixParser18.burstToken("", false);
        posixParser18.burstToken("", false);
        posixParser18.burstToken("", false);
        posixParser18.burstToken("", false);
        posixParser18.burstToken("", false);
        posixParser18.burstToken("", true);
        posixParser18.burstToken("", false);
        posixParser18.burstToken("", false);
        org.apache.commons.cli.Options options59 = null;
        org.apache.commons.cli.PosixParser posixParser60 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options61 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray70 = posixParser60.flatten(options61, strArray68, false);
        org.apache.commons.cli.Options options71 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray76 = posixParser60.flatten(options71, strArray74, false);
        java.lang.String[] strArray78 = posixParser18.flatten(options59, strArray76, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine80 = posixParser0.parse(options17, strArray76, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
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
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray44 = posixParser34.flatten(options35, strArray42, false);
        java.lang.String[] strArray46 = posixParser32.flatten(options33, strArray44, false);
        java.lang.String[] strArray48 = posixParser16.flatten(options31, strArray44, false);
        java.lang.String[] strArray50 = posixParser0.flatten(options15, strArray48, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options66 = null;
        java.lang.String[] strArray67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray69 = posixParser0.flatten(options66, strArray67, false);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray10 = posixParser0.flatten(options1, strArray8, false);
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray16 = posixParser0.flatten(options11, strArray14, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options23 = null;
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray36 = posixParser26.flatten(options27, strArray34, false);
        posixParser26.burstToken("", false);
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray53 = posixParser43.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser41.flatten(options42, strArray53, false);
        java.lang.String[] strArray57 = posixParser26.flatten(options40, strArray53, false);
        java.lang.String[] strArray59 = posixParser24.flatten(options25, strArray53, true);
        org.apache.commons.cli.Options options60 = null;
        org.apache.commons.cli.PosixParser posixParser61 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options62 = null;
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = null;
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray73 = posixParser63.flatten(options64, strArray71, false);
        java.lang.String[] strArray75 = posixParser61.flatten(options62, strArray73, false);
        java.lang.String[] strArray77 = posixParser24.flatten(options60, strArray75, false);
        java.lang.String[] strArray79 = posixParser0.flatten(options23, strArray75, false);
        java.lang.Class<?> wildcardClass80 = strArray79.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        java.lang.String[] strArray35 = posixParser0.flatten(options1, strArray33, true);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = null;
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = null;
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray51 = posixParser41.flatten(options42, strArray49, false);
        posixParser41.burstToken("", false);
        org.apache.commons.cli.Options options55 = null;
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = null;
        org.apache.commons.cli.PosixParser posixParser58 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options59 = null;
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray68 = posixParser58.flatten(options59, strArray66, false);
        java.lang.String[] strArray70 = posixParser56.flatten(options57, strArray68, false);
        java.lang.String[] strArray72 = posixParser41.flatten(options55, strArray68, false);
        java.lang.String[] strArray74 = posixParser39.flatten(options40, strArray72, true);
        java.lang.String[] strArray76 = posixParser37.flatten(options38, strArray74, true);
        java.lang.String[] strArray78 = posixParser0.flatten(options36, strArray76, false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        java.lang.Class<?> wildcardClass88 = posixParser0.getClass();
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
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "--", "--", "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray12 = posixParser2.flatten(options3, strArray10, false);
        java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray32 = posixParser22.flatten(options23, strArray30, false);
        java.lang.String[] strArray34 = posixParser0.flatten(options21, strArray32, true);
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
        org.apache.commons.cli.Options options72 = null;
        org.apache.commons.cli.PosixParser posixParser73 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options74 = null;
        java.lang.String[] strArray81 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray83 = posixParser73.flatten(options74, strArray81, false);
        org.apache.commons.cli.Options options84 = null;
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray89 = posixParser73.flatten(options84, strArray87, false);
        java.lang.String[] strArray91 = posixParser39.flatten(options72, strArray89, true);
        java.lang.String[] strArray93 = posixParser0.flatten(options38, strArray89, true);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "--", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "--", "hi!", "hi!" });
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
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
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = null;
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray44 = posixParser34.flatten(options35, strArray42, false);
        java.lang.String[] strArray46 = posixParser32.flatten(options33, strArray44, false);
        java.lang.String[] strArray48 = posixParser16.flatten(options31, strArray44, false);
        java.lang.String[] strArray50 = posixParser0.flatten(options15, strArray48, true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", false);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "--", "", "", "", "hi!", "", "hi!" });
    }
}

