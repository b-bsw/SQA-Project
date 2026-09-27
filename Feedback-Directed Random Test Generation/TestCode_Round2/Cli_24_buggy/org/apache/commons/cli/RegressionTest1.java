package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str7 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultLeftPad = (byte) 100;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "-", options12, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.findWrapPos("                                   ", 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "-";
        int int14 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        int int19 = helpFormatter0.getDescPadding();
        java.lang.String str20 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                                                                 ", "-", options24, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                                                    ", options12, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, 10, options11, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "arg", options11, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) (byte) 100, "          ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str10 = helpFormatter0.rtrim("arg");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        java.lang.String str15 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (byte) 1, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str27 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter28, (int) (short) 10, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        int int9 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, 0, options12, 3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.setLongOptPrefix("");
        java.util.Comparator comparator16 = helpFormatter12.getOptionComparator();
        helpFormatter0.optionComparator = comparator16;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "                                                                          ", options20, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter4, (int) '#', options6, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "\n";
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) ' ', 100, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "--";
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) 'a', "                                                                                                 ", "                                                                          ", options15, 3, (-1), "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "--";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                                                                                 ", options13, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter12.optionComparator = comparator15;
        int int17 = helpFormatter12.defaultWidth;
        helpFormatter12.setSyntaxPrefix("");
        helpFormatter12.setSyntaxPrefix("hi!");
        java.lang.String str22 = helpFormatter12.defaultOptPrefix;
        int int23 = helpFormatter12.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter24.optionComparator = comparator27;
        int int29 = helpFormatter24.defaultWidth;
        helpFormatter24.setSyntaxPrefix("");
        helpFormatter24.setSyntaxPrefix("hi!");
        java.lang.String str34 = helpFormatter24.defaultOptPrefix;
        int int35 = helpFormatter24.defaultLeftPad;
        java.util.Comparator comparator36 = null;
        helpFormatter24.setOptionComparator(comparator36);
        java.util.Comparator comparator38 = helpFormatter24.optionComparator;
        helpFormatter12.setOptionComparator(comparator38);
        helpFormatter0.setOptionComparator(comparator38);
        org.apache.commons.cli.HelpFormatter helpFormatter41 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator42 = helpFormatter41.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter43 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator44 = helpFormatter43.optionComparator;
        helpFormatter41.optionComparator = comparator44;
        int int46 = helpFormatter41.defaultWidth;
        helpFormatter41.setSyntaxPrefix("");
        helpFormatter41.setSyntaxPrefix("hi!");
        java.lang.String str51 = helpFormatter41.defaultOptPrefix;
        int int52 = helpFormatter41.defaultLeftPad;
        java.util.Comparator comparator53 = helpFormatter41.optionComparator;
        helpFormatter0.setOptionComparator(comparator53);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 74 + "'", int29 == 74);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-" + "'", str34, "-");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 74 + "'", int46 == 74);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-" + "'", str51, "-");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(comparator53);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) (byte) 10, "                                                    ", "                                                                                                 ", options19, 0, 97, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setWidth((int) (short) 100);
        int int17 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (byte) -1, (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "arg";
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "          ", options13, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 'a';
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str12 = helpFormatter0.createPadding(0);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, (int) (short) 1, 97, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        int int9 = helpFormatter0.findWrapPos("\n", 74, (int) 'a');
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 35, (int) ' ', "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.findWrapPos("hi!", (-1), 100);
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 74, options12, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        int int18 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding((int) (byte) 10);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "usage:", options16, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) -1, "                                                                                                    ", "hi!", options17, (int) (byte) 0, (int) (byte) 100, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter7.optionComparator = comparator10;
        helpFormatter0.setOptionComparator(comparator10);
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "-", options17, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.setLongOptPrefix("");
        int int15 = helpFormatter8.findWrapPos("-", (int) '#', 1);
        int int16 = helpFormatter8.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter17.optionComparator = comparator20;
        helpFormatter17.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter24.optionComparator = comparator27;
        helpFormatter17.setOptionComparator(comparator27);
        helpFormatter8.setOptionComparator(comparator27);
        java.lang.String str31 = helpFormatter8.defaultLongOptPrefix;
        helpFormatter8.defaultLeftPad = (short) 100;
        java.util.Comparator comparator34 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator34;
        java.lang.String str37 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultDescPad = (short) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 35;
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "                                                    ", "hi!", options19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "usage:", "", options13, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("usage: ");
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "usage: ";
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int17 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        int int19 = helpFormatter0.getLeftPadding();
        java.lang.String str20 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int17 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "                                                                          ", "hi!", options25, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter5 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator6 = helpFormatter5.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        helpFormatter5.optionComparator = comparator8;
        int int10 = helpFormatter5.defaultWidth;
        helpFormatter5.setSyntaxPrefix("");
        helpFormatter5.setSyntaxPrefix("hi!");
        java.lang.String str15 = helpFormatter5.defaultOptPrefix;
        int int16 = helpFormatter5.defaultLeftPad;
        java.util.Comparator comparator17 = helpFormatter5.optionComparator;
        helpFormatter0.setOptionComparator(comparator17);
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 0, "          ", " ", options23, 52, (int) '4', "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 10, "usage: ", "                                                                                                 ", options14, 0, 0, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        helpFormatter10.defaultLeftPad = 0;
        java.lang.String str17 = helpFormatter10.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter10.defaultLongOptPrefix;
        helpFormatter10.setLongOptPrefix("--");
        java.util.Comparator comparator21 = helpFormatter10.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.getNewLine();
        java.lang.String str24 = helpFormatter0.getOptPrefix();
        java.lang.String str25 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultArgName = "--";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 52, options17, (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) (short) 1, options15, 52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) (byte) 100, (int) (short) 10, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 0);
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter13.optionComparator = comparator16;
        helpFormatter13.defaultLeftPad = 0;
        java.lang.String str20 = helpFormatter13.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter13.defaultLongOptPrefix;
        java.lang.String str22 = helpFormatter13.defaultArgName;
        java.util.Comparator comparator23 = helpFormatter13.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "                                                                                                 ", "arg", options28, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.setOptPrefix("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setLeftPadding(35);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = (short) 100;
        helpFormatter0.setNewLine("");
        java.lang.Class<?> wildcardClass28 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (short) 10, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding((int) '#');
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) 10, "arg", "usage: ", options17, (int) (byte) 0, (int) ' ', "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "\n", options7, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "arg";
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("\n");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 35, "                                                    ", "-", options16, 35, (int) '4', "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage:", options13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setDescPadding((int) (short) 0);
        helpFormatter0.setOptPrefix("\n");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.setLongOptPrefix("");
        int int19 = helpFormatter12.findWrapPos("-", (int) '#', 1);
        int int20 = helpFormatter12.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        helpFormatter21.optionComparator = comparator24;
        helpFormatter21.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator29 = helpFormatter28.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter28.optionComparator = comparator31;
        helpFormatter21.setOptionComparator(comparator31);
        helpFormatter12.setOptionComparator(comparator31);
        helpFormatter0.optionComparator = comparator31;
        helpFormatter0.defaultLeftPad = (byte) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(comparator31);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str26 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) (byte) 10);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.setLeftPadding(0);
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 10, options17, (int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.createPadding(10);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "          " + "'", str13, "          ");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = (short) 100;
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "                                                                          ", " ", options29, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding((int) (byte) 1);
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                   ", "", options7, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = null;
        helpFormatter0.setOptionComparator(comparator12);
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "usage: ", options17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str13 = helpFormatter0.getArgName();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLeftPadding(100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultLeftPad = (short) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        int int9 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "usage: ", "          ", options13, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        int int11 = helpFormatter0.getWidth();
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage:";
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) 'a', (int) (byte) 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 0, "hi!", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str15 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "", "arg", options10, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.setLongOptPrefix("");
        int int15 = helpFormatter8.findWrapPos("-", (int) '#', 1);
        int int16 = helpFormatter8.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter17.optionComparator = comparator20;
        helpFormatter17.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter24.optionComparator = comparator27;
        helpFormatter17.setOptionComparator(comparator27);
        helpFormatter8.setOptionComparator(comparator27);
        java.lang.String str31 = helpFormatter8.defaultLongOptPrefix;
        helpFormatter8.defaultLeftPad = (short) 100;
        java.util.Comparator comparator34 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator34;
        java.lang.String str37 = helpFormatter0.rtrim("                                                                          ");
        java.io.PrintWriter printWriter38 = null;
        org.apache.commons.cli.Options options40 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter38, (int) '4', options40, 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, (int) (byte) 100, options12, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        int int11 = helpFormatter0.getWidth();
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage:";
        helpFormatter0.defaultNewLine = "usage: ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.createPadding((int) (short) 1);
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) (short) 0, " ", "                                                                                                    ", options18, 10, 3, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.createPadding((int) 'a');
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 " + "'", str11, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "          ", "hi!", options13, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.defaultNewLine = "-";
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, 3, "                                                    ", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth((int) (short) 100);
        int int16 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str15 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) (short) 0, "arg", "                                                                          ", options20, 3, (int) (byte) 100, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultNewLine = "--";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (short) 1, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = ' ';
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderWrappedText(stringBuffer18, 3, (int) (short) 100, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 0, 35, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (short) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                                                 ");
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, 74, options10, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (short) 0, " ", "", options15, (int) (byte) 100, 0, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.defaultLeftPad = 100;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, (int) (byte) 10, "                                   ", "                                                                                                 ", options9, (-1), (int) (short) -1, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultLeftPad = '#';
        int int17 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, 0, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        helpFormatter0.defaultArgName = "          ";
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "                                   ", options14, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        int int9 = helpFormatter0.defaultWidth;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter11.setLongOptPrefix("");
        int int18 = helpFormatter11.findWrapPos("-", (int) '#', 1);
        helpFormatter11.defaultOptPrefix = "--";
        java.lang.String str21 = helpFormatter11.defaultArgName;
        helpFormatter11.setNewLine("\n");
        helpFormatter11.defaultSyntaxPrefix = "-";
        java.lang.String str26 = helpFormatter11.getOptPrefix();
        helpFormatter11.setLongOptPrefix("                                                                                                    ");
        java.util.Comparator comparator29 = helpFormatter11.getOptionComparator();
        helpFormatter0.optionComparator = comparator29;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.setLeftPadding((int) (byte) 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage:" + "'", str10, "usage:");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.setLongOptPrefix("");
        int int15 = helpFormatter8.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str16 = helpFormatter8.defaultOptPrefix;
        java.lang.String str17 = helpFormatter8.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        helpFormatter18.optionComparator = comparator21;
        helpFormatter18.defaultLeftPad = 0;
        java.lang.String str25 = helpFormatter18.defaultLongOptPrefix;
        java.lang.String str26 = helpFormatter18.defaultLongOptPrefix;
        helpFormatter18.setLongOptPrefix("--");
        java.util.Comparator comparator29 = helpFormatter18.getOptionComparator();
        helpFormatter8.setOptionComparator(comparator29);
        helpFormatter0.setOptionComparator(comparator29);
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "--" + "'", str25, "--");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 10, 35, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        helpFormatter0.defaultDescPad = (byte) 0;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter0.optionComparator;
        helpFormatter0.defaultDescPad = (-1);
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options24);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.getLeftPadding();
        int int17 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "usage:", "                                                    ", options17, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("--");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "usage: ", options12, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        int int3 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) 0, 0, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) 'a', "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = ' ';
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "                                   ", "usage: ", options23, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "\n";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setWidth((int) (byte) 1);
        java.lang.String str17 = helpFormatter0.rtrim("                                                                          ");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderWrappedText(stringBuffer18, 35, (int) ' ', "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int21 = helpFormatter0.defaultLeftPad;
        int int22 = helpFormatter0.getLeftPadding();
        java.lang.String str23 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "\n", "hi!", options27, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 0, "usage:", "\n", options14, 100, 1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "hi!", options18, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, 35, options8, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "";
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, (int) '4', options12, 1, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 100, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.lang.String str12 = helpFormatter0.rtrim("hi!");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) (short) 100, (int) (byte) 1, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.setLeftPadding((int) (short) 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        int int10 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter11.defaultLeftPad = 100;
        helpFormatter11.setOptPrefix("");
        helpFormatter11.setOptPrefix("usage: ");
        helpFormatter11.defaultNewLine = "hi!";
        helpFormatter11.defaultNewLine = "hi!";
        java.util.Comparator comparator23 = helpFormatter11.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        helpFormatter0.defaultOptPrefix = "\n";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 3;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "hi!";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultDescPad = 3;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter4, 3, options6, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 0, "                                                                          ", "                                                                          ", options17, (int) (short) 100, 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) ' ', (int) 'a', "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultArgName = "-";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options13, "--", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "arg";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, (int) (byte) 100, 97, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        int int11 = helpFormatter0.findWrapPos("arg", 10, (int) 'a');
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int17 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "-", options20, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        int int17 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding(74);
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, 74, "                                                                                                 ", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 10, (int) ' ', "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.setWidth((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultWidth = (byte) -1;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (byte) 10, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter11.optionComparator = comparator14;
        helpFormatter11.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        helpFormatter18.optionComparator = comparator21;
        helpFormatter11.setOptionComparator(comparator21);
        java.util.Comparator comparator24 = helpFormatter11.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator24);
        helpFormatter0.setNewLine("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator24);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        int int15 = helpFormatter10.defaultWidth;
        helpFormatter10.setSyntaxPrefix("");
        helpFormatter10.setSyntaxPrefix("hi!");
        java.lang.String str20 = helpFormatter10.defaultOptPrefix;
        int int21 = helpFormatter10.defaultLeftPad;
        java.util.Comparator comparator22 = null;
        helpFormatter10.setOptionComparator(comparator22);
        java.util.Comparator comparator24 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator24);
        java.lang.String str26 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter27, 0, (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage: " + "'", str26, "usage: ");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 0, (int) (byte) 10, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultWidth = 10;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "                                                    ", "--", options15, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.util.Comparator comparator26 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "hi!", "usage: ", options30, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth(74);
        java.lang.String str20 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter21, (int) (byte) 100, options23, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter13.defaultLeftPad = 100;
        helpFormatter13.setSyntaxPrefix("--");
        int int19 = helpFormatter13.defaultWidth;
        helpFormatter13.setArgName("--");
        java.util.Comparator comparator22 = helpFormatter13.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator22);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        int int16 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.Class<?> wildcardClass12 = comparator11.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.rtrim("-");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 97, (int) (byte) -1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "hi!", options15, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 10, options14, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.defaultNewLine = "usage: ";
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, 97, "", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 100;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("--");
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) '#', "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter7.optionComparator = comparator10;
        helpFormatter0.setOptionComparator(comparator10);
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "";
        java.lang.String str16 = helpFormatter0.getArgName();
        int int17 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 35, (int) (byte) 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth(74);
        java.lang.String str20 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "          ", options24, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        int int10 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultArgName = "                                                                          ";
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) ' ', "arg", "usage:", options20, (int) (byte) 1, 0, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.createPadding(74);
        int int15 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                          " + "'", str14, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.findWrapPos("hi!", (-1), 100);
        helpFormatter0.defaultWidth = (short) -1;
        int int13 = helpFormatter0.findWrapPos("hi!", 3, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "--";
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, (-1), "                                                                          ", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.setNewLine("                                   ");
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (byte) 100, "hi!", "", options14, (int) (byte) 1, (int) (byte) -1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.getNewLine();
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str14 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("--");
        int int17 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, 97, "          ", "usage: ", options22, (int) (short) -1, (int) (byte) 10, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.rtrim("usage: ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultWidth = (byte) -1;
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = 0;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "", options14, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        int int9 = helpFormatter0.defaultDescPad;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 3;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "--", "                                                    ", options17, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName(" ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "          ", options12, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.getArgName();
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        int int15 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter9.defaultLeftPad = 100;
        helpFormatter9.setOptPrefix("");
        int int15 = helpFormatter9.defaultWidth;
        int int16 = helpFormatter9.getDescPadding();
        java.util.Comparator comparator17 = helpFormatter9.optionComparator;
        helpFormatter0.setOptionComparator(comparator17);
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        helpFormatter19.optionComparator = comparator22;
        helpFormatter19.defaultLeftPad = 0;
        java.lang.String str26 = helpFormatter19.defaultLongOptPrefix;
        java.lang.String str27 = helpFormatter19.defaultLongOptPrefix;
        helpFormatter19.setLongOptPrefix("--");
        java.util.Comparator comparator30 = helpFormatter19.getOptionComparator();
        helpFormatter0.optionComparator = comparator30;
        org.apache.commons.cli.Options options34 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "                                   ", options34, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertNotNull(comparator30);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str14 = helpFormatter0.createPadding(3);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   " + "'", str14, "   ");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        int int8 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter9.setLongOptPrefix("");
        int int16 = helpFormatter9.findWrapPos("-", (int) '#', 1);
        helpFormatter9.defaultOptPrefix = "--";
        int int19 = helpFormatter9.getDescPadding();
        java.util.Comparator comparator20 = helpFormatter9.getOptionComparator();
        helpFormatter0.optionComparator = comparator20;
        java.lang.Class<?> wildcardClass22 = comparator20.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = ' ';
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) '#', (int) (short) 10, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 35, options11, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.defaultLeftPad = 100;
        helpFormatter12.setSyntaxPrefix("--");
        helpFormatter12.setOptPrefix("hi!");
        helpFormatter12.setNewLine("usage: ");
        helpFormatter12.setLeftPadding(74);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        helpFormatter24.setLongOptPrefix("");
        int int31 = helpFormatter24.findWrapPos("-", (int) '#', 1);
        helpFormatter24.defaultOptPrefix = "--";
        java.lang.String str34 = helpFormatter24.defaultArgName;
        helpFormatter24.setNewLine("\n");
        helpFormatter24.defaultSyntaxPrefix = "-";
        helpFormatter24.defaultLeftPad = (byte) 10;
        int int41 = helpFormatter24.defaultWidth;
        java.util.Comparator comparator42 = helpFormatter24.getOptionComparator();
        helpFormatter12.optionComparator = comparator42;
        helpFormatter0.setOptionComparator(comparator42);
        java.lang.Class<?> wildcardClass45 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 74 + "'", int41 == 74);
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName(" ");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) (byte) 0, (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str15 = helpFormatter0.createPadding((int) '4');
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) 'a', " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                    " + "'", str15, "                                                    ");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter7.optionComparator = comparator10;
        helpFormatter0.setOptionComparator(comparator10);
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.setWidth((int) (short) 10);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str13 = helpFormatter0.rtrim("                                                                          ");
        int int14 = helpFormatter0.defaultWidth;
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter4, 10, "usage: ", "                                                                          ", options8, 1, 10, "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "usage:", "", options14, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.getNewLine();
        int int13 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "-", options16, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setArgName("--");
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, (int) (byte) 100, options17, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        int int15 = helpFormatter10.defaultWidth;
        helpFormatter10.setSyntaxPrefix("");
        helpFormatter10.setSyntaxPrefix("hi!");
        java.lang.String str20 = helpFormatter10.defaultOptPrefix;
        int int21 = helpFormatter10.defaultLeftPad;
        java.util.Comparator comparator22 = null;
        helpFormatter10.setOptionComparator(comparator22);
        java.util.Comparator comparator24 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator24);
        java.lang.String str26 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "                                   ", options29, "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage: " + "'", str26, "usage: ");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 97, " ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                          " + "'", str14, "                                                                          ");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 0, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("\n");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "", options12, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        int int17 = helpFormatter0.defaultDescPad;
        int int18 = helpFormatter0.defaultLeftPad;
        int int19 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        java.lang.String str19 = helpFormatter0.rtrim("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str13 = helpFormatter0.rtrim("                                                                          ");
        int int14 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, 52, (int) '4', "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 100, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        helpFormatter10.defaultLeftPad = 0;
        helpFormatter10.defaultOptPrefix = "-";
        helpFormatter10.setWidth(1);
        java.util.Comparator comparator21 = helpFormatter10.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        helpFormatter0.setDescPadding((int) (byte) 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator21);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.rtrim(" ");
        helpFormatter0.setArgName("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        java.lang.String str17 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("                                   ");
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, (int) (short) 1, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        int int10 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultArgName = "                                                                          ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "\n", "", options19, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 100, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.rtrim("usage: ");
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage:" + "'", str10, "usage:");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setArgName("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        int int7 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) (byte) 0, 0, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 100, "\n", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "hi!";
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) (byte) 1, 52, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        helpFormatter0.defaultDescPad = (byte) 0;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter0.optionComparator;
        int int19 = helpFormatter0.getLeftPadding();
        java.lang.String str20 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.getArgName();
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "                                                                                                    ", "          ", options18, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("--");
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, (int) (byte) 100, (int) '4', "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "--";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 97, "                                                    ", "-", options14, 74, 0, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "\n";
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth((int) (short) 100);
        int int16 = helpFormatter0.defaultDescPad;
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "usage:", options21, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        helpFormatter10.defaultLeftPad = 0;
        helpFormatter10.defaultOptPrefix = "-";
        helpFormatter10.setWidth(1);
        java.util.Comparator comparator21 = helpFormatter10.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.io.PrintWriter printWriter23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter23, 0, options25, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator21);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth((int) (short) 100);
        int int16 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "\n", "-", options20, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter9.defaultLeftPad = 100;
        helpFormatter9.setSyntaxPrefix("--");
        helpFormatter9.setOptPrefix("-");
        helpFormatter9.setLongOptPrefix("arg");
        java.util.Comparator comparator19 = helpFormatter9.getOptionComparator();
        helpFormatter0.optionComparator = comparator19;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setArgName("          ");
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 74, "          ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str13 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter14, (int) '4', options16, 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = null;
        helpFormatter0.setOptionComparator(comparator12);
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 10, options17, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 0);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "", options15, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        int int15 = helpFormatter10.defaultWidth;
        helpFormatter10.setSyntaxPrefix("");
        helpFormatter10.setSyntaxPrefix("hi!");
        java.lang.String str20 = helpFormatter10.defaultOptPrefix;
        int int21 = helpFormatter10.defaultLeftPad;
        java.util.Comparator comparator22 = null;
        helpFormatter10.setOptionComparator(comparator22);
        java.util.Comparator comparator24 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator24);
        int int26 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter27, (int) (byte) 10, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str16 = helpFormatter0.rtrim("usage: ");
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) ' ', "arg", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine(" ");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.io.PrintWriter printWriter27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter27, 97, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, (int) '#', "-", "                                                                                                    ", options9, 100, (int) '#', " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        int int8 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter9.setLongOptPrefix("");
        int int16 = helpFormatter9.findWrapPos("-", (int) '#', 1);
        helpFormatter9.defaultOptPrefix = "--";
        int int19 = helpFormatter9.getDescPadding();
        java.util.Comparator comparator20 = helpFormatter9.getOptionComparator();
        helpFormatter0.optionComparator = comparator20;
        java.lang.String str22 = helpFormatter0.defaultLongOptPrefix;
        int int23 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str13 = helpFormatter0.rtrim("                                                                          ");
        int int14 = helpFormatter0.defaultWidth;
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        int int15 = helpFormatter10.defaultWidth;
        helpFormatter10.setSyntaxPrefix("");
        helpFormatter10.setSyntaxPrefix("hi!");
        java.lang.String str20 = helpFormatter10.defaultOptPrefix;
        int int21 = helpFormatter10.defaultLeftPad;
        java.util.Comparator comparator22 = null;
        helpFormatter10.setOptionComparator(comparator22);
        java.util.Comparator comparator24 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator24);
        java.lang.String str26 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator28 = helpFormatter27.optionComparator;
        helpFormatter27.setLongOptPrefix("");
        int int34 = helpFormatter27.findWrapPos("-", (int) '#', 1);
        helpFormatter27.setDescPadding((int) (short) 100);
        helpFormatter27.defaultDescPad = '#';
        java.util.Comparator comparator39 = helpFormatter27.optionComparator;
        helpFormatter0.setOptionComparator(comparator39);
        helpFormatter0.defaultNewLine = "usage: ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage: " + "'", str26, "usage: ");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setArgName("                                                                                                    ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "usage:", options20, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.setLongOptPrefix("");
        int int15 = helpFormatter8.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str16 = helpFormatter8.defaultOptPrefix;
        java.lang.String str17 = helpFormatter8.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        helpFormatter18.optionComparator = comparator21;
        helpFormatter18.defaultLeftPad = 0;
        java.lang.String str25 = helpFormatter18.defaultLongOptPrefix;
        java.lang.String str26 = helpFormatter18.defaultLongOptPrefix;
        helpFormatter18.setLongOptPrefix("--");
        java.util.Comparator comparator29 = helpFormatter18.getOptionComparator();
        helpFormatter8.setOptionComparator(comparator29);
        helpFormatter0.setOptionComparator(comparator29);
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "--" + "'", str25, "--");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter7.optionComparator = comparator10;
        helpFormatter0.setOptionComparator(comparator10);
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "";
        java.lang.String str16 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "";
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter19.setLongOptPrefix("");
        int int26 = helpFormatter19.findWrapPos("-", (int) '#', 1);
        int int27 = helpFormatter19.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator29 = helpFormatter28.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter28.optionComparator = comparator31;
        helpFormatter28.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator36 = helpFormatter35.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter37 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator38 = helpFormatter37.optionComparator;
        helpFormatter35.optionComparator = comparator38;
        helpFormatter28.setOptionComparator(comparator38);
        helpFormatter19.setOptionComparator(comparator38);
        helpFormatter0.optionComparator = comparator38;
        java.io.PrintWriter printWriter43 = null;
        org.apache.commons.cli.Options options47 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter43, 10, "                                                                          ", "usage: ", options47, (int) (byte) -1, 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str16 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth(74);
        int int20 = helpFormatter0.getWidth();
        int int21 = helpFormatter0.defaultWidth;
        java.lang.String str22 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        int int8 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (byte) -1, "                                   ", " ", options13, 52, (int) (short) 1, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding(52);
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = 74;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "--", "\n", options10, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 0, "usage: ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        helpFormatter0.defaultNewLine = "--";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "usage: ", options19, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.rtrim("-");
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultLongOptPrefix = "";
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        helpFormatter21.optionComparator = comparator24;
        helpFormatter21.defaultLeftPad = 0;
        java.lang.String str28 = helpFormatter21.defaultLongOptPrefix;
        helpFormatter21.defaultArgName = "";
        int int31 = helpFormatter21.defaultLeftPad;
        java.util.Comparator comparator32 = helpFormatter21.getOptionComparator();
        helpFormatter0.optionComparator = comparator32;
        java.io.PrintWriter printWriter34 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter34, (int) (short) 100, (int) (byte) 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "--" + "'", str28, "--");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str13 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.rtrim("arg");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 35, "                                                    ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setOptPrefix("");
        int int19 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = ' ';
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("-");
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 74, 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "                                   ", "-", options18, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (short) 1, "                                                                                                 ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        int int17 = helpFormatter0.defaultLeftPad;
        int int18 = helpFormatter0.getLeftPadding();
        int int19 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) ' ', options16, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.createPadding((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.findWrapPos("hi!", (-1), 100);
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setWidth((int) (short) 100);
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (int) '#', "                                                                                                    ", "                                                    ", options21, 35, (-1), "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.getDescPadding();
        int int12 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (-1), "usage:", "   ", options17, (int) (short) 10, 35, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int17 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        int int19 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                   ");
        java.lang.String str22 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "                                   ", "                                   ", options10, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str13 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 0);
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "                                                                                                    ", options19, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str14 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = '4';
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.setLongOptPrefix("");
        int int19 = helpFormatter12.findWrapPos("-", (int) '#', 1);
        int int20 = helpFormatter12.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        helpFormatter21.optionComparator = comparator24;
        helpFormatter21.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator29 = helpFormatter28.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter28.optionComparator = comparator31;
        helpFormatter21.setOptionComparator(comparator31);
        helpFormatter12.setOptionComparator(comparator31);
        helpFormatter0.optionComparator = comparator31;
        int int36 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options38 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options38, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 74 + "'", int36 == 74);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        helpFormatter0.setNewLine("                                                                          ");
        java.lang.String str9 = helpFormatter0.rtrim("\n");
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        helpFormatter0.defaultDescPad = (byte) 0;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter0.optionComparator;
        java.lang.String str19 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter20.optionComparator = comparator23;
        helpFormatter20.defaultLeftPad = 0;
        java.lang.String str27 = helpFormatter20.defaultLongOptPrefix;
        java.lang.String str28 = helpFormatter20.defaultLongOptPrefix;
        java.lang.String str29 = helpFormatter20.defaultArgName;
        java.util.Comparator comparator30 = helpFormatter20.getOptionComparator();
        helpFormatter0.optionComparator = comparator30;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "--" + "'", str28, "--");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator30);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = null;
        helpFormatter0.setOptionComparator(comparator12);
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        helpFormatter0.setLeftPadding(0);
        java.lang.String str17 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, (int) (short) 10, options10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        int int12 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 1, "                                                    ", "", options15, 0, (int) (byte) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str12 = helpFormatter0.createPadding(100);
        helpFormatter0.setLeftPadding((int) ' ');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int6 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, (int) '#', "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.setArgName("-");
        int int17 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, 0, (int) (short) 1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultNewLine = "";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "arg", options15, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((-1));
        helpFormatter0.setLeftPadding(0);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (short) 100, (-1), " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "";
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultArgName = "                                   ";
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (byte) 0, "                                                                                                    ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 74, "--", "          ", options13, (-1), 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        int int9 = helpFormatter0.findWrapPos("                                                                          ", 0, (int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, 97, "", "-", options12, (int) 'a', 0, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "--";
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderWrappedText(stringBuffer8, 3, 52, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "hi!", "", options12, "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) (short) 1, options11, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) (byte) 10, "   ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "usage: ", options14, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter15.setLongOptPrefix("");
        int int22 = helpFormatter15.findWrapPos("-", (int) (short) 10, 74);
        int int23 = helpFormatter15.getDescPadding();
        helpFormatter15.setLongOptPrefix("hi!");
        helpFormatter15.defaultNewLine = "";
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator29 = helpFormatter28.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter28.optionComparator = comparator31;
        helpFormatter28.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator36 = helpFormatter35.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter37 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator38 = helpFormatter37.optionComparator;
        helpFormatter35.optionComparator = comparator38;
        helpFormatter28.setOptionComparator(comparator38);
        org.apache.commons.cli.HelpFormatter helpFormatter41 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator42 = helpFormatter41.optionComparator;
        java.util.Comparator comparator43 = helpFormatter41.getOptionComparator();
        helpFormatter28.optionComparator = comparator43;
        helpFormatter15.optionComparator = comparator43;
        helpFormatter15.defaultDescPad = 3;
        int int48 = helpFormatter15.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter49 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator50 = helpFormatter49.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter51 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator52 = helpFormatter51.optionComparator;
        helpFormatter49.optionComparator = comparator52;
        int int54 = helpFormatter49.defaultWidth;
        helpFormatter49.setNewLine("arg");
        helpFormatter49.setDescPadding((int) (byte) -1);
        helpFormatter49.setNewLine("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter61 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator62 = helpFormatter61.optionComparator;
        helpFormatter61.setLongOptPrefix("");
        java.util.Comparator comparator65 = helpFormatter61.getOptionComparator();
        helpFormatter49.optionComparator = comparator65;
        helpFormatter15.setOptionComparator(comparator65);
        helpFormatter0.setOptionComparator(comparator65);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertNotNull(comparator43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 74 + "'", int48 == 74);
        org.junit.Assert.assertNotNull(comparator50);
        org.junit.Assert.assertNotNull(comparator52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 74 + "'", int54 == 74);
        org.junit.Assert.assertNotNull(comparator62);
        org.junit.Assert.assertNotNull(comparator65);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str14 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.getWidth();
        int int16 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "", "          ", options20, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter12.optionComparator = comparator15;
        int int17 = helpFormatter12.defaultWidth;
        helpFormatter12.setSyntaxPrefix("");
        helpFormatter12.setSyntaxPrefix("hi!");
        java.lang.String str22 = helpFormatter12.defaultOptPrefix;
        int int23 = helpFormatter12.defaultLeftPad;
        java.util.Comparator comparator24 = null;
        helpFormatter12.setOptionComparator(comparator24);
        java.util.Comparator comparator26 = helpFormatter12.optionComparator;
        helpFormatter0.setOptionComparator(comparator26);
        helpFormatter0.setOptPrefix("                                   ");
        java.lang.String str30 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.lang.String str4 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.setDescPadding(0);
        helpFormatter0.defaultArgName = "-";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "", "usage: ", options15, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) '#', "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        int int25 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 10, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter4, (int) ' ', "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 100;
        int int12 = helpFormatter0.getLeftPadding();
        java.lang.String str14 = helpFormatter0.rtrim("                                                                          ");
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, (int) (short) -1, "                                                    ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setDescPadding(35);
        helpFormatter0.setWidth((int) '4');
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str13 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        int int15 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultWidth = 97;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str9 = helpFormatter0.createPadding(10);
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator6 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(comparator6);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultNewLine = "";
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter13.optionComparator = comparator16;
        helpFormatter13.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter20.optionComparator = comparator23;
        helpFormatter13.setOptionComparator(comparator23);
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        java.util.Comparator comparator28 = helpFormatter26.getOptionComparator();
        helpFormatter13.optionComparator = comparator28;
        helpFormatter0.optionComparator = comparator28;
        java.io.PrintWriter printWriter31 = null;
        org.apache.commons.cli.Options options34 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter31, 52, "", options34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(comparator28);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("arg");
        int int14 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (-1), "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        int int17 = helpFormatter0.findWrapPos("          ", (int) (byte) 1, (int) '#');
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "-", "usage: ", options21, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.defaultLeftPad = 100;
        helpFormatter12.setSyntaxPrefix("--");
        helpFormatter12.setOptPrefix("hi!");
        helpFormatter12.setNewLine("usage: ");
        helpFormatter12.setLeftPadding(74);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        helpFormatter24.setLongOptPrefix("");
        int int31 = helpFormatter24.findWrapPos("-", (int) '#', 1);
        helpFormatter24.defaultOptPrefix = "--";
        java.lang.String str34 = helpFormatter24.defaultArgName;
        helpFormatter24.setNewLine("\n");
        helpFormatter24.defaultSyntaxPrefix = "-";
        helpFormatter24.defaultLeftPad = (byte) 10;
        int int41 = helpFormatter24.defaultWidth;
        java.util.Comparator comparator42 = helpFormatter24.getOptionComparator();
        helpFormatter12.optionComparator = comparator42;
        helpFormatter0.setOptionComparator(comparator42);
        helpFormatter0.setLongOptPrefix(" ");
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 74 + "'", int41 == 74);
        org.junit.Assert.assertNotNull(comparator42);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        int int17 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((-1));
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        int int22 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 0, (int) (short) -1, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.defaultDescPad = (byte) -1;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "usage:";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("-");
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "                                                                                                 ", "usage: ", options10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator7 = helpFormatter6.optionComparator;
        helpFormatter0.optionComparator = comparator7;
        java.lang.Class<?> wildcardClass9 = comparator7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int17 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 10, "          ", "usage:", options14, (int) (short) 0, 10, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setLongOptPrefix("arg");
        java.util.Comparator comparator8 = helpFormatter0.getOptionComparator();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) (short) -1, options11, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setWidth((int) '4');
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str13 = helpFormatter0.rtrim("                                                                          ");
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 0, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str27 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = (short) 1;
        helpFormatter0.setDescPadding(3);
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "                                                    ", "hi!", options35, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "\n";
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, (int) (byte) -1, options20, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.util.Comparator comparator15 = helpFormatter0.optionComparator;
        java.lang.String str16 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = " ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLongOptPrefix("--");
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) '#', "   ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = '4';
        int int11 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str14 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("--");
        helpFormatter0.setSyntaxPrefix("usage: ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.setNewLine("                                   ");
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 3, "hi!", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "          ", options13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.createPadding((int) 'a');
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "\n";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 3, "\n", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.setArgName("                                   ");
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "                                                    ", options12, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, (int) (short) 10, "                                                    ", "", options16, (int) (short) -1, 0, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter13.optionComparator = comparator16;
        helpFormatter13.setDescPadding((-1));
        java.util.Comparator comparator20 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator20;
        helpFormatter0.defaultWidth = (short) 1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "-", options10, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth((int) ' ');
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) (byte) 1, "                                                                                                    ", "hi!", options18, (int) (byte) 100, 52, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "\n", "                                                    ", options14, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, (int) (byte) 1, options17, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        int int6 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.setArgName("-");
        int int17 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, (int) (short) 1, (int) ' ', "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            int int17 = helpFormatter0.findWrapPos("                                                                          ", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "--", options12, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "";
        java.lang.String str20 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getWidth();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, (-1), options10, (int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str17 = helpFormatter0.createPadding((int) (byte) 100);
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 10, options20, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 10;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 0, options14, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.defaultArgName = "          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, (int) '#', options10, (int) (byte) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "                                                    ", options14, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("usage: ");
        int int6 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultArgName = "                                                                          ";
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, 0, (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        java.lang.String str25 = helpFormatter0.getArgName();
        int int26 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setArgName("hi!");
        java.io.PrintWriter printWriter33 = null;
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter33, 0, options35, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setDescPadding((int) (short) 0);
        int int14 = helpFormatter0.findWrapPos("--", (int) (byte) 10, (int) (byte) 100);
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 0, "                                                                          ", "                                                                                                 ", options11, (-1), (int) (byte) 100, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "--";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        int int9 = helpFormatter0.findWrapPos("\n", 74, (int) 'a');
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "usage: ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str27 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str28 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "usage: " + "'", str27, "usage: ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = 3;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (int) (short) 100, options13, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.setDescPadding(100);
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "usage:", options22, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, (int) (byte) 0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("usage: ");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        int int13 = helpFormatter0.findWrapPos(" ", (int) (short) 1, (int) (short) 10);
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.Class<?> wildcardClass16 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("\n");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.setWidth((int) (byte) 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.util.Comparator comparator3 = helpFormatter0.optionComparator;
        java.lang.Class<?> wildcardClass4 = comparator3.getClass();
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = null;
        helpFormatter0.setOptionComparator(comparator12);
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (short) 0, "usage:", "   ", options14, (int) (short) 10, 3, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter13.optionComparator = comparator16;
        helpFormatter13.setDescPadding((-1));
        java.util.Comparator comparator20 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator20;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter22.setLongOptPrefix("");
        int int29 = helpFormatter22.findWrapPos("-", (int) (short) 10, 74);
        int int30 = helpFormatter22.getDescPadding();
        helpFormatter22.setLongOptPrefix("hi!");
        helpFormatter22.defaultNewLine = "";
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator36 = helpFormatter35.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter37 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator38 = helpFormatter37.optionComparator;
        helpFormatter35.optionComparator = comparator38;
        helpFormatter35.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter42 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator43 = helpFormatter42.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter44 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator45 = helpFormatter44.optionComparator;
        helpFormatter42.optionComparator = comparator45;
        helpFormatter35.setOptionComparator(comparator45);
        org.apache.commons.cli.HelpFormatter helpFormatter48 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator49 = helpFormatter48.optionComparator;
        java.util.Comparator comparator50 = helpFormatter48.getOptionComparator();
        helpFormatter35.optionComparator = comparator50;
        helpFormatter22.optionComparator = comparator50;
        helpFormatter0.optionComparator = comparator50;
        java.io.PrintWriter printWriter54 = null;
        org.apache.commons.cli.Options options57 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter54, (int) (byte) 1, "hi!", options57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertNotNull(comparator43);
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertNotNull(comparator49);
        org.junit.Assert.assertNotNull(comparator50);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultOptPrefix = "hi!";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, (int) '#', options8, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int21 = helpFormatter0.defaultLeftPad;
        int int22 = helpFormatter0.getLeftPadding();
        helpFormatter0.setSyntaxPrefix("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int15 = helpFormatter0.defaultWidth;
        int int16 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultArgName = "";
        helpFormatter0.setSyntaxPrefix("          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        java.lang.String str18 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter22.defaultLeftPad = 100;
        helpFormatter22.setSyntaxPrefix("--");
        helpFormatter22.defaultSyntaxPrefix = "hi!";
        helpFormatter22.setLongOptPrefix("arg");
        helpFormatter22.setSyntaxPrefix(" ");
        java.util.Comparator comparator34 = helpFormatter22.optionComparator;
        helpFormatter0.setOptionComparator(comparator34);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertNotNull(comparator34);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter11.optionComparator = comparator14;
        int int16 = helpFormatter11.defaultWidth;
        helpFormatter11.setSyntaxPrefix("");
        helpFormatter11.setSyntaxPrefix("hi!");
        java.lang.String str21 = helpFormatter11.defaultOptPrefix;
        int int22 = helpFormatter11.defaultLeftPad;
        java.util.Comparator comparator23 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator23);
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter25, (-1), options27, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultDescPad = (short) 100;
        java.lang.String str8 = helpFormatter0.getNewLine();
        int int9 = helpFormatter0.defaultWidth;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, (int) (short) 100, options12, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 35, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 74, "          ", "                                                                          ", options21, 74, (int) (byte) 10, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.defaultLeftPad = (short) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        helpFormatter7.defaultLeftPad = 100;
        helpFormatter7.setSyntaxPrefix("--");
        int int13 = helpFormatter7.defaultWidth;
        helpFormatter7.setArgName("--");
        java.util.Comparator comparator16 = helpFormatter7.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator16);
        java.lang.Class<?> wildcardClass18 = comparator16.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.defaultDescPad = '#';
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "                                                                          ", "\n", options16, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        int int13 = helpFormatter0.findWrapPos(" ", (int) (short) 1, (int) (short) 10);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        java.lang.String str17 = helpFormatter0.rtrim("                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        java.lang.String str18 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) (short) -1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.setSyntaxPrefix("arg");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        helpFormatter10.defaultLeftPad = 0;
        java.lang.String str17 = helpFormatter10.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter10.defaultLongOptPrefix;
        helpFormatter10.setLongOptPrefix("--");
        java.util.Comparator comparator21 = helpFormatter10.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.getNewLine();
        java.lang.String str24 = helpFormatter0.getOptPrefix();
        java.lang.String str25 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = helpFormatter0.renderWrappedText(stringBuffer26, (int) (short) 0, 1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, (int) (short) 100, options14, 3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.rtrim("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((-1));
        helpFormatter0.setLeftPadding(0);
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        helpFormatter10.defaultLongOptPrefix = "arg";
        int int17 = helpFormatter10.defaultWidth;
        java.lang.String str18 = helpFormatter10.getSyntaxPrefix();
        helpFormatter10.setArgName("");
        java.lang.String str21 = helpFormatter10.defaultNewLine;
        java.util.Comparator comparator22 = helpFormatter10.getOptionComparator();
        helpFormatter0.optionComparator = comparator22;
        int int24 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("usage: ");
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, "arg", "-", options30, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.defaultNewLine = " ";
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str14 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("hi!");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        int int10 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (byte) -1, "", "\n", options15, (int) 'a', (int) '#', "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter13.optionComparator = comparator16;
        int int18 = helpFormatter13.defaultWidth;
        helpFormatter13.setNewLine("arg");
        helpFormatter13.setLongOptPrefix("hi!");
        helpFormatter13.setLongOptPrefix("                                                                                                    ");
        int int25 = helpFormatter13.defaultDescPad;
        java.util.Comparator comparator26 = helpFormatter13.optionComparator;
        helpFormatter0.setOptionComparator(comparator26);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (byte) 0, "                                                    ", "                                                                                                 ", options14, 10, 100, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("");
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter12.optionComparator = comparator15;
        helpFormatter12.defaultLongOptPrefix = "arg";
        helpFormatter12.setSyntaxPrefix("                                                                                                    ");
        java.util.Comparator comparator21 = helpFormatter12.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.getOptPrefix();
        java.lang.String str24 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter25, (int) (short) 100, options27, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = " ";
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        helpFormatter10.defaultLeftPad = 100;
        helpFormatter10.setSyntaxPrefix("hi!");
        int int16 = helpFormatter10.getWidth();
        java.lang.String str17 = helpFormatter10.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter10.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        helpFormatter19.optionComparator = comparator22;
        helpFormatter10.setOptionComparator(comparator22);
        helpFormatter0.setOptionComparator(comparator22);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultDescPad = 0;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                    ", options14, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.createPadding((int) (short) 1);
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, "hi!", "--", options17, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str6 = helpFormatter0.rtrim("usage: ");
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, (int) (byte) 100, 10, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage:" + "'", str6, "usage:");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator8 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) (byte) 1, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        int int17 = helpFormatter0.defaultWidth;
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter20, 100, 97, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                   ";
        helpFormatter0.setNewLine("                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 97, "", " ", options15, (int) '#', (int) (byte) -1, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, (int) (byte) 10, (int) (byte) 10, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "usage: ";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 'a';
        helpFormatter0.defaultNewLine = "usage:";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, (int) (byte) 100, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter9.setOptionComparator(comparator19);
        helpFormatter0.setOptionComparator(comparator19);
        helpFormatter0.defaultLeftPad = (-1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter9.defaultLeftPad = 0;
        java.lang.String str16 = helpFormatter9.defaultLongOptPrefix;
        java.lang.String str17 = helpFormatter9.defaultLongOptPrefix;
        helpFormatter9.setLongOptPrefix("--");
        java.util.Comparator comparator20 = helpFormatter9.getOptionComparator();
        helpFormatter0.optionComparator = comparator20;
        int int22 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.rtrim("                                                                                                 ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultArgName = "          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 35, (int) (short) 10);
        helpFormatter0.defaultNewLine = "--";
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        int int21 = helpFormatter0.findWrapPos("                                                                                                 ", (int) '#', 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setArgName("                                                                                                    ");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 3, "                                                                          ", "", options17, (int) (byte) 1, 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = (-1);
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, (int) (short) 0, options13, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int17 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.setLeftPadding((int) 'a');
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) (short) -1, options16, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        helpFormatter0.setNewLine("                                                                          ");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.defaultNewLine = "usage: ";
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.defaultLeftPad = (short) 0;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter15.setLongOptPrefix("");
        int int22 = helpFormatter15.findWrapPos("-", (int) '#', 1);
        helpFormatter15.defaultOptPrefix = "--";
        int int25 = helpFormatter15.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter26.defaultLeftPad = 100;
        helpFormatter26.setOptPrefix("");
        helpFormatter26.setOptPrefix("usage: ");
        helpFormatter26.defaultNewLine = "hi!";
        helpFormatter26.defaultNewLine = "hi!";
        java.util.Comparator comparator38 = helpFormatter26.getOptionComparator();
        helpFormatter15.setOptionComparator(comparator38);
        helpFormatter0.optionComparator = comparator38;
        java.io.PrintWriter printWriter41 = null;
        org.apache.commons.cli.Options options45 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter41, (int) (short) 10, "                                                                                                    ", "usage:", options45, 1, 74, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.setLongOptPrefix("");
        int int15 = helpFormatter8.findWrapPos("-", (int) '#', 1);
        int int16 = helpFormatter8.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter17.optionComparator = comparator20;
        helpFormatter17.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter24.optionComparator = comparator27;
        helpFormatter17.setOptionComparator(comparator27);
        helpFormatter8.setOptionComparator(comparator27);
        java.lang.String str31 = helpFormatter8.defaultLongOptPrefix;
        helpFormatter8.defaultLeftPad = (short) 100;
        java.util.Comparator comparator34 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator34;
        int int36 = helpFormatter0.getLeftPadding();
        int int37 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass38 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.setLeftPadding(0);
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = " ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        int int15 = helpFormatter10.defaultWidth;
        helpFormatter10.setSyntaxPrefix("");
        helpFormatter10.setSyntaxPrefix("hi!");
        java.lang.String str20 = helpFormatter10.defaultOptPrefix;
        int int21 = helpFormatter10.defaultLeftPad;
        java.util.Comparator comparator22 = null;
        helpFormatter10.setOptionComparator(comparator22);
        java.util.Comparator comparator24 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator24);
        java.lang.String str26 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str28 = helpFormatter0.rtrim("usage:");
        java.lang.String str29 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "\n", "usage:", options33, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage: " + "'", str26, "usage: ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage:" + "'", str28, "usage:");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.defaultLeftPad = 74;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("arg");
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.getNewLine();
        int int16 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix(" ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setArgName("                                                                                                 ");
        int int5 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, (int) (byte) 1, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("--");
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) (short) 1, "          ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        int int9 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str12 = helpFormatter0.createPadding(100);
        java.lang.String str14 = helpFormatter0.rtrim("-");
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultOptPrefix = "                                   ";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "-", " ", options17, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }
}

