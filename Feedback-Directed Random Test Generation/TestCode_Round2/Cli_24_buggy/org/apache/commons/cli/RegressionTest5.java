package org.apache.commons.cli;

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
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.defaultLeftPad = 100;
        helpFormatter8.setSyntaxPrefix("hi!");
        int int14 = helpFormatter8.getWidth();
        java.lang.String str15 = helpFormatter8.defaultLongOptPrefix;
        java.lang.String str16 = helpFormatter8.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter17.optionComparator = comparator20;
        helpFormatter8.setOptionComparator(comparator20);
        helpFormatter0.setOptionComparator(comparator20);
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter24, (int) (short) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.setSyntaxPrefix("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter17.optionComparator = comparator20;
        helpFormatter17.defaultLongOptPrefix = "arg";
        java.lang.String str24 = helpFormatter17.defaultLongOptPrefix;
        helpFormatter17.defaultNewLine = "arg";
        java.lang.String str27 = helpFormatter17.defaultLongOptPrefix;
        int int28 = helpFormatter17.defaultDescPad;
        helpFormatter17.setLongOptPrefix("arg");
        java.util.Comparator comparator31 = helpFormatter17.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator31);
        helpFormatter0.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator36 = helpFormatter35.optionComparator;
        helpFormatter35.setLongOptPrefix("");
        int int42 = helpFormatter35.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str43 = helpFormatter35.defaultOptPrefix;
        helpFormatter35.setDescPadding(1);
        java.lang.String str46 = helpFormatter35.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter47 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator48 = helpFormatter47.optionComparator;
        helpFormatter47.defaultLeftPad = 100;
        helpFormatter47.setOptPrefix("");
        int int53 = helpFormatter47.defaultWidth;
        int int54 = helpFormatter47.getDescPadding();
        java.util.Comparator comparator55 = helpFormatter47.optionComparator;
        helpFormatter35.optionComparator = comparator55;
        helpFormatter0.optionComparator = comparator55;
        org.apache.commons.cli.Options options59 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options59, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "usage: " + "'", str46, "usage: ");
        org.junit.Assert.assertNotNull(comparator48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 74 + "'", int53 == 74);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(comparator55);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, 10, "hi!");
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
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("usage: ");
        int int13 = helpFormatter0.defaultLeftPad;
        int int17 = helpFormatter0.findWrapPos("-", (int) (short) 100, (int) (short) 1);
        helpFormatter0.defaultArgName = "hi!";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        int int36 = helpFormatter0.getDescPadding();
        java.lang.String str37 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter38 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter38, (int) (byte) 100, "                                                                                                    ");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "usage: " + "'", str37, "usage: ");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setDescPadding((int) (short) 10);
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        int int32 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("\n");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
            helpFormatter0.printWrapped(printWriter28, 35, "                                   ");
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
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        java.lang.String str30 = helpFormatter0.getOptPrefix();
        helpFormatter0.setArgName("");
        int int33 = helpFormatter0.getWidth();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.lang.String str18 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "", "                                                                                                    ", options22, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setDescPadding((int) 'a');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth((-1));
        helpFormatter0.setDescPadding(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.defaultNewLine = "arg";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "                                ", "", options17, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                   ";
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        helpFormatter0.setOptPrefix("--");
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.getDescPadding();
        helpFormatter0.setLeftPadding((int) 'a');
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "                                                    ", options8, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 3;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = '4';
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str13 = helpFormatter0.rtrim("");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.defaultDescPad = '#';
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter13.defaultSyntaxPrefix = "--";
        helpFormatter13.setNewLine("");
        java.lang.String str19 = helpFormatter13.getNewLine();
        helpFormatter13.defaultWidth = (short) -1;
        java.util.Comparator comparator22 = helpFormatter13.optionComparator;
        helpFormatter0.optionComparator = comparator22;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "                                ";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 0);
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 74, "--", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int18 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter19, 2, options21, 20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("                                   ", (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str14 = helpFormatter0.rtrim("                                   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.setWidth(10);
        int int22 = helpFormatter0.getLeftPadding();
        int int26 = helpFormatter0.findWrapPos("hi!", (int) ' ', 3);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        helpFormatter0.defaultNewLine = "usage: ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.defaultLeftPad = 3;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 0;
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.getNewLine();
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultDescPad = 2;
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, (int) (byte) 10, (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        java.lang.String str16 = helpFormatter0.rtrim("hi!");
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = (short) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setDescPadding((int) (short) 10);
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = (short) 100;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "                                ", options12, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        int int16 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(1);
        int int19 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.findWrapPos(" ", 100, 100);
        int int12 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 11, "\n", "                                                    ", options17, (int) (short) 100, 35, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        int int18 = helpFormatter0.getDescPadding();
        java.lang.String str19 = helpFormatter0.defaultArgName;
        java.lang.String str20 = helpFormatter0.getNewLine();
        helpFormatter0.setArgName(" ");
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", " ", options25, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "--";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        org.apache.commons.cli.Options options36 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter34, (int) (byte) 1, options36, 52, (int) (byte) 100);
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
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int16 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter17.defaultNewLine = "hi!";
        java.lang.String str21 = helpFormatter17.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter22.defaultDescPad = '#';
        java.lang.String str25 = helpFormatter22.getSyntaxPrefix();
        java.util.Comparator comparator26 = helpFormatter22.optionComparator;
        helpFormatter17.optionComparator = comparator26;
        helpFormatter0.optionComparator = comparator26;
        java.lang.String str29 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        int int9 = helpFormatter0.findWrapPos("\n", 74, (int) 'a');
        helpFormatter0.defaultLeftPad = 0;
        int int12 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "-", options15, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        java.lang.String str12 = helpFormatter0.rtrim("                                   ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                    " + "'", str11, "                                                                                                    ");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        int int9 = helpFormatter0.findWrapPos("\n", 74, (int) 'a');
        helpFormatter0.defaultLeftPad = 0;
        int int12 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth(97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("--");
        int int10 = helpFormatter0.getDescPadding();
        helpFormatter0.setWidth((int) (short) 0);
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int18 = helpFormatter0.findWrapPos("--", 1, 2);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "   ", "usage:", options20, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str10 = helpFormatter0.rtrim("--");
        helpFormatter0.defaultNewLine = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("");
        int int14 = helpFormatter0.findWrapPos("   ", 52, (int) (byte) -1);
        helpFormatter0.setArgName("\n");
        helpFormatter0.setDescPadding(3);
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding((int) (short) 1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "   ", options16, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        int int45 = helpFormatter0.defaultWidth;
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 74 + "'", int45 == 74);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setNewLine("          ");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        helpFormatter13.defaultLeftPad = 100;
        helpFormatter13.setSyntaxPrefix("hi!");
        int int19 = helpFormatter13.getWidth();
        java.lang.String str20 = helpFormatter13.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter13.defaultSyntaxPrefix;
        java.lang.String str22 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator23 = helpFormatter13.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        java.lang.String str26 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str27 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                " + "'", str26, "                                ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 1, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultSyntaxPrefix = " ";
        java.lang.String str8 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        int int9 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                ", options12, "--", true);
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        helpFormatter0.defaultOptPrefix = "          ";
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
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 3;
        int int13 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        int int9 = helpFormatter0.defaultWidth;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 100;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", " ", options17, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.getWidth();
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 35;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) (short) -1);
        int int15 = helpFormatter0.defaultDescPad;
        int int16 = helpFormatter0.defaultLeftPad;
        int int17 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (short) 100;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setOptPrefix("                                                                                                    ");
        helpFormatter0.defaultWidth = 20;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter8.defaultDescPad = '#';
        helpFormatter8.setLeftPadding((int) (short) -1);
        java.util.Comparator comparator13 = helpFormatter8.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator13);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "\n";
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setOptPrefix("                                ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "                                ", options14, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 100;
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str14 = helpFormatter0.rtrim("          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setOptPrefix("                                                                          ");
        helpFormatter0.setNewLine("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setArgName("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.setWidth(11);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("                                   ", (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 10;
        int int15 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        int int13 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "                                                                                                    ", " ", options17, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        helpFormatter0.setArgName("");
        int int14 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, (int) (short) 0, options20, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultLongOptPrefix = "usage:";
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix("-");
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
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.setOptPrefix("usage: ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) '#');
        helpFormatter0.setLongOptPrefix(" ");
        int int23 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        helpFormatter0.setOptPrefix("");
        java.lang.String str30 = helpFormatter0.getSyntaxPrefix();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter14.setLongOptPrefix("");
        int int21 = helpFormatter14.findWrapPos("-", (int) '#', 1);
        helpFormatter14.defaultOptPrefix = "--";
        java.lang.String str24 = helpFormatter14.defaultArgName;
        helpFormatter14.setNewLine("\n");
        helpFormatter14.defaultSyntaxPrefix = "-";
        int int29 = helpFormatter14.defaultWidth;
        int int33 = helpFormatter14.findWrapPos("arg", (int) (short) 100, 74);
        java.util.Comparator comparator34 = helpFormatter14.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator34);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 74 + "'", int29 == 74);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(comparator34);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        helpFormatter0.defaultDescPad = 3;
        java.lang.String str33 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "                                   ", "usage: ", options37, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "usage: " + "'", str33, "usage: ");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(32);
        helpFormatter0.setDescPadding(11);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        int int20 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = (byte) 0;
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = helpFormatter0.renderOptions(stringBuffer23, 0, options25, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 0, options13, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultWidth = 32;
        int int11 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setDescPadding(35);
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding(74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.setOptPrefix("arg");
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setNewLine("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        int int10 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.setWidth((int) ' ');
        helpFormatter0.defaultLongOptPrefix = " ";
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) (short) 1, (int) (short) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("                                   ", (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        java.lang.String str19 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        helpFormatter20.setLongOptPrefix("");
        int int27 = helpFormatter20.findWrapPos("-", (int) '#', 1);
        helpFormatter20.defaultOptPrefix = "--";
        java.lang.String str30 = helpFormatter20.defaultArgName;
        helpFormatter20.setNewLine("\n");
        helpFormatter20.defaultSyntaxPrefix = "-";
        helpFormatter20.defaultLeftPad = (byte) 10;
        int int37 = helpFormatter20.defaultWidth;
        java.util.Comparator comparator38 = helpFormatter20.getOptionComparator();
        helpFormatter0.optionComparator = comparator38;
        org.apache.commons.cli.Options options41 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options41, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 74 + "'", int37 == 74);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.defaultDescPad = (byte) -1;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter13.defaultLeftPad = 100;
        helpFormatter13.setOptPrefix("");
        helpFormatter13.setOptPrefix("usage: ");
        helpFormatter13.defaultNewLine = "hi!";
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        helpFormatter23.defaultLeftPad = 100;
        helpFormatter23.setSyntaxPrefix("hi!");
        helpFormatter23.defaultArgName = "-";
        int int31 = helpFormatter23.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter32 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator33 = helpFormatter32.optionComparator;
        helpFormatter32.setLongOptPrefix("");
        int int39 = helpFormatter32.findWrapPos("-", (int) '#', 1);
        helpFormatter32.defaultOptPrefix = "--";
        int int42 = helpFormatter32.getDescPadding();
        java.util.Comparator comparator43 = helpFormatter32.getOptionComparator();
        helpFormatter23.optionComparator = comparator43;
        helpFormatter13.setOptionComparator(comparator43);
        helpFormatter0.optionComparator = comparator43;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(comparator33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(comparator43);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        helpFormatter0.defaultDescPad = (byte) 1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.defaultLeftPad = 100;
        helpFormatter12.setSyntaxPrefix("--");
        helpFormatter12.setOptPrefix("hi!");
        helpFormatter12.setNewLine("usage: ");
        helpFormatter12.setLeftPadding(74);
        java.lang.String str24 = helpFormatter12.defaultNewLine;
        java.util.Comparator comparator25 = helpFormatter12.getOptionComparator();
        helpFormatter0.optionComparator = comparator25;
        java.util.Comparator comparator27 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("usage:");
        java.lang.String str30 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth((-1));
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.setLeftPadding(74);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultNewLine = "";
        java.lang.String str14 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultNewLine = "arg";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = 2;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.setDescPadding(11);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str12 = helpFormatter0.getArgName();
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) '4', options16, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        helpFormatter0.setNewLine("");
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        helpFormatter19.optionComparator = comparator22;
        helpFormatter19.defaultLongOptPrefix = "arg";
        helpFormatter19.setSyntaxPrefix("                                                                                                    ");
        java.util.Comparator comparator28 = helpFormatter19.getOptionComparator();
        helpFormatter0.optionComparator = comparator28;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertNotNull(comparator28);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding(74);
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str11 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("          ");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 74, (int) ' ', "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        int int10 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) -1);
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setDescPadding(100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, 97, (int) (byte) 10, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        int int15 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "arg", "                                                                                                    ", options19, "   ");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultWidth = 10;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter8.defaultDescPad = '#';
        java.lang.String str11 = helpFormatter8.getSyntaxPrefix();
        helpFormatter8.defaultDescPad = (short) 1;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter8.optionComparator = comparator15;
        helpFormatter0.optionComparator = comparator15;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("\n");
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, 52, (int) (byte) 10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        int int20 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        java.util.Comparator comparator34 = helpFormatter0.optionComparator;
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
        org.junit.Assert.assertNotNull(comparator34);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) (byte) 10, "                                                                                                    ", "-", options18, (int) (byte) -1, 3, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 0, 2, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        java.lang.String str34 = helpFormatter0.getNewLine();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n" + "'", str34, "\n");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "\n";
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        helpFormatter0.defaultDescPad = 1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "   ";
        java.util.Comparator comparator6 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(comparator6);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
        helpFormatter0.setWidth(1);
        int int32 = helpFormatter0.getDescPadding();
        int int33 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter34 = null;
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter34, 1, "", options37);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 52, 100, "usage:");
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
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultWidth = 32;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        int int32 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options36 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "-", " ", options36, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.setWidth((int) (byte) 10);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str7 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "                                                                          ", options12, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (byte) 10);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        java.lang.String str27 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str28 = helpFormatter0.defaultSyntaxPrefix;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "usage: " + "'", str27, "usage: ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 3;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "-";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        java.lang.String str15 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding(52);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = 74;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.setArgName("                                                    ");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 100, options15, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = " ";
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.rtrim("                                                    ");
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str15 = helpFormatter0.getNewLine();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        java.lang.String str9 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (short) -1, "usage: ", "                                ", options14, (int) (short) 10, (int) ' ', "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.defaultOptPrefix = "";
        int int16 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = (short) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(10);
        int int16 = helpFormatter0.findWrapPos(" ", 32, (int) (short) 0);
        java.lang.String str18 = helpFormatter0.rtrim("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.defaultWidth;
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        int int17 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = " ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(74);
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setLongOptPrefix("                                ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                   " + "'", str13, "                                   ");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultWidth = 10;
        java.util.Comparator comparator6 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator6);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setDescPadding(97);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        helpFormatter0.setOptPrefix("arg");
        java.util.Comparator comparator27 = null;
        helpFormatter0.optionComparator = comparator27;
        int int29 = helpFormatter0.defaultDescPad;
        int int30 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) '4');
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        int int12 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter22.setLongOptPrefix("");
        int int29 = helpFormatter22.findWrapPos("-", (int) '#', 1);
        int int30 = helpFormatter22.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator32 = helpFormatter31.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator34 = helpFormatter33.optionComparator;
        helpFormatter31.optionComparator = comparator34;
        helpFormatter31.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter38 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator39 = helpFormatter38.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator41 = helpFormatter40.optionComparator;
        helpFormatter38.optionComparator = comparator41;
        helpFormatter31.setOptionComparator(comparator41);
        helpFormatter22.setOptionComparator(comparator41);
        helpFormatter0.optionComparator = comparator41;
        java.util.Comparator comparator46 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter47 = null;
        org.apache.commons.cli.Options options51 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter47, 10, "arg", "                                                                                                    ", options51, 0, 52, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 74 + "'", int30 == 74);
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertNotNull(comparator39);
        org.junit.Assert.assertNotNull(comparator41);
        org.junit.Assert.assertNotNull(comparator46);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str4 = helpFormatter0.rtrim("                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator7 = helpFormatter6.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter6.optionComparator = comparator9;
        int int11 = helpFormatter6.defaultWidth;
        helpFormatter6.setNewLine("arg");
        helpFormatter6.setDescPadding((int) (byte) -1);
        helpFormatter6.setNewLine("usage: ");
        java.lang.String str18 = helpFormatter6.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        helpFormatter19.optionComparator = comparator22;
        helpFormatter19.setDescPadding((-1));
        java.util.Comparator comparator26 = helpFormatter19.getOptionComparator();
        helpFormatter6.optionComparator = comparator26;
        helpFormatter0.setOptionComparator(comparator26);
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str31 = helpFormatter0.getOptPrefix();
        java.lang.String str32 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "usage: " + "'", str32, "usage: ");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        int int9 = helpFormatter0.defaultWidth;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int14 = helpFormatter0.findWrapPos("usage:", (int) 'a', 10);
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "usage:", "usage:", options18, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultOptPrefix = "                                                    ";
        int int17 = helpFormatter0.getLeftPadding();
        int int18 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = (byte) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        helpFormatter0.defaultWidth = 52;
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str19 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, 0, 11, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.setWidth(10);
        helpFormatter0.defaultDescPad = (byte) 0;
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter24, 0, "hi!", "   ", options28, 2, 20, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.setLongOptPrefix("          ");
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "                                   ", options37, "                                   ");
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.findWrapPos("", (int) (short) 100, 2);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.defaultSyntaxPrefix = "   ";
        java.lang.String str17 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setArgName("                                                                          ");
        int int20 = helpFormatter0.findWrapPos("usage: ", (int) 'a', (int) (byte) 1);
        int int21 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter7.optionComparator = comparator10;
        int int12 = helpFormatter7.defaultWidth;
        helpFormatter7.setNewLine("arg");
        helpFormatter7.setLongOptPrefix("hi!");
        helpFormatter7.setLongOptPrefix("                                                                                                    ");
        java.lang.String str19 = helpFormatter7.getOptPrefix();
        java.lang.String str20 = helpFormatter7.defaultOptPrefix;
        helpFormatter7.defaultSyntaxPrefix = "arg";
        int int23 = helpFormatter7.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter24.defaultNewLine = "hi!";
        java.lang.String str28 = helpFormatter24.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter29.defaultDescPad = '#';
        java.lang.String str32 = helpFormatter29.getSyntaxPrefix();
        java.util.Comparator comparator33 = helpFormatter29.optionComparator;
        helpFormatter24.optionComparator = comparator33;
        helpFormatter7.optionComparator = comparator33;
        helpFormatter0.setOptionComparator(comparator33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "usage: " + "'", str32, "usage: ");
        org.junit.Assert.assertNotNull(comparator33);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setDescPadding((int) (short) 0);
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                    " + "'", str11, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        helpFormatter13.defaultLeftPad = 100;
        helpFormatter13.setSyntaxPrefix("hi!");
        int int19 = helpFormatter13.getWidth();
        java.lang.String str20 = helpFormatter13.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter13.defaultSyntaxPrefix;
        java.lang.String str22 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator23 = helpFormatter13.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        java.util.Comparator comparator25 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        helpFormatter0.setLeftPadding((int) ' ');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultWidth = 10;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator8 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultDescPad = 10;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(74);
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator26 = helpFormatter25.optionComparator;
        helpFormatter23.optionComparator = comparator26;
        int int28 = helpFormatter23.defaultWidth;
        helpFormatter23.setNewLine("arg");
        helpFormatter23.setDescPadding((int) (byte) -1);
        helpFormatter23.setNewLine("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator36 = helpFormatter35.optionComparator;
        helpFormatter35.setLongOptPrefix("");
        java.util.Comparator comparator39 = helpFormatter35.getOptionComparator();
        helpFormatter23.optionComparator = comparator39;
        helpFormatter0.setOptionComparator(comparator39);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 74 + "'", int28 == 74);
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        helpFormatter0.setOptPrefix("arg");
        int int27 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options29);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.createPadding((int) (short) 1);
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str21 = helpFormatter0.createPadding((int) ' ');
        helpFormatter0.setDescPadding(32);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                " + "'", str21, "                                ");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        int int25 = helpFormatter0.getWidth();
        int int26 = helpFormatter0.defaultLeftPad;
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (-1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.setLongOptPrefix("                                                    ");
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("");
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = (short) 10;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) (byte) 10, "-", "-", options19, (int) (short) -1, 74, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, (int) (byte) 10, "usage:", options18);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        int int14 = helpFormatter0.findWrapPos("", 35, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("-");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "-", options15, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str12 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultOptPrefix = "";
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        java.util.Comparator comparator19 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = 52;
        helpFormatter0.setSyntaxPrefix("-");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        java.util.Comparator comparator15 = null;
        helpFormatter0.setOptionComparator(comparator15);
        java.lang.String str18 = helpFormatter0.createPadding((int) '#');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                   " + "'", str18, "                                   ");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("arg");
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) (short) 0, "                                   ", "\n", options11, (int) (byte) 1, 11, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = 0;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter7, (int) (byte) 1, options9, (-1), 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.setSyntaxPrefix("                                                    ");
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter10.optionComparator = comparator13;
        int int15 = helpFormatter10.defaultWidth;
        helpFormatter10.setNewLine("arg");
        helpFormatter10.setLongOptPrefix("hi!");
        helpFormatter10.setLongOptPrefix("                                                                                                    ");
        java.lang.String str22 = helpFormatter10.getOptPrefix();
        java.util.Comparator comparator23 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator23);
        int int25 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        helpFormatter0.defaultWidth = 52;
        helpFormatter0.defaultArgName = "--";
        int int17 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.setDescPadding(97);
        helpFormatter0.defaultArgName = "                                                                          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultDescPad = (byte) 1;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        int int15 = helpFormatter0.getWidth();
        int int19 = helpFormatter0.findWrapPos("arg", 35, (int) (byte) 1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        helpFormatter0.defaultOptPrefix = "                                                    ";
        helpFormatter0.setArgName("");
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
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.defaultWidth = '4';
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        helpFormatter0.setNewLine("                                                                                                    ");
        int int17 = helpFormatter0.defaultWidth;
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, 0, (-1), "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        java.lang.String str18 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        helpFormatter20.defaultLeftPad = 100;
        helpFormatter20.setOptPrefix("");
        helpFormatter20.setOptPrefix("usage: ");
        helpFormatter20.defaultLeftPad = (-1);
        java.lang.String str30 = helpFormatter20.getOptPrefix();
        helpFormatter20.setWidth((int) (byte) 0);
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator34 = helpFormatter33.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator36 = helpFormatter35.optionComparator;
        helpFormatter33.optionComparator = comparator36;
        helpFormatter33.defaultLeftPad = 0;
        java.lang.String str40 = helpFormatter33.defaultLongOptPrefix;
        java.lang.String str41 = helpFormatter33.defaultLongOptPrefix;
        java.lang.String str42 = helpFormatter33.defaultArgName;
        java.util.Comparator comparator43 = helpFormatter33.getOptionComparator();
        helpFormatter20.setOptionComparator(comparator43);
        helpFormatter19.setOptionComparator(comparator43);
        helpFormatter19.setSyntaxPrefix("                                                                                                 ");
        org.apache.commons.cli.HelpFormatter helpFormatter48 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator49 = helpFormatter48.optionComparator;
        helpFormatter48.defaultLeftPad = 100;
        helpFormatter48.setSyntaxPrefix("--");
        helpFormatter48.setOptPrefix("-");
        helpFormatter48.setLongOptPrefix("arg");
        helpFormatter48.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter60 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator61 = helpFormatter60.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter62 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator63 = helpFormatter62.optionComparator;
        helpFormatter60.optionComparator = comparator63;
        int int65 = helpFormatter60.defaultWidth;
        helpFormatter60.setSyntaxPrefix("");
        helpFormatter60.setSyntaxPrefix("hi!");
        java.lang.String str70 = helpFormatter60.defaultOptPrefix;
        int int71 = helpFormatter60.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter72 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator73 = helpFormatter72.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter74 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator75 = helpFormatter74.optionComparator;
        helpFormatter72.optionComparator = comparator75;
        int int77 = helpFormatter72.defaultWidth;
        helpFormatter72.setSyntaxPrefix("");
        helpFormatter72.setSyntaxPrefix("hi!");
        java.lang.String str82 = helpFormatter72.defaultOptPrefix;
        int int83 = helpFormatter72.defaultLeftPad;
        java.util.Comparator comparator84 = null;
        helpFormatter72.setOptionComparator(comparator84);
        java.util.Comparator comparator86 = helpFormatter72.optionComparator;
        helpFormatter60.setOptionComparator(comparator86);
        helpFormatter48.setOptionComparator(comparator86);
        helpFormatter19.setOptionComparator(comparator86);
        helpFormatter0.optionComparator = comparator86;
        helpFormatter0.defaultOptPrefix = "hi!";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "--" + "'", str40, "--");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "--" + "'", str41, "--");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNotNull(comparator43);
        org.junit.Assert.assertNotNull(comparator49);
        org.junit.Assert.assertNotNull(comparator61);
        org.junit.Assert.assertNotNull(comparator63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 74 + "'", int65 == 74);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "-" + "'", str70, "-");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(comparator73);
        org.junit.Assert.assertNotNull(comparator75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 74 + "'", int77 == 74);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "-" + "'", str82, "-");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(comparator86);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        helpFormatter0.defaultWidth = (-1);
        int int29 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        helpFormatter0.setLongOptPrefix("   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = (-1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        helpFormatter0.setLeftPadding((int) '#');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = 10;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultWidth = 10;
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (short) -1, 35, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.rtrim(" ");
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        int int18 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "          ";
        helpFormatter0.setLongOptPrefix("usage: ");
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter18.setLongOptPrefix("");
        int int25 = helpFormatter18.findWrapPos("-", (int) '#', 1);
        int int26 = helpFormatter18.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator28 = helpFormatter27.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator30 = helpFormatter29.optionComparator;
        helpFormatter27.optionComparator = comparator30;
        helpFormatter27.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator35 = helpFormatter34.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter36 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator37 = helpFormatter36.optionComparator;
        helpFormatter34.optionComparator = comparator37;
        helpFormatter27.setOptionComparator(comparator37);
        helpFormatter18.setOptionComparator(comparator37);
        java.lang.String str41 = helpFormatter18.defaultLongOptPrefix;
        helpFormatter18.defaultLeftPad = (short) 100;
        java.util.Comparator comparator44 = helpFormatter18.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator44);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertNotNull(comparator37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(comparator44);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.setWidth(1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setArgName(" ");
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        int int7 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        int int13 = helpFormatter0.getWidth();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("");
        int int14 = helpFormatter0.findWrapPos("   ", 52, (int) (byte) -1);
        helpFormatter0.setArgName("\n");
        helpFormatter0.setDescPadding(3);
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter19.defaultLeftPad = 100;
        helpFormatter19.setOptPrefix("");
        int int25 = helpFormatter19.defaultWidth;
        int int26 = helpFormatter19.getLeftPadding();
        int int27 = helpFormatter19.defaultWidth;
        java.lang.String str28 = helpFormatter19.getOptPrefix();
        java.lang.String str29 = helpFormatter19.getOptPrefix();
        int int30 = helpFormatter19.defaultLeftPad;
        int int31 = helpFormatter19.defaultDescPad;
        java.util.Comparator comparator32 = helpFormatter19.optionComparator;
        helpFormatter0.optionComparator = comparator32;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.defaultSyntaxPrefix = "--";
        helpFormatter12.setNewLine("");
        helpFormatter12.setSyntaxPrefix("hi!");
        java.lang.String str21 = helpFormatter12.rtrim("-");
        helpFormatter12.defaultSyntaxPrefix = "-";
        java.lang.String str24 = helpFormatter12.getLongOptPrefix();
        java.util.Comparator comparator25 = helpFormatter12.optionComparator;
        helpFormatter0.setOptionComparator(comparator25);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "--" + "'", str24, "--");
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = 52;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        java.util.Comparator comparator15 = null;
        helpFormatter0.setOptionComparator(comparator15);
        helpFormatter0.defaultDescPad = 10;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        int int15 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 3, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "   ", "                                                                          ", options12, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str17 = helpFormatter0.getNewLine();
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setDescPadding((int) '#');
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 52, options15, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        helpFormatter0.setWidth(1);
        helpFormatter0.setWidth(0);
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.setArgName("\n");
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.setOptPrefix("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options14, false);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setDescPadding((int) (byte) 100);
        java.lang.String str17 = helpFormatter0.createPadding(35);
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                   " + "'", str17, "                                   ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.defaultDescPad = (byte) 100;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setWidth(1);
        java.util.Comparator comparator19 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, 74, options16, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setArgName("--");
        int int15 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.setDescPadding(2);
        helpFormatter0.setLongOptPrefix("                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = (byte) 0;
        int int15 = helpFormatter0.findWrapPos("--", (int) (byte) 10, (int) 'a');
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        java.lang.String str19 = helpFormatter0.getArgName();
        helpFormatter0.setArgName("arg");
        helpFormatter0.setDescPadding((int) (byte) 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = (byte) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter13.defaultLeftPad = 100;
        helpFormatter13.setSyntaxPrefix("hi!");
        int int19 = helpFormatter13.getWidth();
        java.lang.String str20 = helpFormatter13.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter13.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        helpFormatter22.optionComparator = comparator25;
        helpFormatter13.setOptionComparator(comparator25);
        helpFormatter0.optionComparator = comparator25;
        helpFormatter0.defaultDescPad = (short) 100;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str33 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.setLongOptPrefix(" ");
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 3, " ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.rtrim("");
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        helpFormatter0.setNewLine("\n");
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator28 = helpFormatter27.optionComparator;
        helpFormatter27.defaultSyntaxPrefix = "--";
        helpFormatter27.setNewLine("");
        helpFormatter27.setSyntaxPrefix("hi!");
        java.lang.String str36 = helpFormatter27.rtrim("-");
        java.lang.String str37 = helpFormatter27.getArgName();
        java.lang.String str38 = helpFormatter27.defaultSyntaxPrefix;
        java.util.Comparator comparator39 = helpFormatter27.optionComparator;
        java.util.Comparator comparator40 = helpFormatter27.optionComparator;
        helpFormatter0.optionComparator = comparator40;
        java.lang.String str42 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-" + "'", str36, "-");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "arg" + "'", str37, "arg");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(comparator39);
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        helpFormatter0.setLeftPadding(10);
        java.lang.String str27 = helpFormatter0.getLongOptPrefix();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "--", "\n", options29, "\n");
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
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        int int10 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "arg";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine("                                                                                                 ");
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.defaultSyntaxPrefix = "   ";
        int int17 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        java.lang.String str19 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = (byte) 0;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "                                                                                                 ", options14, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        java.util.Comparator comparator19 = null;
        helpFormatter0.optionComparator = comparator19;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        helpFormatter0.setNewLine("--");
        int int16 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, 100, "                                                                          ", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setDescPadding((int) (short) 0);
        int int14 = helpFormatter0.findWrapPos("--", (int) (byte) 10, (int) (byte) 100);
        java.lang.String str16 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "--";
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.setDescPadding(52);
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        helpFormatter0.setArgName("                                                                          ");
        java.lang.String str40 = helpFormatter0.defaultNewLine;
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\n" + "'", str40, "\n");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding(74);
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) (byte) -1, options15, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) '#', options15, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        helpFormatter10.defaultLeftPad = 100;
        helpFormatter10.setSyntaxPrefix("hi!");
        helpFormatter10.defaultArgName = "-";
        int int18 = helpFormatter10.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter19.setLongOptPrefix("");
        int int26 = helpFormatter19.findWrapPos("-", (int) '#', 1);
        helpFormatter19.defaultOptPrefix = "--";
        int int29 = helpFormatter19.getDescPadding();
        java.util.Comparator comparator30 = helpFormatter19.getOptionComparator();
        helpFormatter10.optionComparator = comparator30;
        helpFormatter0.setOptionComparator(comparator30);
        int int33 = helpFormatter0.getLeftPadding();
        java.lang.String str34 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator35 = helpFormatter0.getOptionComparator();
        int int36 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter26.setLongOptPrefix("");
        int int33 = helpFormatter26.findWrapPos("-", (int) '#', 1);
        helpFormatter26.defaultArgName = "hi!";
        helpFormatter26.setDescPadding((int) (byte) 1);
        java.lang.String str38 = helpFormatter26.defaultSyntaxPrefix;
        helpFormatter26.setDescPadding(100);
        java.lang.String str41 = helpFormatter26.getArgName();
        java.lang.String str42 = helpFormatter26.defaultNewLine;
        java.lang.String str43 = helpFormatter26.getArgName();
        helpFormatter26.setNewLine("                                   ");
        java.util.Comparator comparator46 = helpFormatter26.getOptionComparator();
        helpFormatter0.optionComparator = comparator46;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "usage: " + "'", str38, "usage: ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(comparator46);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 20, (int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        helpFormatter14.optionComparator = comparator17;
        int int19 = helpFormatter14.defaultWidth;
        helpFormatter14.setSyntaxPrefix("");
        helpFormatter14.setSyntaxPrefix("hi!");
        java.lang.String str24 = helpFormatter14.defaultOptPrefix;
        int int25 = helpFormatter14.defaultLeftPad;
        java.util.Comparator comparator26 = helpFormatter14.optionComparator;
        helpFormatter0.optionComparator = comparator26;
        java.lang.String str28 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str32 = helpFormatter0.rtrim("\n");
        helpFormatter0.setNewLine("                                                                          ");
        org.apache.commons.cli.Options options36 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, (int) (short) -1, options10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.rtrim(" ");
        helpFormatter0.setArgName("                                   ");
        java.lang.String str13 = helpFormatter0.createPadding(74);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                          " + "'", str13, "                                                                          ");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("   ");
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.rtrim("--");
        helpFormatter0.setLeftPadding((int) '4');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "          ";
        helpFormatter0.setDescPadding(2);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                                    ", options13, "          ");
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
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str12 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setOptPrefix("hi!");
        int int20 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) ' ', (int) (byte) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        int int16 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultDescPad = (short) -1;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        int int18 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options17, true);
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
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str19 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultDescPad = (short) 100;
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter9.setLongOptPrefix("");
        int int16 = helpFormatter9.findWrapPos("-", (int) '#', 1);
        helpFormatter9.defaultArgName = "hi!";
        helpFormatter9.setDescPadding((int) (byte) 1);
        java.lang.String str21 = helpFormatter9.defaultSyntaxPrefix;
        helpFormatter9.setDescPadding(100);
        java.lang.String str24 = helpFormatter9.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator26 = helpFormatter25.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator28 = helpFormatter27.optionComparator;
        helpFormatter25.optionComparator = comparator28;
        helpFormatter25.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter32 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator33 = helpFormatter32.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator35 = helpFormatter34.optionComparator;
        helpFormatter32.optionComparator = comparator35;
        helpFormatter25.setOptionComparator(comparator35);
        org.apache.commons.cli.HelpFormatter helpFormatter38 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator39 = helpFormatter38.optionComparator;
        java.util.Comparator comparator40 = helpFormatter38.getOptionComparator();
        helpFormatter25.optionComparator = comparator40;
        helpFormatter9.optionComparator = comparator40;
        java.util.Comparator comparator43 = helpFormatter9.optionComparator;
        helpFormatter0.setOptionComparator(comparator43);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertNotNull(comparator33);
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertNotNull(comparator39);
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertNotNull(comparator43);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        int int14 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        java.lang.String str17 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding((int) (byte) 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setArgName("                                                                          ");
        int int20 = helpFormatter0.findWrapPos("usage: ", (int) 'a', (int) (byte) 1);
        int int21 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator22 = helpFormatter0.getOptionComparator();
        java.lang.String str23 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultDescPad = ' ';
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        helpFormatter0.defaultWidth = ' ';
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        int int27 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(97);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = '4';
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "\n";
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setSyntaxPrefix("   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = helpFormatter0.createPadding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        int int13 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setArgName("-");
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, (int) (byte) 1, 97, "   ");
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultOptPrefix = "                                                    ";
        int int17 = helpFormatter0.getLeftPadding();
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 1);
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = " ";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.setArgName("usage: ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, (int) '4', "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        int int15 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        helpFormatter0.setNewLine("arg");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, (-1), "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.getWidth();
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("                                   ");
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
        org.apache.commons.cli.Options options58 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter54, 100, "arg", "   ", options58, 0, 10, "          ");
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
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        int int18 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str15 = helpFormatter0.rtrim("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        int int17 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultWidth = (byte) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setSyntaxPrefix("                                                    ");
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options11, false);
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
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.findWrapPos("hi!", (-1), 100);
        helpFormatter0.defaultWidth = (short) -1;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        helpFormatter10.setLongOptPrefix("");
        int int17 = helpFormatter10.findWrapPos("-", (int) '#', 1);
        helpFormatter10.defaultOptPrefix = "--";
        java.lang.String str20 = helpFormatter10.defaultArgName;
        java.util.Comparator comparator21 = helpFormatter10.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str24 = helpFormatter0.createPadding((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                    " + "'", str24, "                                                    ");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(74);
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.defaultDescPad = (byte) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine(" ");
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 52, " ", "                                                                                                    ", options20, 20, (int) (byte) 0, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(35);
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) (short) 1, "                                                    ", "-", options11, 2, (int) '4', "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Total width is less than the width of the argument and indent - no room for the description");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        java.util.Comparator comparator38 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator39 = helpFormatter0.optionComparator;
        java.lang.String str40 = helpFormatter0.defaultOptPrefix;
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
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertNotNull(comparator39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-" + "'", str40, "-");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setArgName("hi!");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str20 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        helpFormatter21.optionComparator = comparator24;
        helpFormatter21.defaultLeftPad = 0;
        java.lang.String str28 = helpFormatter21.defaultLongOptPrefix;
        helpFormatter21.setLeftPadding((int) '4');
        java.lang.String str31 = helpFormatter21.getSyntaxPrefix();
        int int35 = helpFormatter21.findWrapPos("", 35, (int) (short) 10);
        helpFormatter21.defaultDescPad = (byte) 0;
        java.lang.String str38 = helpFormatter21.defaultOptPrefix;
        java.lang.String str39 = helpFormatter21.getNewLine();
        helpFormatter21.setWidth((int) '#');
        helpFormatter21.setLongOptPrefix(" ");
        org.apache.commons.cli.HelpFormatter helpFormatter44 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator45 = helpFormatter44.optionComparator;
        helpFormatter44.setLongOptPrefix("");
        int int51 = helpFormatter44.findWrapPos("-", (int) '#', 1);
        helpFormatter44.defaultOptPrefix = "--";
        java.lang.String str54 = helpFormatter44.defaultArgName;
        helpFormatter44.setNewLine("\n");
        helpFormatter44.defaultSyntaxPrefix = "-";
        helpFormatter44.defaultLeftPad = (byte) 10;
        int int61 = helpFormatter44.defaultWidth;
        helpFormatter44.setWidth((int) (byte) 100);
        helpFormatter44.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.HelpFormatter helpFormatter66 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator67 = helpFormatter66.optionComparator;
        helpFormatter66.setLongOptPrefix("");
        int int73 = helpFormatter66.findWrapPos("-", (int) '#', 1);
        int int74 = helpFormatter66.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter75 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator76 = helpFormatter75.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter77 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator78 = helpFormatter77.optionComparator;
        helpFormatter75.optionComparator = comparator78;
        helpFormatter75.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter82 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator83 = helpFormatter82.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter84 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator85 = helpFormatter84.optionComparator;
        helpFormatter82.optionComparator = comparator85;
        helpFormatter75.setOptionComparator(comparator85);
        helpFormatter66.setOptionComparator(comparator85);
        helpFormatter44.optionComparator = comparator85;
        helpFormatter21.setOptionComparator(comparator85);
        helpFormatter0.setOptionComparator(comparator85);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "--" + "'", str28, "--");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "usage: " + "'", str31, "usage: ");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-" + "'", str38, "-");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n" + "'", str39, "\n");
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "arg" + "'", str54, "arg");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 74 + "'", int61 == 74);
        org.junit.Assert.assertNotNull(comparator67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 74 + "'", int74 == 74);
        org.junit.Assert.assertNotNull(comparator76);
        org.junit.Assert.assertNotNull(comparator78);
        org.junit.Assert.assertNotNull(comparator83);
        org.junit.Assert.assertNotNull(comparator85);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (-1), "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 52, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 11, "", "                                                    ", options16, 32, (int) (byte) 100, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        int int8 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("\n");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "                                ", options13, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str12 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        java.lang.String str20 = helpFormatter0.rtrim("   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(74);
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) (byte) 100, "hi!", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = '4';
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        java.lang.String str32 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("-");
        java.lang.String str35 = helpFormatter0.getOptPrefix();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "usage: " + "'", str32, "usage: ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-" + "'", str35, "-");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultArgName = "                                   ";
        helpFormatter0.setLongOptPrefix("          ");
        java.lang.String str14 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                   " + "'", str14, "                                   ");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 'a';
        helpFormatter0.defaultLongOptPrefix = "-";
        int int8 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (short) 0);
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str14 = helpFormatter0.rtrim("");
        int int15 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "-", options12, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultNewLine = "                                   ";
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultNewLine = "";
        java.lang.String str12 = helpFormatter0.rtrim(" ");
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) (byte) -1, "usage:", "   ", options18, 0, 10, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(20, "", " ", options21, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        helpFormatter0.setSyntaxPrefix("arg");
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("                                   ", (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) (byte) 10, 97, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        int int27 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLongOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter30.defaultSyntaxPrefix = "--";
        helpFormatter30.setNewLine("");
        java.lang.String str36 = helpFormatter30.defaultArgName;
        java.lang.String str37 = helpFormatter30.defaultLongOptPrefix;
        java.util.Comparator comparator38 = helpFormatter30.getOptionComparator();
        helpFormatter0.optionComparator = comparator38;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "--" + "'", str37, "--");
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter19.defaultLeftPad = 100;
        helpFormatter19.setSyntaxPrefix("--");
        helpFormatter19.setOptPrefix("-");
        java.util.Comparator comparator27 = helpFormatter19.getOptionComparator();
        helpFormatter0.optionComparator = comparator27;
        java.util.Comparator comparator29 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.defaultDescPad = (byte) 10;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "-", options11, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        int int18 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setLongOptPrefix("                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str14 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding((int) (byte) 0);
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter11.defaultLeftPad = 100;
        helpFormatter11.setSyntaxPrefix("hi!");
        int int17 = helpFormatter11.getWidth();
        java.lang.String str18 = helpFormatter11.defaultLongOptPrefix;
        java.lang.String str19 = helpFormatter11.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter20.optionComparator = comparator23;
        helpFormatter11.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        java.lang.String str27 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer28 = null;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer33 = helpFormatter0.renderOptions(stringBuffer28, (int) '4', options30, 11, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((int) (byte) -1);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) ' ', (int) (short) 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        helpFormatter14.optionComparator = comparator17;
        int int19 = helpFormatter14.defaultWidth;
        helpFormatter14.setSyntaxPrefix("");
        helpFormatter14.setSyntaxPrefix("hi!");
        java.lang.String str24 = helpFormatter14.defaultOptPrefix;
        int int25 = helpFormatter14.defaultLeftPad;
        java.util.Comparator comparator26 = helpFormatter14.optionComparator;
        helpFormatter0.optionComparator = comparator26;
        java.lang.String str28 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "          ";
        int int31 = helpFormatter0.getLeftPadding();
        int int32 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                                                                 ", options35, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter9.defaultLeftPad = 100;
        helpFormatter9.setSyntaxPrefix("--");
        helpFormatter9.setOptPrefix("hi!");
        helpFormatter9.setNewLine("usage: ");
        helpFormatter9.setLeftPadding(74);
        java.lang.String str21 = helpFormatter9.defaultNewLine;
        java.util.Comparator comparator22 = helpFormatter9.getOptionComparator();
        helpFormatter0.optionComparator = comparator22;
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter24, 97, "", "   ", options28, (int) (short) 100, (int) (byte) 10, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator7 = helpFormatter6.optionComparator;
        helpFormatter0.optionComparator = comparator7;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        helpFormatter9.setLongOptPrefix("");
        int int16 = helpFormatter9.findWrapPos("-", (int) '#', 1);
        helpFormatter9.defaultArgName = "hi!";
        helpFormatter9.setDescPadding((int) (byte) 1);
        java.lang.String str21 = helpFormatter9.defaultSyntaxPrefix;
        helpFormatter9.setDescPadding(100);
        java.lang.String str24 = helpFormatter9.getNewLine();
        java.util.Comparator comparator25 = helpFormatter9.getOptionComparator();
        helpFormatter0.optionComparator = comparator25;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 10, (int) (byte) 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(10);
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.rtrim("                                                                                                 ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setWidth((int) (byte) 1);
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(2);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setSyntaxPrefix("-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = (byte) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter13.defaultLeftPad = 100;
        helpFormatter13.setSyntaxPrefix("hi!");
        int int19 = helpFormatter13.getWidth();
        java.lang.String str20 = helpFormatter13.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter13.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        helpFormatter22.optionComparator = comparator25;
        helpFormatter13.setOptionComparator(comparator25);
        helpFormatter0.optionComparator = comparator25;
        java.io.PrintWriter printWriter29 = null;
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter29, (int) (short) 100, options31, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = (byte) 100;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str11 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("\n");
        java.util.Comparator comparator16 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "   ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.defaultLeftPad;
        int int12 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 52, options17, 11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.setArgName("-");
        helpFormatter0.setNewLine("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.createPadding(0);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        helpFormatter14.optionComparator = comparator17;
        int int19 = helpFormatter14.defaultWidth;
        helpFormatter14.setSyntaxPrefix("");
        helpFormatter14.setSyntaxPrefix("hi!");
        java.lang.String str24 = helpFormatter14.defaultOptPrefix;
        int int25 = helpFormatter14.defaultLeftPad;
        java.util.Comparator comparator26 = helpFormatter14.optionComparator;
        helpFormatter0.optionComparator = comparator26;
        java.lang.String str28 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str32 = helpFormatter0.rtrim("\n");
        helpFormatter0.setNewLine("                                                                          ");
        java.lang.String str36 = helpFormatter0.rtrim("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-" + "'", str36, "-");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(35);
        helpFormatter0.defaultArgName = "arg";
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (short) -1, 2, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator7 = null;
        helpFormatter0.optionComparator = comparator7;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultDescPad = (byte) 10;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                    ", options14, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setOptPrefix("");
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 0, "                                                                                                 ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("usage: ");
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = 'a';
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.createPadding(52);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                 " + "'", str18, "                                                                                                 ");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = ' ';
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultDescPad = 10;
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, 52, "usage: ", options24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.createPadding(0);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding(1);
        int int13 = helpFormatter0.findWrapPos("-", 3, (int) (short) 100);
        int int14 = helpFormatter0.getWidth();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 3;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = '4';
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        java.lang.String str17 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "arg";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        helpFormatter0.setArgName("                                                                                                 ");
        int int18 = helpFormatter0.findWrapPos("   ", 3, 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter9.optionComparator = comparator12;
        helpFormatter0.setOptionComparator(comparator12);
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultDescPad = (byte) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        helpFormatter0.setNewLine("                                                                          ");
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }
}

