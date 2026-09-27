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
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, (int) ' ', options15, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, (int) (short) 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:               usage:");
        } catch (java.lang.RuntimeException e) {
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
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, 74, "          ", options23);
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter22, 0, (int) (short) 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "          " + "'", str20, "          ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        java.lang.String str21 = helpFormatter0.createPadding(74);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                          " + "'", str21, "                                                                          ");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str12 = helpFormatter0.createPadding(100);
        java.lang.String str13 = helpFormatter0.getNewLine();
        int int14 = helpFormatter0.getDescPadding();
        int int15 = helpFormatter0.defaultDescPad;
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, (int) (short) 1, (int) (byte) 100, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "                                                                                                 ", options15, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        java.lang.String str13 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "--";
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, 52, options18, (int) (byte) 1, 3);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 97, "                                ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultNewLine = "          ";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str15 = helpFormatter0.rtrim("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, (int) '4', "usage:", "\n", options22, (int) (short) 10, (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        java.lang.String str24 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, (int) (byte) -1, "          ", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultNewLine = "\n";
        helpFormatter0.defaultWidth = 2;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) (byte) 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        int int18 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setWidth((int) '4');
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (byte) 100, "usage:", "", options13, 0, (int) (short) -1, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "usage:", "hi!", options11, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, "", "", options9, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options17);
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, 32, "                                                                                                    ", "   ", options19, (int) '4', 1, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (short) 1, "          ", " ", options14, 0, (int) (short) 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:     ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter21, 100, options23, 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.lang.String str48 = helpFormatter0.rtrim("                                                                                                    ");
        int int49 = helpFormatter0.getWidth();
        java.lang.String str50 = helpFormatter0.getNewLine();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 74 + "'", int49 == 74);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\n" + "'", str50, "\n");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        int int16 = helpFormatter0.defaultWidth;
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                          " + "'", str17, "                                                                          ");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, 74, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("          ");
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "hi!", options16, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.findWrapPos("hi!", (-1), 100);
        helpFormatter0.defaultWidth = (short) -1;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "--", "arg", options13, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        --");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "                                   ";
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, (int) (byte) 1, options14, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str36 = helpFormatter0.defaultNewLine;
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\n" + "'", str36, "\n");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
            helpFormatter0.printHelp("-", "                                   ", options16, " ", true);
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.createPadding((int) '#');
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   " + "'", str10, "                                   ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.getArgName();
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, (int) 'a', options10, 3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultNewLine = "          ";
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "          " + "'", str13, "          ");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.String str21 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(0);
        helpFormatter0.defaultOptPrefix = "\n";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultWidth = 10;
        int int17 = helpFormatter0.findWrapPos("", (int) (short) 0, (int) (short) 0);
        int int18 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, 74, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(97, "                                ", "hi!", options22, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = helpFormatter0.renderWrappedText(stringBuffer22, (int) (byte) 100, (int) (byte) 100, " ");
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        helpFormatter0.setOptPrefix("                                                    ");
        helpFormatter0.defaultLongOptPrefix = "-";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (short) 100, "                                                                          ", "   ", options15, 74, (int) ' ', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.createPadding((int) 'a');
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultDescPad = (short) 100;
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderWrappedText(stringBuffer18, 100, 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        helpFormatter0.setOptPrefix("          ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str23 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.defaultWidth;
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        helpFormatter0.setDescPadding(100);
        java.io.PrintWriter printWriter29 = null;
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter29, 74, options31, (int) '4', (int) ' ');
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 74, "          ", "arg", options14, (int) (short) 1, 97, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter12.optionComparator = comparator15;
        helpFormatter12.defaultLeftPad = 0;
        helpFormatter12.defaultOptPrefix = "-";
        helpFormatter12.setWidth(1);
        java.util.Comparator comparator23 = helpFormatter12.getOptionComparator();
        helpFormatter0.optionComparator = comparator23;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        helpFormatter0.defaultLeftPad = 2;
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, 32, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        helpFormatter0.setDescPadding((int) (short) 0);
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        int int18 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultWidth = 52;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        helpFormatter0.defaultOptPrefix = " ";
        java.lang.String str33 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, " ", "          ", options37, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        int int15 = helpFormatter0.defaultWidth;
        int int19 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str7 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setDescPadding((int) '#');
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 97, options14, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "--", options13, "hi!", true);
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
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setArgName("-");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, (int) 'a', "\n", "--", options16, (int) (byte) 10, (int) '#', "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, (int) 'a', "                                                                                                 ", "arg", options16, (int) (byte) 10, (int) (short) 100, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 10;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setSyntaxPrefix("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        int int21 = helpFormatter0.findWrapPos("hi!", 11, (int) 'a');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.defaultDescPad = (byte) 10;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 3, "\n", " ", options15, 97, (int) ' ', "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.io.PrintWriter printWriter35 = null;
        org.apache.commons.cli.Options options39 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter35, (int) '4', "                                                    ", "\n", options39, (int) (short) 0, (int) '#', "arg", true);
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int6 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "";
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (-1), "usage: ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        java.util.Comparator comparator19 = helpFormatter0.optionComparator;
        java.lang.String str20 = helpFormatter0.getNewLine();
        java.lang.String str21 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = 10;
        java.lang.String str9 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 1, "                                                                                                    ", "", options16, 52, 0, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:     ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.defaultOptPrefix = "";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "                                ", options18, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        int int18 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.createPadding(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                " + "'", str12, "                                ");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        int int14 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = 52;
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                 " + "'", str13, "                                                                                                 ");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = " ";
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultWidth = (byte) -1;
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix(" ");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        int int16 = helpFormatter0.getLeftPadding();
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "-", "                                   ", options21, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (short) 0);
        helpFormatter0.defaultLeftPad = 74;
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, (int) '#', options15, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator13 = helpFormatter12.optionComparator;
        helpFormatter12.defaultLeftPad = 100;
        helpFormatter12.setOptPrefix("");
        int int18 = helpFormatter12.defaultWidth;
        int int19 = helpFormatter12.getDescPadding();
        java.util.Comparator comparator20 = helpFormatter12.optionComparator;
        helpFormatter0.optionComparator = comparator20;
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str25 = helpFormatter0.rtrim("                                   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.rtrim("");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 32, " ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator14 = helpFormatter13.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator16 = helpFormatter15.optionComparator;
        helpFormatter13.optionComparator = comparator16;
        int int18 = helpFormatter13.defaultWidth;
        helpFormatter13.setSyntaxPrefix("");
        helpFormatter13.setSyntaxPrefix("hi!");
        java.lang.String str23 = helpFormatter13.defaultOptPrefix;
        int int24 = helpFormatter13.defaultLeftPad;
        java.util.Comparator comparator25 = helpFormatter13.optionComparator;
        helpFormatter0.optionComparator = comparator25;
        int int27 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        int int15 = helpFormatter0.findWrapPos("                                                                                                    ", 1, (int) (short) 10);
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        helpFormatter0.setSyntaxPrefix("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 'a';
        helpFormatter0.defaultOptPrefix = "";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) ' ', "--", "arg", options17, (int) (byte) 0, 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        helpFormatter0.setSyntaxPrefix("");
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str7 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                                                     ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "";
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (byte) 1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        int int91 = helpFormatter0.defaultLeftPad;
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
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setNewLine("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = helpFormatter0.createPadding((int) (short) -1);
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (byte) 0, (int) ' ', "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                 ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setArgName(" ");
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) 100, "--", "                                                    ", options17, (int) '#', 0, "");
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultArgName = "";
        int int10 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 32, (int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter20.optionComparator = comparator23;
        int int25 = helpFormatter20.defaultWidth;
        int int26 = helpFormatter20.getLeftPadding();
        helpFormatter20.setDescPadding(0);
        int int29 = helpFormatter20.getWidth();
        java.util.Comparator comparator30 = helpFormatter20.optionComparator;
        helpFormatter0.optionComparator = comparator30;
        int int32 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = (short) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 74 + "'", int29 == 74);
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "--", options13, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.HelpFormatter helpFormatter1 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator2 = helpFormatter1.optionComparator;
        helpFormatter1.defaultLeftPad = 100;
        helpFormatter1.setOptPrefix("");
        helpFormatter1.setOptPrefix("usage: ");
        helpFormatter1.defaultLeftPad = (-1);
        java.lang.String str11 = helpFormatter1.getOptPrefix();
        helpFormatter1.setWidth((int) (byte) 0);
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        helpFormatter14.optionComparator = comparator17;
        helpFormatter14.defaultLeftPad = 0;
        java.lang.String str21 = helpFormatter14.defaultLongOptPrefix;
        java.lang.String str22 = helpFormatter14.defaultLongOptPrefix;
        java.lang.String str23 = helpFormatter14.defaultArgName;
        java.util.Comparator comparator24 = helpFormatter14.getOptionComparator();
        helpFormatter1.setOptionComparator(comparator24);
        helpFormatter0.setOptionComparator(comparator24);
        java.lang.String str27 = helpFormatter0.getOptPrefix();
        int int28 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        helpFormatter0.setArgName("hi!");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        helpFormatter0.setOptPrefix("arg");
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderWrappedText(stringBuffer18, 3, (int) ' ', "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "-";
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) '#', "", "                                                                                                    ", options20, 0, (int) '4', " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        java.lang.String str39 = helpFormatter0.rtrim("          ");
        org.apache.commons.cli.Options options43 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "usage:", "          ", options43, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.rtrim("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        helpFormatter0.defaultNewLine = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, 100, " ", "\n", options12, (int) '#', (int) (byte) 1, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        helpFormatter0.setSyntaxPrefix("                                ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options8, false);
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setDescPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = " ";
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        int int9 = helpFormatter0.findWrapPos("\n", 74, (int) 'a');
        helpFormatter0.defaultDescPad = (short) 1;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, (int) (byte) 100, "                                                    ", "", options16, 3, 97, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        int int19 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("                                   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "--", options13, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        int int28 = helpFormatter0.getLeftPadding();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) ' ');
        int int6 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.setLongOptPrefix("");
        java.util.Comparator comparator12 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator12;
        helpFormatter0.setLeftPadding(1);
        helpFormatter0.defaultLeftPad = 35;
        int int18 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setOptPrefix("                                                                          ");
        helpFormatter0.setLeftPadding(1);
        helpFormatter0.setOptPrefix("                                ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options11, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 97;
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) (byte) 10, "", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.Class<?> wildcardClass19 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        helpFormatter0.setDescPadding(10);
        helpFormatter0.setNewLine("                                   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 'a';
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.rtrim("          ");
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        helpFormatter14.optionComparator = comparator17;
        int int19 = helpFormatter14.defaultWidth;
        int int20 = helpFormatter14.getLeftPadding();
        helpFormatter14.defaultLeftPad = 1;
        int int23 = helpFormatter14.defaultDescPad;
        java.lang.String str24 = helpFormatter14.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator26 = helpFormatter25.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator28 = helpFormatter27.optionComparator;
        helpFormatter25.optionComparator = comparator28;
        int int30 = helpFormatter25.defaultWidth;
        helpFormatter25.setSyntaxPrefix("");
        helpFormatter25.setSyntaxPrefix("hi!");
        java.lang.String str35 = helpFormatter25.defaultOptPrefix;
        int int36 = helpFormatter25.defaultLeftPad;
        java.util.Comparator comparator37 = helpFormatter25.optionComparator;
        helpFormatter14.setOptionComparator(comparator37);
        helpFormatter0.setOptionComparator(comparator37);
        java.lang.String str40 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 74 + "'", int30 == 74);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-" + "'", str35, "-");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(comparator37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "usage: " + "'", str40, "usage: ");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLongOptPrefix("hi!");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.defaultSyntaxPrefix = "--";
        helpFormatter8.setNewLine("");
        helpFormatter8.setSyntaxPrefix("hi!");
        java.lang.String str17 = helpFormatter8.rtrim("-");
        java.lang.String str18 = helpFormatter8.getArgName();
        java.lang.String str19 = helpFormatter8.defaultSyntaxPrefix;
        java.util.Comparator comparator20 = helpFormatter8.optionComparator;
        java.util.Comparator comparator21 = helpFormatter8.optionComparator;
        helpFormatter0.setOptionComparator(comparator21);
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter23, (int) (byte) 0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator21);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "-", options14, "usage:", true);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setDescPadding((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        int int26 = helpFormatter0.defaultDescPad;
        java.lang.String str28 = helpFormatter0.createPadding((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " " + "'", str28, " ");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, (int) (short) -1, options19, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderWrappedText(stringBuffer16, (int) (byte) 0, (int) (byte) 100, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "                                                    ", options7, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str7 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.defaultArgName = "";
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 100, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.lang.String str30 = helpFormatter0.createPadding(0);
        java.lang.StringBuffer stringBuffer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = helpFormatter0.renderWrappedText(stringBuffer31, 11, 1, "                                                                                                 ");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        helpFormatter0.setWidth(2);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator23 = helpFormatter22.optionComparator;
        helpFormatter20.optionComparator = comparator23;
        helpFormatter20.defaultLeftPad = 0;
        java.lang.String str27 = helpFormatter20.defaultLongOptPrefix;
        java.lang.String str28 = helpFormatter20.defaultLongOptPrefix;
        helpFormatter20.defaultSyntaxPrefix = "arg";
        helpFormatter20.defaultArgName = "                                                                          ";
        helpFormatter20.defaultLeftPad = (short) 0;
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator36 = helpFormatter35.optionComparator;
        helpFormatter35.setLongOptPrefix("");
        int int42 = helpFormatter35.findWrapPos("-", (int) '#', 1);
        helpFormatter35.defaultOptPrefix = "--";
        int int45 = helpFormatter35.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter46 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator47 = helpFormatter46.optionComparator;
        helpFormatter46.defaultLeftPad = 100;
        helpFormatter46.setOptPrefix("");
        helpFormatter46.setOptPrefix("usage: ");
        helpFormatter46.defaultNewLine = "hi!";
        helpFormatter46.defaultNewLine = "hi!";
        java.util.Comparator comparator58 = helpFormatter46.getOptionComparator();
        helpFormatter35.setOptionComparator(comparator58);
        helpFormatter20.optionComparator = comparator58;
        helpFormatter0.optionComparator = comparator58;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "--" + "'", str28, "--");
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(comparator47);
        org.junit.Assert.assertNotNull(comparator58);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) (short) 0, "hi!", "-", options12, 0, 11, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        hi!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 0);
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 74, "                                ", options21);
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator28 = helpFormatter27.optionComparator;
        helpFormatter27.setLongOptPrefix("");
        int int34 = helpFormatter27.findWrapPos("-", (int) (short) 10, 74);
        int int35 = helpFormatter27.getDescPadding();
        helpFormatter27.setArgName("hi!");
        java.util.Comparator comparator38 = helpFormatter27.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator38);
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
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options14);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", " ", options14, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultNewLine = "usage:";
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        int int15 = helpFormatter0.getWidth();
        helpFormatter0.setWidth(3);
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "";
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("\n");
        int int6 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "                                                                          ", "usage:", options10, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.setSyntaxPrefix("arg");
        int int17 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        int int24 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter25, (int) (byte) 10, "          ");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        helpFormatter0.defaultDescPad = (byte) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        helpFormatter0.defaultLeftPad = (byte) -1;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "                                ", options20, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = (short) 0;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        helpFormatter0.setLeftPadding((int) (byte) 0);
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = (byte) -1;
        helpFormatter0.setWidth(74);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) (short) 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        java.lang.String str23 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (short) 10, 100, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultArgName = "          ";
        helpFormatter0.setSyntaxPrefix("--");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) '4', "hi!", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        int int7 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.defaultLeftPad = 100;
        helpFormatter8.setSyntaxPrefix("--");
        int int14 = helpFormatter8.defaultWidth;
        helpFormatter8.setArgName("--");
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        helpFormatter17.defaultLeftPad = 100;
        helpFormatter17.setSyntaxPrefix("--");
        helpFormatter17.setOptPrefix("hi!");
        helpFormatter17.setNewLine("usage: ");
        helpFormatter17.setLeftPadding(74);
        java.lang.String str29 = helpFormatter17.defaultNewLine;
        java.util.Comparator comparator30 = helpFormatter17.getOptionComparator();
        helpFormatter8.optionComparator = comparator30;
        helpFormatter0.setOptionComparator(comparator30);
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertNotNull(comparator30);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        helpFormatter0.defaultWidth = 3;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setArgName("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        int int5 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("\n");
        helpFormatter0.setNewLine("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setArgName("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderOptions(stringBuffer16, (int) (byte) -1, options18, (int) ' ', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.setOptPrefix("");
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        int int21 = helpFormatter0.getWidth();
        int int25 = helpFormatter0.findWrapPos("arg", (int) 'a', (int) (short) -1);
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        int int8 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (short) 0, " ", "hi!", options13, 74, (int) (short) 0, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:  ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) (short) -1);
        int int15 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, 10, (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        helpFormatter0.setArgName("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.setOptPrefix("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        int int9 = helpFormatter0.findWrapPos("\n", 74, (int) 'a');
        helpFormatter0.defaultLeftPad = 0;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 100, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        helpFormatter0.defaultDescPad = 74;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter5 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter5.defaultDescPad = '#';
        java.lang.String str8 = helpFormatter5.getSyntaxPrefix();
        java.util.Comparator comparator9 = helpFormatter5.optionComparator;
        helpFormatter0.optionComparator = comparator9;
        helpFormatter0.setWidth((int) (byte) 0);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("          ");
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 32, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        helpFormatter0.setDescPadding((int) ' ');
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 1, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str27 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "usage: " + "'", str27, "usage: ");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = '4';
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        helpFormatter0.setArgName("-");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                ", "usage: ", options14, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.defaultLeftPad = (byte) 0;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        java.io.PrintWriter printWriter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter30, 11, (int) (byte) 0, "                                                                          ");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        int int11 = helpFormatter0.getDescPadding();
        int int15 = helpFormatter0.findWrapPos("", (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        helpFormatter0.setSyntaxPrefix("                                                    ");
        int int12 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options14, true);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultLongOptPrefix = "-";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        int int33 = helpFormatter0.getWidth();
        java.util.Comparator comparator34 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter35 = null;
        org.apache.commons.cli.Options options38 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter35, (int) (byte) 0, "--", options38);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 74 + "'", int33 == 74);
        org.junit.Assert.assertNotNull(comparator34);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        int int25 = helpFormatter0.getWidth();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        java.io.PrintWriter printWriter30 = null;
        org.apache.commons.cli.Options options34 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter30, (int) (short) -1, "usage:", "\n", options34, 1, (int) (byte) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        int int14 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "                                   ", "\n", options18, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int15 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 52, "--", " ", options20, 0, 52, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        java.lang.String str24 = helpFormatter0.createPadding(3);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                   " + "'", str20, "                                   ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "   " + "'", str24, "   ");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) '4', "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "                                                    ", "                                ", options23, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        int int22 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter23, 10, options25, 0, 11);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "\n";
        int int13 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
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
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter41, 3, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.rtrim("");
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "hi!";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        helpFormatter0.setLongOptPrefix("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options16, true);
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options30, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer31 = helpFormatter0.renderWrappedText(stringBuffer27, 32, (int) '4', "          ");
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        java.lang.String str18 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "usage: ", " ", options16, "usage: ", true);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        java.lang.String str21 = helpFormatter19.getArgName();
        helpFormatter19.defaultDescPad = (-1);
        java.lang.String str24 = helpFormatter19.getNewLine();
        java.lang.String str25 = helpFormatter19.defaultNewLine;
        java.util.Comparator comparator26 = helpFormatter19.optionComparator;
        helpFormatter0.setOptionComparator(comparator26);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setArgName("--");
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "usage:", "", options18, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        int int16 = helpFormatter0.defaultWidth;
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter8.defaultLeftPad = 100;
        helpFormatter8.setOptPrefix("");
        int int14 = helpFormatter8.defaultWidth;
        int int15 = helpFormatter8.getLeftPadding();
        int int16 = helpFormatter8.defaultWidth;
        java.lang.String str17 = helpFormatter8.getOptPrefix();
        java.lang.String str18 = helpFormatter8.getNewLine();
        helpFormatter8.setSyntaxPrefix("-");
        helpFormatter8.defaultLongOptPrefix = "                                                                          ";
        java.util.Comparator comparator23 = helpFormatter8.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator23);
        java.lang.String str25 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setArgName("\n");
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("          ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setNewLine("   ");
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        java.lang.String str26 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator28 = helpFormatter27.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator30 = helpFormatter29.optionComparator;
        helpFormatter27.optionComparator = comparator30;
        helpFormatter27.setDescPadding((-1));
        java.util.Comparator comparator34 = helpFormatter27.getOptionComparator();
        java.lang.String str35 = helpFormatter27.getOptPrefix();
        java.util.Comparator comparator36 = helpFormatter27.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator36);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-" + "'", str35, "-");
        org.junit.Assert.assertNotNull(comparator36);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("arg");
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter6, (int) (byte) 100, options8, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "\n", "          ", options13, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "                                                                                                    ", options16, " ");
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.defaultLeftPad = 52;
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str25 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        helpFormatter0.setArgName("-");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "   ", "usage:", options14, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, 11, options19, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "usage:", options16, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        int int17 = helpFormatter0.findWrapPos("usage: ", (int) (byte) 10, 35);
        helpFormatter0.setLeftPadding((-1));
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str11 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (short) -1, options14, (int) '#', 10);
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.defaultDescPad = 3;
        int int10 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, (int) (byte) 100, options13, 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding(32);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.setLeftPadding(32);
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 2, 35, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        int int16 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix(" ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = " ";
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding(52);
        java.util.Comparator comparator15 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, (int) (byte) 0, options18, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        helpFormatter0.setSyntaxPrefix("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        helpFormatter0.setLongOptPrefix("\n");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.rtrim("");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "", "                                                                                                    ", options13, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("usage:");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "";
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 52, options13, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "--", options14, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        java.lang.String str20 = helpFormatter0.getNewLine();
        helpFormatter0.setArgName("                                   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options10, false);
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
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        java.util.Comparator comparator19 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator20 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(97, " ", "                                                                                                 ", options12, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, 52, (int) (byte) 1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        int int11 = helpFormatter0.findWrapPos("arg", 10, (int) 'a');
        int int12 = helpFormatter0.getLeftPadding();
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        java.io.PrintWriter printWriter29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter29, (int) (short) -1, 97, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        helpFormatter0.defaultOptPrefix = "                                                                          ";
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.getNewLine();
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("hi!");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) (short) 1, options16, 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(2, "                                ", "                                                    ", options16, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, 1, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = "-";
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = (-1);
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setNewLine(" ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int7 = helpFormatter0.defaultWidth;
        int int11 = helpFormatter0.findWrapPos("arg", 10, (int) 'a');
        java.lang.String str13 = helpFormatter0.rtrim("          ");
        helpFormatter0.setLongOptPrefix("                                   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("usage: ");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, (int) (short) -1, (int) (short) 10, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (-1), "-", "                                                    ", options10, (int) (short) 10, (int) (short) -1, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "arg", "   ", options17, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("   ");
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultDescPad = (short) -1;
        helpFormatter0.setLeftPadding(52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        java.io.PrintWriter printWriter34 = null;
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter34, (int) (byte) 0, "usage: ", options37);
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
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options19, false);
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
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        helpFormatter0.defaultDescPad = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        int int10 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, (int) (short) 100, options13, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "arg", options16, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getWidth();
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.setSyntaxPrefix("hi!");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 0, options14, (int) (short) 10, (int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        int int9 = helpFormatter0.findWrapPos("                                                                          ", 0, (int) (short) 0);
        helpFormatter0.defaultWidth = (byte) 0;
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "          ";
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        java.lang.String str12 = helpFormatter0.rtrim("");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) 'a', options15, (int) (short) 0, (int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultDescPad = (short) -1;
        helpFormatter0.setNewLine("   ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.defaultDescPad = '#';
        int int12 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (byte) 10, 100, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        helpFormatter0.defaultDescPad = (byte) 10;
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(3);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        helpFormatter0.setLeftPadding(97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        helpFormatter0.defaultDescPad = (short) 10;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(2, "                                                                                                    ", "                                                                          ", options19, "usage: ", true);
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.setSyntaxPrefix("");
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        java.lang.String str13 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter26, 3, "                                   ");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", " ", options17, "   ");
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        helpFormatter0.defaultSyntaxPrefix = "";
        int int14 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        helpFormatter0.defaultNewLine = "--";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 0, "--", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (short) 100, "usage:", "", options15, (int) (byte) 10, (int) (short) -1, "--", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        helpFormatter0.defaultDescPad = 2;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.getNewLine();
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth((int) 'a');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options19, false);
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
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "";
        int int6 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        int int13 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter14.setLongOptPrefix("");
        int int21 = helpFormatter14.findWrapPos("-", (int) '#', 1);
        helpFormatter14.defaultArgName = "hi!";
        java.lang.String str24 = helpFormatter14.defaultArgName;
        java.lang.String str25 = helpFormatter14.getArgName();
        java.lang.String str27 = helpFormatter14.createPadding((int) (short) 1);
        java.util.Comparator comparator28 = helpFormatter14.optionComparator;
        helpFormatter0.setOptionComparator(comparator28);
        java.lang.StringBuffer stringBuffer30 = null;
        org.apache.commons.cli.Options options32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = helpFormatter0.renderOptions(stringBuffer30, 74, options32, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " " + "'", str27, " ");
        org.junit.Assert.assertNotNull(comparator28);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator12 = helpFormatter11.optionComparator;
        helpFormatter11.defaultSyntaxPrefix = "--";
        helpFormatter11.setNewLine("");
        java.lang.String str17 = helpFormatter11.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter18.defaultLeftPad = 100;
        helpFormatter18.setSyntaxPrefix("--");
        int int24 = helpFormatter18.defaultWidth;
        helpFormatter18.setArgName("--");
        java.util.Comparator comparator27 = helpFormatter18.getOptionComparator();
        helpFormatter11.setOptionComparator(comparator27);
        helpFormatter0.optionComparator = comparator27;
        org.apache.commons.cli.Options options32 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "                                                                                                    ", options32, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "", "                                   ", options21, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultLeftPad = (short) 100;
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.lang.String str61 = helpFormatter0.getArgName();
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
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = 52;
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                ", options16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "";
        helpFormatter0.defaultDescPad = 10;
        java.lang.String str17 = helpFormatter0.getArgName();
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setDescPadding((int) (short) 10);
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.setWidth((int) (short) 100);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        helpFormatter0.setWidth((int) (short) 100);
        org.apache.commons.cli.Options options36 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = " ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) 'a', "          ", "                                ", options17, (int) '4', (int) '4', "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix(" ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding((int) 'a');
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.createPadding(0);
        java.lang.String str14 = helpFormatter0.createPadding(0);
        int int15 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultLeftPad = 97;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) '4', "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding(52);
        int int11 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "                                                                                                 ", "   ", options23, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("usage: ");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setArgName("                                                                          ");
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 'a';
        helpFormatter0.defaultLongOptPrefix = "-";
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultSyntaxPrefix = "\n";
        int int11 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 97;
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "", "                                ", options13, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        java.lang.String str20 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                 " + "'", str20, "                                                                                                 ");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        int int16 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 52, "usage:");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(1);
        java.lang.String str12 = helpFormatter0.rtrim("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        helpFormatter0.setDescPadding((int) (byte) 1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "--";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultArgName = "                                                    ";
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, (int) (byte) 10, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        int int15 = helpFormatter0.defaultLeftPad;
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "\n";
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "\n", "--", options22, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "usage:", "arg", options17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding((int) '4');
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = (short) 0;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 100, "", "                                                                          ", options18, (-1), 0, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        int int12 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (byte) -1, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("--");
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (byte) 0, "          ", "                                                    ", options14, 2, (int) (byte) 10, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setArgName(" ");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "\n";
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.Class<?> wildcardClass16 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("usage: ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        int int22 = helpFormatter0.findWrapPos("                                                    ", (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setDescPadding((int) (short) 0);
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setNewLine("usage: ");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                                                            usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                    " + "'", str11, "                                                                                                    ");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        int int13 = helpFormatter0.findWrapPos("                                                    ", 74, (-1));
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) (byte) 1, "\n", "          ", options12, (int) (byte) 100, 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) (short) 10, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        java.lang.String str23 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        helpFormatter0.setOptPrefix("hi!");
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "usage:", "   ", options21, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        usage:");
        } catch (java.lang.RuntimeException e) {
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
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        helpFormatter0.setArgName("   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(74);
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "usage: ", options13, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', " ", "                                                                                                    ", options11, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.setDescPadding(10);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        java.lang.String str37 = helpFormatter0.createPadding((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "                                                                                                 " + "'", str37, "                                                                                                 ");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((-1));
        helpFormatter0.setLeftPadding(0);
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (short) 0, "usage:", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.String str22 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = (byte) -1;
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter25, (int) ' ', options27, 100, (int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "hi!", "   ", options16, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (-1), (int) '#', "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        int int19 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        java.lang.String str32 = helpFormatter0.createPadding(35);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                   " + "'", str32, "                                   ");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        java.io.PrintWriter printWriter33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter33, 2, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(comparator30);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        int int8 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("");
        java.lang.String str12 = helpFormatter0.rtrim("--");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter20, 0, options22, (int) '#', (int) (byte) 10);
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
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        helpFormatter0.setArgName("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setDescPadding((int) (short) 10);
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.setOptPrefix("--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultWidth = (byte) 100;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "arg", "-", options20, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultLongOptPrefix = "-";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        int int15 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, 3, options13, (int) (byte) 10, (int) (short) 1);
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) (byte) 1, "                                                                          ", "--", options12, (int) (byte) 1, (int) ' ', "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        java.lang.String str18 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " " + "'", str18, " ");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        int int6 = helpFormatter0.defaultWidth;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (byte) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.defaultOptPrefix = "   ";
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        int int8 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 0, 1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setArgName("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 74, (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (short) 0);
        helpFormatter0.setNewLine("                                   ");
        helpFormatter0.setLeftPadding(97);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultArgName = "\n";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.createPadding(0);
        java.lang.String str14 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultArgName = "          ";
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        helpFormatter17.setLongOptPrefix("");
        int int24 = helpFormatter17.findWrapPos("-", (int) '#', 1);
        int int25 = helpFormatter17.defaultWidth;
        helpFormatter17.setNewLine("");
        java.lang.String str28 = helpFormatter17.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator30 = helpFormatter29.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator32 = helpFormatter31.optionComparator;
        helpFormatter29.optionComparator = comparator32;
        helpFormatter29.defaultLeftPad = 0;
        java.lang.String str36 = helpFormatter29.defaultLongOptPrefix;
        java.lang.String str37 = helpFormatter29.defaultLongOptPrefix;
        helpFormatter29.setLongOptPrefix("--");
        java.util.Comparator comparator40 = helpFormatter29.getOptionComparator();
        helpFormatter17.setOptionComparator(comparator40);
        helpFormatter0.optionComparator = comparator40;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "--" + "'", str36, "--");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "--" + "'", str37, "--");
        org.junit.Assert.assertNotNull(comparator40);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options35, true);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-" + "'", str33, "-");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = (short) 0;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.getArgName();
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "                                   ";
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultDescPad = (short) -1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        helpFormatter0.setOptPrefix("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.defaultLeftPad = (-1);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultWidth = 10;
        int int6 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 74, "                                                                                                    ", "arg", options11, 3, 52, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        int int21 = helpFormatter0.getWidth();
        int int25 = helpFormatter0.findWrapPos("arg", (int) 'a', (int) (short) -1);
        int int29 = helpFormatter0.findWrapPos("usage:", (int) (byte) 1, (int) (byte) 100);
        java.io.PrintWriter printWriter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter30, (int) (short) 10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        int int13 = helpFormatter0.defaultDescPad;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        java.io.PrintWriter printWriter26 = null;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter26, 1, "   ", "                                                    ", options30, 0, 74, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        helpFormatter0.defaultWidth = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter22, 10, 52, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                     ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        int int13 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter14.setLongOptPrefix("");
        int int21 = helpFormatter14.findWrapPos("-", (int) '#', 1);
        helpFormatter14.defaultArgName = "hi!";
        java.lang.String str24 = helpFormatter14.defaultArgName;
        java.lang.String str25 = helpFormatter14.getArgName();
        java.lang.String str27 = helpFormatter14.createPadding((int) (short) 1);
        java.util.Comparator comparator28 = helpFormatter14.optionComparator;
        helpFormatter0.setOptionComparator(comparator28);
        java.lang.Class<?> wildcardClass30 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " " + "'", str27, " ");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((-1));
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.setLeftPadding((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        int int21 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter30.defaultLeftPad = 100;
        helpFormatter30.setOptPrefix("");
        helpFormatter30.setOptPrefix("usage: ");
        helpFormatter30.defaultNewLine = "hi!";
        helpFormatter30.defaultNewLine = "hi!";
        java.util.Comparator comparator42 = helpFormatter30.getOptionComparator();
        java.lang.String str43 = helpFormatter30.getArgName();
        helpFormatter30.setNewLine("--");
        org.apache.commons.cli.HelpFormatter helpFormatter46 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator47 = helpFormatter46.optionComparator;
        helpFormatter46.setLongOptPrefix("");
        int int53 = helpFormatter46.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str54 = helpFormatter46.defaultOptPrefix;
        java.lang.String str55 = helpFormatter46.defaultNewLine;
        java.lang.String str56 = helpFormatter46.getSyntaxPrefix();
        helpFormatter46.defaultLeftPad = 35;
        org.apache.commons.cli.HelpFormatter helpFormatter59 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator60 = helpFormatter59.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter61 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator62 = helpFormatter61.optionComparator;
        helpFormatter59.optionComparator = comparator62;
        helpFormatter59.defaultLeftPad = 0;
        java.lang.String str66 = helpFormatter59.defaultLongOptPrefix;
        java.lang.String str67 = helpFormatter59.defaultLongOptPrefix;
        helpFormatter59.setLongOptPrefix("--");
        java.util.Comparator comparator70 = helpFormatter59.getOptionComparator();
        helpFormatter46.setOptionComparator(comparator70);
        helpFormatter30.optionComparator = comparator70;
        helpFormatter0.optionComparator = comparator70;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "arg" + "'", str43, "arg");
        org.junit.Assert.assertNotNull(comparator47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "-" + "'", str54, "-");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\n" + "'", str55, "\n");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "usage: " + "'", str56, "usage: ");
        org.junit.Assert.assertNotNull(comparator60);
        org.junit.Assert.assertNotNull(comparator62);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "--" + "'", str66, "--");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "--" + "'", str67, "--");
        org.junit.Assert.assertNotNull(comparator70);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str4 = helpFormatter0.rtrim("arg");
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (byte) 1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.String str8 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setDescPadding(35);
        helpFormatter0.setWidth((int) '4');
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        helpFormatter0.defaultLeftPad = (short) 1;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultArgName = "";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(100);
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        helpFormatter0.defaultWidth = 32;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        int int8 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("");
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.createPadding(74);
        int int15 = helpFormatter0.getLeftPadding();
        java.lang.Class<?> wildcardClass16 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                          " + "'", str14, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "\n", options15, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultOptPrefix = "                                   ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        int int15 = helpFormatter0.defaultLeftPad;
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding(11);
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = helpFormatter0.renderOptions(stringBuffer19, 11, options21, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "   ", options11, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) -1);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "", "                                                                          ", options14, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        helpFormatter0.setNewLine("-");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        helpFormatter16.setLongOptPrefix("");
        int int23 = helpFormatter16.findWrapPos("-", (int) (short) 10, 74);
        java.lang.String str24 = helpFormatter16.defaultOptPrefix;
        java.lang.String str25 = helpFormatter16.defaultNewLine;
        java.lang.String str26 = helpFormatter16.getSyntaxPrefix();
        helpFormatter16.defaultLeftPad = 35;
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator30 = helpFormatter29.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator32 = helpFormatter31.optionComparator;
        helpFormatter29.optionComparator = comparator32;
        helpFormatter29.defaultLeftPad = 0;
        java.lang.String str36 = helpFormatter29.defaultLongOptPrefix;
        java.lang.String str37 = helpFormatter29.defaultLongOptPrefix;
        helpFormatter29.setLongOptPrefix("--");
        java.util.Comparator comparator40 = helpFormatter29.getOptionComparator();
        helpFormatter16.setOptionComparator(comparator40);
        helpFormatter0.optionComparator = comparator40;
        java.lang.String str44 = helpFormatter0.rtrim("arg");
        java.lang.String str45 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage: " + "'", str26, "usage: ");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "--" + "'", str36, "--");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "--" + "'", str37, "--");
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "arg" + "'", str45, "arg");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) ' ', (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator11 = helpFormatter10.optionComparator;
        helpFormatter10.defaultLeftPad = 100;
        helpFormatter10.setSyntaxPrefix("--");
        helpFormatter10.defaultSyntaxPrefix = "hi!";
        helpFormatter10.setLongOptPrefix("arg");
        helpFormatter10.setSyntaxPrefix(" ");
        java.lang.String str22 = helpFormatter10.getLongOptPrefix();
        helpFormatter10.defaultWidth = (byte) 0;
        java.util.Comparator comparator25 = helpFormatter10.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator25);
        java.util.Comparator comparator27 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(100);
        java.lang.String str15 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator17 = helpFormatter16.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator19 = helpFormatter18.optionComparator;
        helpFormatter16.optionComparator = comparator19;
        helpFormatter16.defaultLeftPad = 0;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator24 = helpFormatter23.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator26 = helpFormatter25.optionComparator;
        helpFormatter23.optionComparator = comparator26;
        helpFormatter16.setOptionComparator(comparator26);
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator30 = helpFormatter29.optionComparator;
        java.util.Comparator comparator31 = helpFormatter29.getOptionComparator();
        helpFormatter16.optionComparator = comparator31;
        helpFormatter0.optionComparator = comparator31;
        java.lang.String str35 = helpFormatter0.createPadding(74);
        helpFormatter0.defaultDescPad = (short) 10;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                                                          " + "'", str35, "                                                                          ");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator8 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultArgName = "                                                    ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultWidth = (byte) -1;
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setSyntaxPrefix("\n");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLeftPadding((int) (byte) 0);
        helpFormatter0.setNewLine("                                                                          ");
        helpFormatter0.setNewLine("                                   ");
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = helpFormatter0.renderOptions(stringBuffer19, (int) (byte) 0, options21, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        java.lang.String str18 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 74, "--", "-", options23, (int) (short) -1, 0, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) (byte) 1, 3, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator18 = helpFormatter17.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator20 = helpFormatter19.optionComparator;
        helpFormatter17.optionComparator = comparator20;
        int int22 = helpFormatter17.defaultWidth;
        int int23 = helpFormatter17.getLeftPadding();
        helpFormatter17.defaultLeftPad = 1;
        int int26 = helpFormatter17.defaultDescPad;
        java.lang.String str27 = helpFormatter17.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator29 = helpFormatter28.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator31 = helpFormatter30.optionComparator;
        helpFormatter28.optionComparator = comparator31;
        int int33 = helpFormatter28.defaultWidth;
        helpFormatter28.setSyntaxPrefix("");
        helpFormatter28.setSyntaxPrefix("hi!");
        java.lang.String str38 = helpFormatter28.defaultOptPrefix;
        int int39 = helpFormatter28.defaultLeftPad;
        java.util.Comparator comparator40 = helpFormatter28.optionComparator;
        helpFormatter17.setOptionComparator(comparator40);
        helpFormatter0.setOptionComparator(comparator40);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n" + "'", str27, "\n");
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 74 + "'", int33 == 74);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-" + "'", str38, "-");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(comparator40);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        helpFormatter0.setNewLine("          ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(0);
        int int9 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        helpFormatter0.defaultLeftPad = '#';
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "                                   ", "          ", options20, "hi!");
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        helpFormatter0.defaultNewLine = "";
        java.lang.String str22 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                          " + "'", str22, "                                                                          ");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        int int18 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderWrappedText(stringBuffer21, 35, 11, "                                                                                                 ");
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str7 = helpFormatter0.createPadding(100);
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setDescPadding((int) '#');
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.setNewLine("   ");
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setSyntaxPrefix("--");
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.optionComparator;
        helpFormatter0.setOptionComparator(comparator9);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        helpFormatter0.setWidth((int) (short) 10);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, " ", "\n", options16, "                                ", true);
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        java.lang.String str17 = helpFormatter0.createPadding((int) '4');
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", " ", options20, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                    " + "'", str17, "                                                    ");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.findWrapPos(" ", 100, 100);
        helpFormatter0.defaultNewLine = "";
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = '4';
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        helpFormatter0.defaultWidth = (byte) 10;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (byte) 10);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setNewLine("   ");
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = null;
        helpFormatter0.setOptionComparator(comparator9);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        int int19 = helpFormatter0.findWrapPos("--", (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.setNewLine("   ");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (byte) 0, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        helpFormatter0.defaultDescPad = 32;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultLeftPad = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) '#', 1);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = (byte) 10;
        int int17 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        int int13 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator15 = helpFormatter14.optionComparator;
        helpFormatter14.setLongOptPrefix("");
        int int21 = helpFormatter14.findWrapPos("-", (int) '#', 1);
        helpFormatter14.defaultArgName = "hi!";
        java.lang.String str24 = helpFormatter14.defaultArgName;
        java.lang.String str25 = helpFormatter14.getArgName();
        java.lang.String str27 = helpFormatter14.createPadding((int) (short) 1);
        java.util.Comparator comparator28 = helpFormatter14.optionComparator;
        helpFormatter0.setOptionComparator(comparator28);
        java.lang.String str30 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " " + "'", str27, " ");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "                                                                          " + "'", str30, "                                                                          ");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        java.lang.String str27 = helpFormatter0.defaultOptPrefix;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
            helpFormatter0.printUsage(printWriter28, (int) (byte) 1, " ", options31);
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator3 = helpFormatter2.optionComparator;
        helpFormatter0.optionComparator = comparator3;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.setWidth(2);
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("");
        int int7 = helpFormatter0.findWrapPos("-", (int) (short) 10, 74);
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 100, options14, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter5 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator6 = helpFormatter5.optionComparator;
        helpFormatter5.defaultSyntaxPrefix = "--";
        helpFormatter5.setNewLine("");
        java.lang.String str11 = helpFormatter5.getNewLine();
        java.lang.String str12 = helpFormatter5.getLongOptPrefix();
        int int13 = helpFormatter5.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter14.defaultNewLine = "";
        java.lang.String str17 = helpFormatter14.getLongOptPrefix();
        helpFormatter14.defaultNewLine = "--";
        java.lang.String str20 = helpFormatter14.getArgName();
        helpFormatter14.defaultDescPad = '4';
        helpFormatter14.setLongOptPrefix("--");
        helpFormatter14.setLongOptPrefix("                                                                          ");
        int int27 = helpFormatter14.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator29 = helpFormatter28.optionComparator;
        helpFormatter28.setLongOptPrefix("");
        int int35 = helpFormatter28.findWrapPos("-", (int) '#', 1);
        helpFormatter28.defaultArgName = "hi!";
        java.lang.String str38 = helpFormatter28.defaultArgName;
        java.lang.String str39 = helpFormatter28.getArgName();
        java.lang.String str41 = helpFormatter28.createPadding((int) (short) 1);
        java.util.Comparator comparator42 = helpFormatter28.optionComparator;
        helpFormatter14.setOptionComparator(comparator42);
        helpFormatter5.setOptionComparator(comparator42);
        helpFormatter0.setOptionComparator(comparator42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " " + "'", str41, " ");
        org.junit.Assert.assertNotNull(comparator42);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = '#';
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                   ";
        helpFormatter0.defaultSyntaxPrefix = " ";
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        helpFormatter0.defaultLeftPad = (byte) 0;
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        int int16 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 0, (int) (byte) -1, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "usage:", "          ", options16, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                           usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }
}

