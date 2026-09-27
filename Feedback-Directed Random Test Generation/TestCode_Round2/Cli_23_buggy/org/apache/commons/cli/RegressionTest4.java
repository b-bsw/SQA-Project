package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        helpFormatter0.setDescPadding(52);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        int int13 = helpFormatter0.defaultWidth;
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) (byte) -1, options16, 52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        int int36 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter37 = null;
        org.apache.commons.cli.Options options41 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter37, (-1), "                                                    ", "                                                                                                    ", options41, 0, 74, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        int int13 = helpFormatter0.findWrapPos(" ", (int) (short) 1, (int) (short) 10);
        helpFormatter0.setNewLine("arg");
        java.lang.String str16 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str21 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.defaultWidth = 100;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.util.Comparator comparator15 = helpFormatter0.optionComparator;
        java.lang.String str17 = helpFormatter0.createPadding((int) (byte) 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 97, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultWidth = (byte) -1;
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix(" ");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "-", "usage: ", options15, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        -");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultDescPad = 3;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        int int20 = helpFormatter0.defaultWidth;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.String str25 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str26 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setWidth(52);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.defaultWidth = '4';
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = (byte) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.defaultWidth = '4';
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (byte) 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getNewLine();
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, (int) '#', "", "arg", options22, (int) (byte) 100, 97, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options22, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 10);
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str11 = helpFormatter0.rtrim("arg");
        helpFormatter0.setWidth((int) '4');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, 100, options17, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        java.lang.String str20 = helpFormatter0.createPadding((int) (byte) 10);
        int int21 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = " ";
        java.lang.String str24 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = (byte) 1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "          " + "'", str20, "          ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 2, "arg", "usage: ", options16, 32, 0, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultNewLine = "          ";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        java.io.PrintWriter printWriter29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter29, (int) (byte) 10, "");
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
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        helpFormatter0.defaultLeftPad = (byte) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultWidth = (byte) -1;
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix(" ");
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setOptPrefix("hi!");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "hi!", "                                   ", options17, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str19 = helpFormatter0.getNewLine();
        int int20 = helpFormatter0.getDescPadding();
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 10, "", "                                                                          ", options16, (int) '4', 3, "--", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options12);
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
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        helpFormatter0.setArgName("                                                                                                    ");
        java.util.Comparator comparator23 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        helpFormatter0.defaultDescPad = (short) 100;
        int int22 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        int int15 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        int int15 = helpFormatter0.getWidth();
        java.lang.String str16 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str12 = helpFormatter0.createPadding(100);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) (short) -1, options15, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) (short) 1, "                                ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        int int13 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) (short) -1, "                                                    ", "", options18, (int) (short) 0, (int) '4', "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        helpFormatter23.setLongOptPrefix("");
        int int30 = helpFormatter23.findWrapPos("-", (int) '#', 1);
        helpFormatter23.defaultArgName = "hi!";
        java.lang.String str33 = helpFormatter23.defaultArgName;
        java.lang.String str34 = helpFormatter23.getArgName();
        java.lang.String str36 = helpFormatter23.createPadding((int) (short) 1);
        java.util.Comparator comparator37 = helpFormatter23.optionComparator;
        helpFormatter0.setOptionComparator(comparator37);
        java.lang.String str39 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " " + "'", str36, " ");
        org.junit.Assert.assertNotNull(comparator37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-" + "'", str39, "-");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("");
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str20 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "          ", options23, "usage:", false);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "                                   ";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "                                                                                                 ", options20, "", true);
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.String str20 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.defaultLongOptPrefix = "          ";
        int int23 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                   " + "'", str20, "                                   ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        helpFormatter11.optionComparator = comparator14;
        int int16 = helpFormatter11.defaultWidth;
        int int17 = helpFormatter11.getLeftPadding();
        helpFormatter11.defaultLeftPad = 1;
        java.lang.String str20 = helpFormatter11.defaultNewLine;
        java.lang.String str21 = helpFormatter11.getArgName();
        java.lang.String str22 = helpFormatter11.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        helpFormatter23.defaultLeftPad = 100;
        helpFormatter23.setSyntaxPrefix("--");
        helpFormatter23.setOptPrefix("hi!");
        helpFormatter23.setNewLine("usage: ");
        helpFormatter23.setLeftPadding(74);
        java.lang.String str35 = helpFormatter23.defaultNewLine;
        java.util.Comparator comparator36 = helpFormatter23.getOptionComparator();
        helpFormatter11.optionComparator = comparator36;
        java.util.Comparator comparator38 = helpFormatter11.getOptionComparator();
        helpFormatter11.setNewLine("usage:");
        org.apache.commons.cli.HelpFormatter helpFormatter41 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator42 = helpFormatter41.optionComparator;
        helpFormatter41.defaultLeftPad = 100;
        helpFormatter41.setOptPrefix("");
        helpFormatter41.setOptPrefix("usage: ");
        helpFormatter41.defaultNewLine = "hi!";
        helpFormatter41.defaultNewLine = "hi!";
        java.util.Comparator comparator53 = helpFormatter41.getOptionComparator();
        java.lang.String str54 = helpFormatter41.getArgName();
        helpFormatter41.setNewLine("--");
        org.apache.commons.cli.HelpFormatter helpFormatter57 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator58 = helpFormatter57.optionComparator;
        helpFormatter57.setLongOptPrefix("");
        int int64 = helpFormatter57.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str65 = helpFormatter57.defaultOptPrefix;
        java.lang.String str66 = helpFormatter57.defaultNewLine;
        java.lang.String str67 = helpFormatter57.getSyntaxPrefix();
        helpFormatter57.defaultLeftPad = 35;
        org.apache.commons.cli.HelpFormatter helpFormatter70 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator71 = helpFormatter70.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter72 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator73 = helpFormatter72.optionComparator;
        helpFormatter70.optionComparator = comparator73;
        helpFormatter70.defaultLeftPad = 0;
        java.lang.String str77 = helpFormatter70.defaultLongOptPrefix;
        java.lang.String str78 = helpFormatter70.defaultLongOptPrefix;
        helpFormatter70.setLongOptPrefix("--");
        java.util.Comparator comparator81 = helpFormatter70.getOptionComparator();
        helpFormatter57.setOptionComparator(comparator81);
        helpFormatter41.optionComparator = comparator81;
        helpFormatter11.optionComparator = comparator81;
        helpFormatter0.setOptionComparator(comparator81);
        // The following exception was thrown during execution in test generation
        try {
            int int89 = helpFormatter0.findWrapPos("   ", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "usage: " + "'", str35, "usage: ");
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertNotNull(comparator53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "arg" + "'", str54, "arg");
        org.junit.Assert.assertNotNull(comparator58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "-" + "'", str65, "-");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\n" + "'", str66, "\n");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "usage: " + "'", str67, "usage: ");
        org.junit.Assert.assertNotNull(comparator71);
        org.junit.Assert.assertNotNull(comparator73);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "--" + "'", str77, "--");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "--" + "'", str78, "--");
        org.junit.Assert.assertNotNull(comparator81);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.findWrapPos(" ", 100, 100);
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) 'a', "                                                    ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        java.lang.String str20 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("                                   ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator8 = helpFormatter7.optionComparator;
        helpFormatter7.setLongOptPrefix("");
        int int14 = helpFormatter7.findWrapPos("-", (int) '#', 1);
        helpFormatter7.defaultArgName = "hi!";
        helpFormatter7.setDescPadding((int) (byte) 1);
        java.lang.String str19 = helpFormatter7.defaultSyntaxPrefix;
        helpFormatter7.setDescPadding(100);
        java.lang.String str22 = helpFormatter7.getNewLine();
        java.util.Comparator comparator23 = helpFormatter7.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        java.lang.String str8 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        java.lang.String str26 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer31 = helpFormatter0.renderWrappedText(stringBuffer27, (int) 'a', 11, "\n");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "                                                                          ", "usage: ", options22, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 0, "-", "   ", options23, 3, (int) 'a', "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        helpFormatter0.defaultArgName = "";
        java.lang.String str14 = helpFormatter0.defaultArgName;
        java.lang.String str16 = helpFormatter0.rtrim("hi!");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultNewLine = "\n";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str15 = helpFormatter0.createPadding((int) '4');
        java.lang.String str17 = helpFormatter0.rtrim("          ");
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, (int) (byte) -1, "   ", "                                   ", options23, 1, (int) (short) 1, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                    " + "'", str15, "                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        java.util.Comparator comparator15 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator15;
        int int17 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        helpFormatter0.setArgName("usage: ");
        java.lang.String str20 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        helpFormatter0.defaultOptPrefix = "usage: ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = helpFormatter0.renderOptions(stringBuffer19, 74, options21, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        int int9 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "", options12, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str15 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', " ", "          ", options17, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding((int) (byte) -1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth(2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.defaultWidth = (byte) 1;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str7 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                                                      ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        int int7 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) (short) 1, "                                ", "   ", options12, (int) (byte) 100, (-1), "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:     ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "   ";
        helpFormatter0.defaultNewLine = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        int int14 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.setDescPadding(10);
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter12.optionComparator = comparator15;
        helpFormatter12.setDescPadding((-1));
        java.util.Comparator comparator19 = helpFormatter12.getOptionComparator();
        helpFormatter12.defaultNewLine = "arg";
        int int22 = helpFormatter12.defaultLeftPad;
        java.util.Comparator comparator23 = helpFormatter12.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        helpFormatter0.setNewLine("          ");
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "arg", "", options30, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 0, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 2, "                                                                          ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "--";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        int int8 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 100, "", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.defaultNewLine = "usage:";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultWidth = 10;
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (short) -1, "                                ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (short) 100, "          ");
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
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setDescPadding((int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("hi!");
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) ' ', 11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.lang.String str21 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.util.Comparator comparator2 = helpFormatter0.getOptionComparator();
        helpFormatter0.setDescPadding((int) (short) 0);
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        helpFormatter0.defaultDescPad = (short) 0;
        java.lang.String str22 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        int int25 = helpFormatter0.getDescPadding();
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = helpFormatter0.renderWrappedText(stringBuffer26, (-1), (int) '#', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "usage:", "                                                                          ", options12, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 35, "                                                                          ", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 97, "   ", "                                                                          ", options11, (int) '#', (int) (short) -1, "--", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        int int22 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "--";
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setSyntaxPrefix("                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        java.lang.String str23 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        java.lang.String str10 = helpFormatter0.rtrim("arg");
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultDescPad = 10;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.defaultOptPrefix = "";
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderOptions(stringBuffer16, (int) (byte) 1, options18, 52, 97);
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        helpFormatter0.defaultLongOptPrefix = "   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultArgName = "";
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.defaultDescPad = 97;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator8 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.createPadding((int) (short) 1);
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        int int15 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (byte) 1, "", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "hi!";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = ' ';
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        int int15 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        int int10 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) -1);
        helpFormatter0.setSyntaxPrefix("                                ");
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                " + "'", str17, "                                ");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        helpFormatter0.setLeftPadding(100);
        java.lang.String str18 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, (int) (byte) -1, "", "usage:", options23, (int) (short) 1, 3, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        int int13 = helpFormatter0.getWidth();
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        int int15 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultLeftPad = 52;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        java.lang.String str14 = helpFormatter0.defaultArgName;
        java.lang.String str15 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage:", options18, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 35;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter13.optionComparator = comparator16;
        helpFormatter13.defaultLeftPad = 0;
        java.lang.String str20 = helpFormatter13.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter13.defaultLongOptPrefix;
        helpFormatter13.setLongOptPrefix("--");
        java.util.Comparator comparator24 = helpFormatter13.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator24);
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.defaultOptPrefix = "          ";
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str33 = helpFormatter0.createPadding((int) ' ');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                " + "'", str33, "                                ");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultLeftPad = '#';
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("                                                                          ");
        int int20 = helpFormatter0.defaultLeftPad;
        java.lang.String str21 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                          " + "'", str21, "                                                                          ");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        java.lang.String str58 = helpFormatter0.getArgName();
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        helpFormatter0.setOptPrefix("                                   ");
        helpFormatter0.defaultDescPad = '4';
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
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = 1;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter12.optionComparator = comparator15;
        int int17 = helpFormatter12.defaultWidth;
        int int18 = helpFormatter12.getLeftPadding();
        helpFormatter12.setDescPadding(0);
        int int21 = helpFormatter12.getWidth();
        helpFormatter12.setOptPrefix("");
        java.lang.String str24 = helpFormatter12.defaultSyntaxPrefix;
        java.util.Comparator comparator25 = helpFormatter12.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator25);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, " ", "                                                    ", options12, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str14 = helpFormatter0.rtrim("-");
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter5, (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        java.lang.String str24 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                    " + "'", str24, "                                                                                                    ");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("                                                    ");
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setWidth((int) (byte) 1);
        int int16 = helpFormatter0.defaultLeftPad;
        int int17 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.defaultLeftPad = 100;
        helpFormatter8.setOptPrefix("");
        helpFormatter8.setOptPrefix("usage: ");
        helpFormatter8.defaultNewLine = "hi!";
        java.lang.String str18 = helpFormatter8.getNewLine();
        java.lang.String str19 = helpFormatter8.defaultSyntaxPrefix;
        helpFormatter8.defaultLongOptPrefix = "                                   ";
        java.lang.String str22 = helpFormatter8.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator23;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        int int15 = helpFormatter0.findWrapPos("   ", 1, 74);
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "", "                                   ", options11, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("hi!");
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (int) (short) 100, "                                                                          ");
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
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLongOptPrefix(" ");
        helpFormatter0.defaultArgName = " ";
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        java.io.PrintWriter printWriter28 = null;
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter28, (int) '#', "                                ", options31);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "usage: " + "'", str27, "usage: ");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
            helpFormatter0.printHelp(printWriter24, 74, "                                                    ", "", options28, 10, 52, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        // The following exception was thrown during execution in test generation
        try {
            int int23 = helpFormatter0.findWrapPos("--", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setArgName("--");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultOptPrefix = "          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) -1, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("\n");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "arg";
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str13 = helpFormatter0.createPadding(97);
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 11, " ", "\n", options18, 10, 32, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                 " + "'", str13, "                                                                                                 ");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("                                                                                                    ");
        int int20 = helpFormatter0.findWrapPos("", 100, (int) (byte) 10);
        int int24 = helpFormatter0.findWrapPos("                                   ", (int) 'a', (int) (short) -1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.rtrim("usage: ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage:" + "'", str10, "usage:");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getNewLine();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("          ");
        helpFormatter0.setWidth(100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "arg";
        int int10 = helpFormatter0.getWidth();
        java.lang.String str12 = helpFormatter0.rtrim("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.lang.String str28 = helpFormatter0.defaultNewLine;
        int int32 = helpFormatter0.findWrapPos("                                                                          ", 0, 74);
        java.lang.String str33 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                                                                                 " + "'", str28, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "usage: " + "'", str33, "usage: ");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, 11, options20, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.lang.String str11 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter12.optionComparator = comparator15;
        helpFormatter12.defaultLeftPad = 0;
        java.lang.String str19 = helpFormatter12.defaultLongOptPrefix;
        java.lang.String str20 = helpFormatter12.defaultLongOptPrefix;
        helpFormatter12.setLongOptPrefix("--");
        java.util.Comparator comparator23 = helpFormatter12.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        int int25 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 32, 32, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        helpFormatter0.setLeftPadding((int) (short) 1);
        int int7 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setWidth((int) '4');
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter9.defaultOptPrefix = "\n";
        java.lang.String str12 = helpFormatter9.getLongOptPrefix();
        helpFormatter9.defaultArgName = "                                                                                                 ";
        helpFormatter9.defaultOptPrefix = " ";
        java.util.Comparator comparator17 = helpFormatter9.optionComparator;
        helpFormatter0.optionComparator = comparator17;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = 52;
        int int10 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultArgName = "          ";
        helpFormatter0.defaultWidth = (short) 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getNewLine();
        int int16 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options11);
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
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding(32);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
            helpFormatter0.printWrapped(printWriter11, 3, 0, "-");
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str12 = helpFormatter0.createPadding(100);
        java.lang.String str13 = helpFormatter0.getNewLine();
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str17 = helpFormatter0.defaultArgName;
        java.lang.String str18 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.defaultOptPrefix = "                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "\n";
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 100, (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int15 = helpFormatter0.defaultWidth;
        int int19 = helpFormatter0.findWrapPos("arg", (int) (short) 100, 74);
        java.lang.String str20 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int12 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "-", "usage: ", options19, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        int int20 = helpFormatter0.findWrapPos("hi!", (int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "\n";
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = (short) 100;
        helpFormatter0.setSyntaxPrefix("-");
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (byte) 1, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:   ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = 1;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding(35);
        helpFormatter0.setWidth((int) (short) 1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str15 = helpFormatter0.createPadding((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        helpFormatter0.defaultLeftPad = 74;
        helpFormatter0.setSyntaxPrefix(" ");
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding((int) '4');
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.io.PrintWriter printWriter3 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter3, (int) ' ', " ", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        int int22 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        java.lang.StringBuffer stringBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = helpFormatter0.renderWrappedText(stringBuffer23, (int) (byte) 1, (int) (short) -1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "";
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                                                                 ", "--", options19, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:            ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter26, (int) (short) 1, (int) (short) 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, (int) ' ', options15, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, (-1), "--", "-", options23, (int) ' ', 11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultDescPad = (short) -1;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 32, "-");
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultWidth = (short) 1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = (byte) 100;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 97, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "\n", options14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        int int27 = helpFormatter0.defaultWidth;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.apache.commons.cli.HelpFormatter helpFormatter4 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator5 = helpFormatter4.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator7 = helpFormatter6.optionComparator;
        helpFormatter4.optionComparator = comparator7;
        helpFormatter4.defaultLeftPad = 0;
        java.lang.String str11 = helpFormatter4.defaultLongOptPrefix;
        helpFormatter4.setLeftPadding((int) '4');
        java.lang.String str14 = helpFormatter4.getSyntaxPrefix();
        int int18 = helpFormatter4.findWrapPos("", 35, (int) (short) 10);
        helpFormatter4.defaultDescPad = (byte) 0;
        java.lang.String str21 = helpFormatter4.defaultOptPrefix;
        java.util.Comparator comparator22 = helpFormatter4.optionComparator;
        helpFormatter0.optionComparator = comparator22;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter24.optionComparator = comparator27;
        helpFormatter24.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator32 = helpFormatter31.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator34 = helpFormatter33.optionComparator;
        helpFormatter31.optionComparator = comparator34;
        helpFormatter24.setOptionComparator(comparator34);
        int int37 = helpFormatter24.defaultDescPad;
        helpFormatter24.defaultArgName = "";
        java.lang.String str40 = helpFormatter24.getArgName();
        helpFormatter24.defaultNewLine = "";
        org.apache.commons.cli.HelpFormatter helpFormatter43 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator44 = helpFormatter43.optionComparator;
        helpFormatter43.setLongOptPrefix("");
        int int50 = helpFormatter43.findWrapPos("-", (int) '#', 1);
        int int51 = helpFormatter43.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter52 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator53 = helpFormatter52.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter54 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator55 = helpFormatter54.optionComparator;
        helpFormatter52.optionComparator = comparator55;
        helpFormatter52.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter59 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator60 = helpFormatter59.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter61 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator62 = helpFormatter61.optionComparator;
        helpFormatter59.optionComparator = comparator62;
        helpFormatter52.setOptionComparator(comparator62);
        helpFormatter43.setOptionComparator(comparator62);
        helpFormatter24.optionComparator = comparator62;
        helpFormatter0.setOptionComparator(comparator62);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 74 + "'", int51 == 74);
        org.junit.Assert.assertNotNull(comparator53);
        org.junit.Assert.assertNotNull(comparator55);
        org.junit.Assert.assertNotNull(comparator60);
        org.junit.Assert.assertNotNull(comparator62);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = " ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options10);
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
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        helpFormatter0.setLongOptPrefix("                                ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        int int13 = helpFormatter0.findWrapPos(" ", (int) (short) 1, (int) (short) 10);
        helpFormatter0.setNewLine("arg");
        java.lang.String str16 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        java.lang.String str7 = helpFormatter0.rtrim("                                   ");
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(35);
        helpFormatter0.defaultArgName = "arg";
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 52, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        java.lang.Class<?> wildcardClass18 = comparator17.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        int int9 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "                                                    ", options12, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = (byte) -1;
        helpFormatter0.defaultWidth = 32;
        java.lang.String str12 = helpFormatter0.rtrim("usage: ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) (short) 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding(52);
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter7.defaultOptPrefix = "\n";
        java.lang.String str10 = helpFormatter7.getLongOptPrefix();
        helpFormatter7.defaultArgName = "                                                                                                 ";
        helpFormatter7.defaultOptPrefix = " ";
        java.util.Comparator comparator15 = helpFormatter7.optionComparator;
        helpFormatter0.setOptionComparator(comparator15);
        helpFormatter0.setOptPrefix("          ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setArgName("\n");
        java.lang.StringBuffer stringBuffer24 = null;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = helpFormatter0.renderOptions(stringBuffer24, (int) (byte) 0, options26, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        java.lang.String str20 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("                                ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.defaultOptPrefix = "";
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, (int) ' ', options18, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, (int) '#', 100, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int16 = helpFormatter0.findWrapPos("hi!", (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        int int20 = helpFormatter0.getLeftPadding();
        java.lang.String str21 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        helpFormatter0.defaultLeftPad = 74;
        helpFormatter0.setLongOptPrefix("arg");
        java.util.Comparator comparator32 = helpFormatter0.optionComparator;
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
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.lang.String str19 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) -1);
        java.lang.String str22 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setNewLine("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        int int12 = helpFormatter0.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter13.defaultNewLine = "hi!";
        java.lang.String str17 = helpFormatter13.rtrim("arg");
        java.lang.String str18 = helpFormatter13.getSyntaxPrefix();
        java.lang.String str19 = helpFormatter13.defaultOptPrefix;
        java.lang.String str20 = helpFormatter13.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        helpFormatter21.setLongOptPrefix("");
        int int28 = helpFormatter21.findWrapPos("-", (int) '#', 1);
        helpFormatter21.defaultOptPrefix = "--";
        java.lang.String str31 = helpFormatter21.defaultArgName;
        helpFormatter21.setNewLine("\n");
        helpFormatter21.defaultSyntaxPrefix = "-";
        helpFormatter21.setWidth((int) (short) 100);
        helpFormatter21.defaultOptPrefix = "--";
        int int40 = helpFormatter21.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter41 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator42 = helpFormatter41.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter43 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator44 = helpFormatter43.optionComparator;
        helpFormatter41.optionComparator = comparator44;
        int int46 = helpFormatter41.defaultWidth;
        int int47 = helpFormatter41.getLeftPadding();
        helpFormatter41.setDescPadding(0);
        int int50 = helpFormatter41.getWidth();
        java.util.Comparator comparator51 = helpFormatter41.optionComparator;
        helpFormatter21.optionComparator = comparator51;
        helpFormatter13.setOptionComparator(comparator51);
        helpFormatter0.setOptionComparator(comparator51);
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.defaultLongOptPrefix = " ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 74 + "'", int46 == 74);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 74 + "'", int50 == 74);
        org.junit.Assert.assertNotNull(comparator51);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "\n";
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) '#', "hi!", options14);
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
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                                    ");
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setSyntaxPrefix("\n");
        int int13 = helpFormatter0.findWrapPos("                                                    ", (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                    ");
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        int int12 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "\n";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "\n";
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (byte) 100, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) '4', "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultDescPad = (short) 100;
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.setDescPadding(1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          " + "'", str10, "          ");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        int int20 = helpFormatter0.defaultLeftPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                                    ");
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultWidth = (byte) 1;
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter3.defaultNewLine = "hi!";
        java.lang.String str7 = helpFormatter3.rtrim("arg");
        int int8 = helpFormatter3.defaultDescPad;
        helpFormatter3.defaultWidth = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter11.defaultSyntaxPrefix = "--";
        helpFormatter11.setNewLine("");
        helpFormatter11.setSyntaxPrefix("hi!");
        java.lang.String str20 = helpFormatter11.rtrim("-");
        java.lang.String str21 = helpFormatter11.getArgName();
        java.lang.String str22 = helpFormatter11.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter11.optionComparator;
        java.util.Comparator comparator24 = helpFormatter11.optionComparator;
        helpFormatter3.setOptionComparator(comparator24);
        helpFormatter0.setOptionComparator(comparator24);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertNotNull(comparator24);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, 3, options15, (int) '4', 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        java.lang.String str27 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 74, (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(20, "arg", "usage: ", options16, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultOptPrefix = "arg";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "-", "                                                                          ", options19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) (byte) 0, "                                                    ", "usage:", options20, 97, 0, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:     ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        int int21 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 0);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) ' ', "-", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultNewLine = "                                                    ";
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
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int10 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, (int) (byte) -1);
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        helpFormatter0.setLongOptPrefix("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "-", options13, "usage: ");
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
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultWidth = 32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        int int22 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        java.lang.StringBuffer stringBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = helpFormatter0.renderWrappedText(stringBuffer23, 52, (-1), "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.createPadding((int) (short) 1);
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = (byte) -1;
        int int18 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator19 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(74);
        helpFormatter0.setLongOptPrefix("                                                                          ");
        int int19 = helpFormatter0.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        helpFormatter20.defaultSyntaxPrefix = "--";
        helpFormatter20.setNewLine("");
        java.lang.String str26 = helpFormatter20.getNewLine();
        java.lang.String str27 = helpFormatter20.getLongOptPrefix();
        int int28 = helpFormatter20.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter29.defaultNewLine = "";
        java.lang.String str32 = helpFormatter29.getLongOptPrefix();
        helpFormatter29.defaultNewLine = "--";
        java.lang.String str35 = helpFormatter29.getArgName();
        helpFormatter29.defaultDescPad = '4';
        helpFormatter29.setLongOptPrefix("--");
        helpFormatter29.setLongOptPrefix("                                                                          ");
        int int42 = helpFormatter29.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter43 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator44 = helpFormatter43.optionComparator;
        helpFormatter43.setLongOptPrefix("");
        int int50 = helpFormatter43.findWrapPos("-", (int) '#', 1);
        helpFormatter43.defaultArgName = "hi!";
        java.lang.String str53 = helpFormatter43.defaultArgName;
        java.lang.String str54 = helpFormatter43.getArgName();
        java.lang.String str56 = helpFormatter43.createPadding((int) (short) 1);
        java.util.Comparator comparator57 = helpFormatter43.optionComparator;
        helpFormatter29.setOptionComparator(comparator57);
        helpFormatter20.setOptionComparator(comparator57);
        helpFormatter0.optionComparator = comparator57;
        java.lang.String str61 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "--" + "'", str32, "--");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " " + "'", str56, " ");
        org.junit.Assert.assertNotNull(comparator57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "--" + "'", str61, "--");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (short) 0, "", "   ", options14, 100, 32, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (-1), options13, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        int int8 = helpFormatter0.getDescPadding();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("");
        int int12 = helpFormatter0.getWidth();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (byte) 10, "                                                                                                    ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int13 = helpFormatter0.findWrapPos("--", (int) 'a', 35);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (-1), "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "";
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = " ";
        java.lang.String str18 = helpFormatter0.rtrim("arg");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        int int14 = helpFormatter0.defaultLeftPad;
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator27 = helpFormatter26.optionComparator;
        helpFormatter24.optionComparator = comparator27;
        helpFormatter24.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator32 = helpFormatter31.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator34 = helpFormatter33.optionComparator;
        helpFormatter31.optionComparator = comparator34;
        helpFormatter24.setOptionComparator(comparator34);
        org.apache.commons.cli.HelpFormatter helpFormatter37 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator38 = helpFormatter37.optionComparator;
        java.util.Comparator comparator39 = helpFormatter37.getOptionComparator();
        helpFormatter24.optionComparator = comparator39;
        helpFormatter0.optionComparator = comparator39;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 52, "", "                                                                                                 ", options16, 2, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        helpFormatter0.defaultOptPrefix = "-";
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator22 = helpFormatter21.optionComparator;
        helpFormatter21.defaultLeftPad = 100;
        helpFormatter21.setSyntaxPrefix("--");
        int int27 = helpFormatter21.defaultWidth;
        helpFormatter21.setArgName("--");
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter30.defaultLeftPad = 100;
        helpFormatter30.setSyntaxPrefix("--");
        helpFormatter30.setOptPrefix("hi!");
        helpFormatter30.setNewLine("usage: ");
        helpFormatter30.setLeftPadding(74);
        java.lang.String str42 = helpFormatter30.defaultNewLine;
        java.util.Comparator comparator43 = helpFormatter30.getOptionComparator();
        helpFormatter21.optionComparator = comparator43;
        helpFormatter0.setOptionComparator(comparator43);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "usage: " + "'", str42, "usage: ");
        org.junit.Assert.assertNotNull(comparator43);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, 74, (int) (byte) 10, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        java.lang.String str33 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("usage: ");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-" + "'", str33, "-");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 20, options14, 3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("arg");
        helpFormatter0.setDescPadding(35);
        helpFormatter0.setOptPrefix("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getNewLine();
        java.lang.String str17 = helpFormatter0.rtrim("usage: ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage:" + "'", str17, "usage:");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str17 = helpFormatter0.createPadding(97);
        helpFormatter0.defaultWidth = 32;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                 " + "'", str17, "                                                                                                 ");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        int int19 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
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
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:           ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:   ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "   ";
        java.util.Comparator comparator6 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(comparator6);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                                                      ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultWidth = 10;
        java.util.Comparator comparator6 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator6);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        hi!");
        } catch (java.lang.RuntimeException e) {
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
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
}

