package org.apache.commons.cli;

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
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.createPadding((int) (short) 100);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                    ", "usage:", options15, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                    " + "'", str11, "                                                                                                    ");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setArgName("                                                                          ");
        int int12 = helpFormatter0.defaultWidth;
        helpFormatter0.setDescPadding(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str18 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "";
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter21, (int) (short) 100, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultLeftPad = 100;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "                                                                                                    ", options17, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultNewLine = "arg";
        int int18 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, (int) '#', "                                                                                                 ", "                                                                          ", options23, (int) '#', (int) (byte) 10, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding(0);
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.rtrim("      ");
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = helpFormatter0.createPadding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderOptions(stringBuffer7, (int) ' ', options9, 6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultLeftPad;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix(" ");
        helpFormatter0.setLeftPadding(32);
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (-1), " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        int int14 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "\n", options17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) (short) 1, (int) (short) 1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, 52, 7, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        helpFormatter0.setLeftPadding((int) (byte) 1);
        helpFormatter0.defaultWidth = 35;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 32, (int) (byte) 100, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                " + "'", str10, "                                ");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setArgName(" ");
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (short) 0, "-", "", options13, (int) (byte) 1, (int) (short) 0, "      ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "", " ", options9, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                ");
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = (byte) 0;
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter24, (int) (byte) 100, "                                   ", options27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultOptPrefix = "-";
        int int7 = helpFormatter0.getWidth();
        int int11 = helpFormatter0.findWrapPos("usage: ", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setSyntaxPrefix("\n");
        java.lang.String str13 = helpFormatter0.rtrim("                                                    ");
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "--", options16, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.setLeftPadding(0);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, 6, 3, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("arg");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("usage:");
        int int16 = helpFormatter0.getWidth();
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, 4, "                                   ", "          ", options22, 7, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        int int6 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 32, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultDescPad = (byte) 1;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "   ";
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, (int) (byte) 1, (int) (short) -1, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.lang.String str8 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 0, "--", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.createPadding(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                    " + "'", str10, "                                                    ");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.createPadding((int) ' ');
        helpFormatter0.setOptPrefix("");
        int int14 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                " + "'", str11, "                                ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setWidth(6);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (short) 1, (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.setLeftPadding((int) (byte) 0);
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (short) 0, "arg", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "-";
        java.lang.String str22 = helpFormatter0.createPadding(74);
        helpFormatter0.setNewLine("                                                    ");
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter25, (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                          " + "'", str22, "                                                                          ");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass5 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str16 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.defaultOptPrefix = "-";
        int int24 = helpFormatter0.findWrapPos(" ", 0, 10);
        java.lang.String str25 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "arg";
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultDescPad = 0;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 0, options13, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        int int10 = helpFormatter0.findWrapPos("arg", (int) (short) 100, (-1));
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 4, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str20 = helpFormatter0.rtrim("      ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        helpFormatter0.setWidth((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.rtrim("                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setNewLine("hi!");
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        int int12 = helpFormatter0.findWrapPos("          ", 35, (int) (short) 0);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, " ", "usage: ", options17, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                    ", options8, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setNewLine("");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "                                                    ", options10, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 100;
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str16 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.defaultOptPrefix = "-";
        int int24 = helpFormatter0.findWrapPos(" ", 0, 10);
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter25, 74, 7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.setNewLine("-");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 100, options14, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLeftPadding(74);
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "arg", options17, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultDescPad = 0;
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, 3, options18, (int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                ";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 0);
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.setLongOptPrefix("--");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", " ", options20, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getArgName();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        int int20 = helpFormatter0.getDescPadding();
        int int24 = helpFormatter0.findWrapPos("usage:", 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (byte) 100, "--", "", options15, 97, 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "--";
        helpFormatter0.defaultWidth = 0;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "--", "-", options15, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 97, "                                                                                                    ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(6);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int19 = helpFormatter0.findWrapPos(" ", (int) (short) 10, (-1));
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter20, (int) (short) 10, "usage: ", "                                                                                                    ", options24, (int) (short) 100, 6, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int7 = helpFormatter0.findWrapPos("--", (int) (short) 100, (int) (byte) 1);
        helpFormatter0.setArgName(" ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 4, options14, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("usage:");
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = (short) -1;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "--", options12, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setArgName("");
        helpFormatter0.defaultNewLine = "";
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) (short) 1, "   ", "                                ", options19, 35, (int) '4', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("--");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.setWidth(100);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) (byte) 0, (int) (byte) 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        int int7 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setArgName("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str17 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, 74, "\n", "", options22, (int) (byte) 100, 32, "      ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultDescPad = 0;
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = (short) 10;
        java.lang.String str17 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, 10, options20, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.getWidth();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, (int) (short) 10, options8, 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.setLeftPadding((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setNewLine("          ");
        helpFormatter0.defaultOptPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.setNewLine("                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getWidth();
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        int int16 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "", "\n", options20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultNewLine = "                                                    ";
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (byte) -1, "      ", "          ", options15, 0, (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderOptions(stringBuffer7, 0, options9, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 100);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) (short) 1, options15, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                ");
        helpFormatter0.defaultDescPad = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultDescPad = 35;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) (byte) 1, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(0);
        helpFormatter0.setArgName("hi!");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "      ", options14, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 0, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str18 = helpFormatter0.rtrim("");
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderOptions(stringBuffer20, 7, options22, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("          ");
        java.lang.String str8 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultNewLine = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("                                   ");
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                   " + "'", str11, "                                   ");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) (short) 10);
        helpFormatter0.setArgName("");
        helpFormatter0.defaultWidth = 0;
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.defaultLeftPad;
        int int16 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, (int) (short) 100, options19, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.createPadding(0);
        helpFormatter0.setOptPrefix("-");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultDescPad = 35;
        helpFormatter0.setWidth(0);
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 52, 1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.setOptPrefix("                                                    ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 1, "                                                                          ", "                                                    ", options13, 7, (int) (byte) -1, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.setSyntaxPrefix("   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = " ";
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.defaultSyntaxPrefix = "      ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.defaultOptPrefix = "--";
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setLongOptPrefix("");
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("arg");
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultArgName = "arg";
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.rtrim("                                                    ");
        helpFormatter0.setOptPrefix("   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setWidth(6);
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "-";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) (byte) 1, (int) (short) 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = (byte) 0;
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (int) (byte) 10, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int16 = helpFormatter0.getWidth();
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        int int18 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          " + "'", str17, "          ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.setLeftPadding(0);
        int int17 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        int int20 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.defaultLeftPad;
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        int int17 = helpFormatter0.defaultLeftPad;
        int int18 = helpFormatter0.getWidth();
        java.lang.String str19 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(74);
        helpFormatter0.setNewLine(" ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                          " + "'", str9, "                                                                          ");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.rtrim("usage:");
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultDescPad = (byte) 1;
        int int16 = helpFormatter0.findWrapPos("\n", 35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage:" + "'", str8, "usage:");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str10 = helpFormatter0.rtrim("\n");
        int int11 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter0.createPadding(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "          " + "'", str18, "          ");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLeftPadding(10);
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, 10, "\n", "      ", options22, 1, (int) (byte) -1, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = 32;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) '4', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "", options12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) 'a', 7, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        int int11 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.findWrapPos("usage:", 100, 3);
        int int19 = helpFormatter0.findWrapPos("   ", (int) (byte) 10, 100);
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter20, (int) (byte) 1, options22, 3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 6, options11, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (byte) 10, "\n", "                                   ", options15, 97, (int) (byte) 0, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("arg");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                                                                                 ", options18, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.setOptPrefix("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        java.lang.String str13 = helpFormatter0.rtrim(" ");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int14 = helpFormatter0.findWrapPos("-", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("          ");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                ", "                                                                                                    ", options11, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setNewLine("-");
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (-1), "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.defaultWidth;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 0, options13, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        int int12 = helpFormatter0.findWrapPos("", 35, (int) (byte) -1);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) (short) 100, "                                                                          ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultOptPrefix = "usage: ";
        int int12 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (byte) 100, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        helpFormatter0.defaultLeftPad = 4;
        helpFormatter0.setWidth((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "   ", "                                ", options7, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultNewLine = "          ";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 97, (int) (short) 100, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        int int18 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "-";
        int int7 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter0.createPadding(100);
        int int22 = helpFormatter0.findWrapPos("", (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "usage: ", "-", options11, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine(" ");
        int int14 = helpFormatter0.getLeftPadding();
        java.lang.String str15 = helpFormatter0.defaultArgName;
        java.lang.String str16 = helpFormatter0.getNewLine();
        int int20 = helpFormatter0.findWrapPos("", 3, 7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("          ");
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setArgName("      ");
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                                                 ", options18, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((int) ' ');
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 0, options14, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 0;
        int int7 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (byte) 1, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.setWidth(67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 'a';
        int int7 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "      ";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 74, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = (-1);
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "                                                    ", options23, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                 " + "'", str17, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                 " + "'", str18, "                                                                                                 ");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "usage: ", options10, "      ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderOptions(stringBuffer7, 0, options9, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.rtrim("usage:");
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage:" + "'", str8, "usage:");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("-");
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        int int20 = helpFormatter0.findWrapPos("\n", 3, (int) (byte) 10);
        java.lang.String str22 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        int int25 = helpFormatter0.getLeftPadding();
        java.lang.String str26 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setArgName("");
        int int13 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (byte) 10, "", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultLeftPad = (byte) -1;
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding((int) (byte) -1);
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.rtrim("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "   ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 74, 10, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultArgName = "usage:";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderWrappedText(stringBuffer18, (int) (short) 100, (int) (byte) 1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str9 = helpFormatter0.createPadding(74);
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (short) 1;
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                          " + "'", str9, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = 52;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding(0);
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (short) -1, "--", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, (int) (short) 100, (int) ' ', "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = 74;
        helpFormatter0.defaultNewLine = "                                                                          ";
        int int18 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.setArgName("usage:");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "-";
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.createPadding(98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                  " + "'", str14, "                                                                                                  ");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int13 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        helpFormatter0.setWidth((int) (byte) 10);
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 1, "                                                                          ", "hi!", options23, (int) (byte) 1, (int) (byte) 1, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (byte) 0, 0, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                ");
        helpFormatter0.defaultOptPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) ' ', "                                                                                                 ", "arg", options12, (int) 'a', (int) (short) 1, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (int) (short) 0, "usage: ", "-", options10, (int) (short) 0, 67, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderOptions(stringBuffer7, 32, options9, (int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("arg");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("usage:");
        int int16 = helpFormatter0.getWidth();
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) (short) 100, "                                                                                                    ", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str18 = helpFormatter0.rtrim("");
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, 6, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                ");
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = (byte) 0;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.defaultWidth = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        int int17 = helpFormatter0.getDescPadding();
        int int18 = helpFormatter0.defaultDescPad;
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        int int11 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(32);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                ", options15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding(1);
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 35, (int) (short) 100, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "usage:", options10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        int int5 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 100;
        helpFormatter0.defaultNewLine = "usage:";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter14, 4, options16, 67, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "      ";
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) '4', "                                                    ", "hi!", options18, 100, 74, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = (-1);
        helpFormatter0.defaultLongOptPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (byte) 1, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("");
        int int11 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "--", options14, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setOptPrefix("                                ");
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        int int12 = helpFormatter0.findWrapPos("          ", 35, (int) (short) 0);
        helpFormatter0.setNewLine("\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.getWidth();
        helpFormatter0.setArgName("\n");
        java.lang.String str19 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setLongOptPrefix("--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setLeftPadding(0);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 98, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("\n");
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("          ");
        java.lang.String str8 = helpFormatter0.createPadding((int) (short) 100);
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(32);
        helpFormatter0.defaultLongOptPrefix = "arg";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.setLongOptPrefix("");
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.setLongOptPrefix("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.defaultNewLine = "";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "usage: ", " ", options17, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth(1);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) (short) -1, 1, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) '#', "-", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setNewLine("-");
        helpFormatter0.setSyntaxPrefix("                                ");
        java.lang.String str14 = helpFormatter0.createPadding(98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                  " + "'", str14, "                                                                                                  ");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.getDescPadding();
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultDescPad = 10;
        int int21 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("--");
        int int15 = helpFormatter0.defaultWidth;
        int int16 = helpFormatter0.defaultWidth;
        helpFormatter0.setDescPadding((int) '#');
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = helpFormatter0.renderOptions(stringBuffer19, (int) '#', options21, 74, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                                          ", options17, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = 6;
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) ' ', (int) 'a', "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.getDescPadding();
        int int17 = helpFormatter0.getLeftPadding();
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) (byte) 0, 98, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.defaultArgName = "\n";
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = 100;
        int int19 = helpFormatter0.findWrapPos("                                                                                                    ", (int) 'a', 1);
        helpFormatter0.setLongOptPrefix("                                                                                                  ");
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "                                                                                                  ", "hi!", options25, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("usage:");
        int int11 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                " + "'", str8, "                                ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                " + "'", str10, "                                ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "-";
        java.lang.String str21 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultNewLine = "          ";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) (byte) 10, options15, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) '#', "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                ";
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 35, options14, 7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (short) 10, "                                ", "                                   ", options17, (int) (short) 10, 98, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("                                                                                                 ");
        int int18 = helpFormatter0.findWrapPos("", (int) (short) 100, (int) (short) 0);
        helpFormatter0.setLongOptPrefix("      ");
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "                                                                          ", "usage:", options25, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int14 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 4, 100, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        int int15 = helpFormatter0.defaultWidth;
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setLongOptPrefix("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) ' ');
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "--", "usage:", options12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultNewLine = "arg";
        int int18 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "hi!", options21, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.setDescPadding((int) (short) 10);
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) (short) 0, "                                ", "                                                                                                    ", options19, (int) ' ', (int) (short) -1, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setArgName("                                                                          ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "usage:", options14, "      ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("          ");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (byte) 1;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        int int16 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, 98, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = '4';
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.getDescPadding();
        int int17 = helpFormatter0.getLeftPadding();
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "   ";
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                  ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.setWidth(100);
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.findWrapPos("          ", (int) (short) 10, 52);
        int int16 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 1, "--", "                                                                                                  ", options13, 0, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setWidth((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int14 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding(52);
        java.lang.String str19 = helpFormatter0.createPadding(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    " + "'", str19, "    ");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.defaultDescPad = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str15 = helpFormatter0.rtrim("      ");
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix(" ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                " + "'", str10, "                                ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = " ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) '#', "                                                                                                  ", "arg", options13, 7, (int) (byte) 1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 98, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, (int) (short) 100, options10, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        java.lang.String str14 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("usage:");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = (short) 10;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 97, "                                                    ", "arg", options14, 35, 67, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.defaultOptPrefix = "--";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "      ", options15, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultArgName = "arg";
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "                                ", options15, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultLeftPad = 3;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) 'a', (int) (short) 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (byte) 100, "\n", "                                   ", options13, 32, (int) '#', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix(" ");
        helpFormatter0.setLeftPadding(32);
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setDescPadding(3);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "usage: ", "arg", options17, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding(1);
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "--";
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) (byte) 1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(32);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 0, 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(32);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        int int17 = helpFormatter0.findWrapPos("                                                                          ", (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = (short) 10;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 0, 10, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("--");
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str19 = helpFormatter0.createPadding(100);
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "                                                                                                  ", options22, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = " ";
        int int14 = helpFormatter0.defaultLeftPad;
        int int18 = helpFormatter0.findWrapPos("-", 100, (int) ' ');
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setArgName("");
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        int int14 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        java.lang.String str15 = helpFormatter0.createPadding((int) (short) 0);
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                                                                  ", options21, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, (int) (short) 10, "-", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine(" ");
        int int14 = helpFormatter0.defaultDescPad;
        java.lang.String str15 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding(10);
        java.lang.Class<?> wildcardClass18 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.defaultDescPad = 32;
        helpFormatter0.setWidth((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        int int8 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "                                                                          ", options11, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 100, 4, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int19 = helpFormatter0.findWrapPos(" ", (int) (short) 10, (-1));
        helpFormatter0.setArgName("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (byte) 10, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = 97;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.setLeftPadding(0);
        int int17 = helpFormatter0.defaultDescPad;
        int int18 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter19, (int) (byte) 0, options21, 98, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(10);
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "\n", "                                   ", options13, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "usage: ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 10;
        helpFormatter0.setOptPrefix("--");
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str13 = helpFormatter0.getArgName();
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str5 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str16 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.defaultOptPrefix = "-";
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, (int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int6 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(32, "usage:", " ", options12, "    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setSyntaxPrefix(" ");
        int int11 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        int int4 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("--");
        int int15 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = 3;
        helpFormatter0.setOptPrefix("-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, 67, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.setArgName("      ");
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 7, 52, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str5 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setArgName("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.Class<?> wildcardClass16 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        helpFormatter0.defaultLeftPad = '#';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "-";
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.setLeftPadding(10);
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setArgName("");
        int int13 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth((int) (byte) 0);
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth(4);
        helpFormatter0.setArgName("-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", "\n", options13, "                                                                                                  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                ");
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                ");
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter25, (int) ' ', "      ", "\n", options29, 6, 35, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("                                                                                                    ");
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter7, 100, options9, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultDescPad = 6;
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (byte) 10, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 0, "                                                                                                 ", "arg", options17, (int) (byte) 100, (int) '#', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        int int12 = helpFormatter0.findWrapPos("usage: ", (int) (short) 0, 3);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "hi!", "\n", options16, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str19 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                 " + "'", str17, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                 " + "'", str18, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        int int8 = helpFormatter0.findWrapPos("   ", (int) (byte) 1, (int) ' ');
        helpFormatter0.defaultLongOptPrefix = "    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setLongOptPrefix("                                                    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultNewLine = "arg";
        int int18 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, (int) (short) 0, "--", "usage:", options23, (int) (byte) 100, (int) (byte) 1, "      ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setArgName("-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setDescPadding((int) (byte) 0);
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.defaultNewLine = "\n";
        helpFormatter0.defaultDescPad = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getDescPadding();
        int int15 = helpFormatter0.getWidth();
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str17 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultOptPrefix = "-";
        int int7 = helpFormatter0.getWidth();
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.setDescPadding(0);
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.createPadding((int) ' ');
        helpFormatter0.setOptPrefix("");
        int int14 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (short) 100, 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                " + "'", str11, "                                ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 74, 4, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int16 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.rtrim("                                ");
        helpFormatter0.setDescPadding(97);
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("    ", options22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setArgName("      ");
        java.lang.String str20 = helpFormatter0.getArgName();
        java.lang.String str21 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "", options24, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "      " + "'", str20, "      ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "      " + "'", str21, "      ");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultOptPrefix = "";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "                                ", "      ", options9, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.defaultLeftPad;
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        int int17 = helpFormatter0.defaultLeftPad;
        java.lang.String str18 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str19 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultLeftPad = (byte) -1;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str22 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str23 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter24, (int) '4', options26, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                          " + "'", str23, "                                                                          ");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.getDescPadding();
        int int17 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                ";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                   ", "-", options14, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.setWidth(100);
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLeftPadding(35);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (byte) 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.setDescPadding((-1));
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "                                                                                                  ", "                                   ", options12, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, (int) ' ', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        helpFormatter0.defaultWidth = 52;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int19 = helpFormatter0.findWrapPos(" ", (int) (short) 10, (-1));
        helpFormatter0.defaultDescPad = 'a';
        java.lang.String str22 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 100, "   ", "      ", options13, (int) (short) 100, 3, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("--");
        int int13 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("                                                    ");
        helpFormatter0.defaultLeftPad = (byte) 0;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "   ", "arg", options21, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        helpFormatter0.defaultArgName = "                                                                          ";
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (-1), "-", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultLeftPad = 35;
        int int9 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "      ", options12, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("--");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 3, options17, 52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setLongOptPrefix("--");
        int int16 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("          ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.setOptPrefix("                                                                                                 ");
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str12 = helpFormatter0.getArgName();
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        int int17 = helpFormatter0.getDescPadding();
        int int18 = helpFormatter0.defaultDescPad;
        java.lang.String str20 = helpFormatter0.rtrim("usage: ");
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 0;
        java.lang.String str24 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter25, 74, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage:" + "'", str20, "usage:");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.setArgName("\n");
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 0, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                ");
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = (byte) 0;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                                                 ");
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.setWidth(32);
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultNewLine = "          ";
        helpFormatter0.defaultArgName = "      ";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(4, "      ", "                                   ", options18, "                                                                                                  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) (short) 10, 4, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        int int14 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultWidth = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (byte) 10);
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.rtrim("usage:");
        helpFormatter0.setDescPadding(100);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "usage:", "                                   ", options14, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage:" + "'", str8, "usage:");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "\n";
        java.lang.String str10 = helpFormatter0.rtrim("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setWidth(0);
        java.lang.String str16 = helpFormatter0.rtrim("                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        int int17 = helpFormatter0.getDescPadding();
        int int18 = helpFormatter0.defaultDescPad;
        java.lang.String str20 = helpFormatter0.rtrim("usage: ");
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 0;
        int int27 = helpFormatter0.findWrapPos(" ", (int) (short) -1, 4);
        java.io.PrintWriter printWriter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter28, 10, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage:" + "'", str20, "usage:");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setArgName("                                                                          ");
        int int12 = helpFormatter0.getWidth();
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("-");
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 35;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int10 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        int int7 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("--");
        int int15 = helpFormatter0.defaultWidth;
        int int16 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        int int19 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getDescPadding();
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("");
        int int21 = helpFormatter0.findWrapPos("hi!", 98, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 10, options14, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "                                                                                                  ", "                                                                                                    ", options13, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 97, "                                                                                                  ", "          ", options14, (int) (byte) 1, (-1), "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("--");
        int int15 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "      ", options18, "    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.getDescPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str16 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultDescPad = 3;
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        int int20 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = 1;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.defaultLeftPad;
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("                                                                          ");
        java.lang.String str20 = helpFormatter0.createPadding((int) 'a');
        java.lang.Class<?> wildcardClass21 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                 " + "'", str20, "                                                                                                 ");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str16 = helpFormatter0.rtrim("hi!");
        int int17 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, 10, options20, 74, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                ");
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(74);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.defaultWidth = 52;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultDescPad = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        int int16 = helpFormatter0.defaultWidth;
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, 0, 32, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str16 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultDescPad = 3;
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str21 = helpFormatter0.rtrim("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str18 = helpFormatter0.rtrim("");
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setOptPrefix("      ");
        helpFormatter0.setArgName("          ");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "          " + "'", str13, "          ");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.createPadding(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "   " + "'", str10, "   ");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.defaultNewLine = "                                                    ";
        int int5 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str11 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                                                 ");
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setSyntaxPrefix("usage: ");
        int int18 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultLongOptPrefix = "usage:";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultLeftPad = 6;
        helpFormatter0.defaultOptPrefix = "          ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter6, (int) (short) 100, options8, 100, 67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 4, "                                                    ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "arg";
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) ' ', "-", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setLongOptPrefix("    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultOptPrefix = "   ";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "arg", options17, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str9 = helpFormatter0.createPadding(74);
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (short) 1;
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, 97, options15, 0, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                          " + "'", str9, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("--");
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "   ";
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("-", 1, 0);
        java.lang.String str13 = helpFormatter0.rtrim("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultOptPrefix = " ";
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 7, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultNewLine = "arg";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.setLeftPadding(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 100, "", "usage: ", options11, 0, (int) 'a', "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.createPadding(3);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                                                                                 ", "                                   ", options15, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "   " + "'", str11, "   ");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                          ");
        helpFormatter0.defaultWidth = (-1);
        int int13 = helpFormatter0.findWrapPos("                                                                          ", (int) 'a', 32);
        helpFormatter0.setArgName("                                ");
        helpFormatter0.defaultArgName = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str11 = helpFormatter0.createPadding((int) 'a');
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (short) 100, options14, 98, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 " + "'", str11, "                                                                                                 ");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLeftPadding(10);
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setDescPadding(67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("          ");
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "hi!", "                                                    ", options11, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                ";
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                " + "'", str13, "                                ");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                                                 ");
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.setWidth(32);
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("      ");
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "\n";
        helpFormatter0.setArgName("arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int16 = helpFormatter0.getWidth();
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          " + "'", str17, "          ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "                                                    ";
        helpFormatter0.defaultWidth = 0;
        int int16 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int11 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str16 = helpFormatter0.rtrim("hi!");
        int int17 = helpFormatter0.getWidth();
        java.lang.String str18 = helpFormatter0.defaultArgName;
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setSyntaxPrefix("\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("                                                                                                 ");
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultArgName;
        int int17 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) (byte) 1, "   ", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (short) 1, "hi!", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(10);
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderWrappedText(stringBuffer8, 32, 32, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.setSyntaxPrefix("usage:");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (short) 10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 35, 6, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int7 = helpFormatter0.findWrapPos("--", (int) (short) 100, (int) (byte) 1);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, 0, options10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("--");
        int int15 = helpFormatter0.defaultWidth;
        int int16 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, (int) '#', options19, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int9 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.defaultWidth = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setSyntaxPrefix("    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.createPadding(3);
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "   " + "'", str11, "   ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        helpFormatter0.setLeftPadding((int) (byte) 1);
        helpFormatter0.setNewLine("");
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                " + "'", str10, "                                ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        int int17 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                          " + "'", str18, "                                                                          ");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultLeftPad = 97;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int16 = helpFormatter0.findWrapPos("                                                                                                 ", 52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 84 + "'", int16 == 84);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultLeftPad = 1;
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) 'a', 1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultLeftPad = (-1);
        helpFormatter0.defaultDescPad = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }
}

