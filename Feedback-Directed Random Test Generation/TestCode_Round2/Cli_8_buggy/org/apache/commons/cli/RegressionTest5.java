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
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("--");
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) -1, "                                ", "      ", options17, (int) 'a', (int) (short) 100, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultLeftPad = 35;
        helpFormatter0.defaultArgName = "";
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.setArgName("                                   ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
            helpFormatter0.printWrapped(printWriter25, 74, 7, "    ");
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
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.defaultWidth = 97;
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 3, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.defaultDescPad;
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, (int) (byte) -1, 1, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding((-1));
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("arg");
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str11 = helpFormatter0.createPadding((int) 'a');
        java.lang.String str13 = helpFormatter0.createPadding(3);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "\n", options16, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 " + "'", str11, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "   " + "'", str13, "   ");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(7);
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setWidth(35);
        java.lang.String str10 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) (byte) 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 100, (int) (byte) 0, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        int int19 = helpFormatter0.findWrapPos("                                   ", 10, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (short) 10, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setArgName(" ");
        helpFormatter0.defaultLeftPad = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultDescPad = 3;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding(84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        helpFormatter0.setOptPrefix("                                                                                                    ");
        java.lang.Class<?> wildcardClass19 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLongOptPrefix = "usage:";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                                                                  ", options16, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 4, "      ", "                                                                                                    ", options15, (int) '4', 52, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "--";
        helpFormatter0.defaultWidth = 0;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setOptPrefix("                                ");
        int int17 = helpFormatter0.findWrapPos("-", 6, 97);
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 6, options20, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "arg";
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        helpFormatter0.setArgName("                                                    ");
        helpFormatter0.setArgName("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                 " + "'", str20, "                                                                                                 ");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.rtrim("usage:");
        int int9 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage:" + "'", str8, "usage:");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.setDescPadding(10);
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, 7, 84, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setNewLine("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        helpFormatter0.defaultLongOptPrefix = "    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                 " + "'", str17, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                 " + "'", str18, "                                                                                                 ");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.lang.String str19 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "    ", "hi!", options23, "                                                                                                  ");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "arg";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                  ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        int int18 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.defaultNewLine = "-";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.rtrim("--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        int int7 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        int int10 = helpFormatter0.findWrapPos("arg", (int) (short) 100, (-1));
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (short) 100, "-", "                                                                                                 ", options15, 10, (int) ' ', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str15 = helpFormatter0.defaultArgName;
        int int16 = helpFormatter0.defaultLeftPad;
        int int17 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultWidth = '4';
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 4, options11, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setNewLine("      ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(7, "", " ", options20, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "                                                                                                 ", options11, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        int int24 = helpFormatter0.findWrapPos("", (int) 'a', (int) (byte) -1);
        helpFormatter0.defaultLeftPad = '4';
        java.lang.String str27 = helpFormatter0.getLongOptPrefix();
        java.lang.String str28 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.defaultDescPad = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage:" + "'", str20, "usage:");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                                                          " + "'", str28, "                                                                          ");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) (byte) -1);
        helpFormatter0.defaultLeftPad = ' ';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = (short) -1;
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding((int) '4');
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(32, "hi!", "                                                                                                  ", options17, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultSyntaxPrefix = "--";
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, 32, options11, 84, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("                                                                                                 ");
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, (int) (byte) 0, "                                                                                                    ");
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
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        int int21 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("          ");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (byte) 1;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, 35, "                                                                                                 ", " ", options12, 67, (int) '4', "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        helpFormatter0.setDescPadding((int) '4');
        int int21 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        int int19 = helpFormatter0.findWrapPos(" ", 100, (int) (short) -1);
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str22 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                    " + "'", str22, "                                                                                                    ");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultDescPad = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = " ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        int int10 = helpFormatter0.findWrapPos("arg", (int) (short) 100, (-1));
        helpFormatter0.defaultNewLine = "   ";
        java.lang.String str14 = helpFormatter0.rtrim("    ");
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, 0, options17, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int19 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, 52, "                                                                                                  ", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        int int9 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, (int) (byte) 0, options11, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.defaultArgName = "-";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        java.lang.String str16 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultWidth = 97;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "\n";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str18 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = 3;
        java.lang.String str11 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                " + "'", str8, "                                ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) (byte) 1, "          ");
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
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.setDescPadding((int) (short) 10);
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "arg", "                                                                                                  ", options19, "                                                                                                  ", false);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                ");
        helpFormatter0.setDescPadding(10);
        helpFormatter0.setNewLine("");
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 0, (int) (byte) 1, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        int int18 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(32);
        helpFormatter0.defaultLeftPad = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        int int9 = helpFormatter0.defaultWidth;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("                                                    ");
        helpFormatter0.defaultDescPad = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 74, "-", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.setNewLine("                                                                                                    ");
        int int20 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultOptPrefix = "   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "arg";
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 1, (int) (byte) 100, "   ");
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.defaultArgName = "\n";
        int int21 = helpFormatter0.findWrapPos("\n", 32, 100);
        java.lang.String str22 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter23, 84, (int) (byte) 0, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setWidth(6);
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultSyntaxPrefix = "--";
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        helpFormatter0.setLongOptPrefix(" ");
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "-", options14, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        helpFormatter0.setLongOptPrefix("                                                                          ");
        int int16 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (int) (byte) -1, "\n", "      ", options21, (int) (short) 0, 10, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        helpFormatter0.setWidth(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.defaultOptPrefix = "--";
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        helpFormatter0.defaultOptPrefix = "                                                                                                  ";
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, (int) 'a', "                                                                          ");
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
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "\n", options9, "    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.lang.String str12 = helpFormatter0.rtrim("          ");
        int int13 = helpFormatter0.defaultDescPad;
        java.lang.String str14 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) ' ', "", "arg", options20, (int) '#', 0, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setNewLine("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("                                                                                                    ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int10 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("-", 1, 0);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int8 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderWrappedText(stringBuffer8, 97, (int) '4', "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        int int12 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          " + "'", str10, "          ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        helpFormatter0.setWidth((int) ' ');
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, (int) (short) 100, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        helpFormatter0.defaultOptPrefix = "usage:";
        java.lang.String str27 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str33 = helpFormatter0.rtrim("-");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                          " + "'", str27, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-" + "'", str33, "-");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.lang.String str23 = helpFormatter0.getOptPrefix();
        int int24 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                 " + "'", str23, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 6;
        java.lang.String str8 = helpFormatter0.rtrim("\n");
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        java.lang.String str17 = helpFormatter0.createPadding(0);
        int int18 = helpFormatter0.defaultWidth;
        java.lang.String str19 = helpFormatter0.defaultArgName;
        java.lang.String str20 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        int int11 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "      ", options14, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(74);
        helpFormatter0.setLongOptPrefix("                                ");
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setLongOptPrefix("--");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(4, " ", "    ", options19, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str5 = helpFormatter0.createPadding(100);
        int int6 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        int int18 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (byte) 10;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (byte) 10, "usage: ");
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
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        helpFormatter0.defaultNewLine = "                                                                                                  ";
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        helpFormatter0.defaultWidth = 0;
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "\n";
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) (byte) 0, (int) '#', "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultLeftPad = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 3;
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        int int19 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass20 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str11 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultOptPrefix = " ";
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 " + "'", str11, "                                                                                                 ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultNewLine = "          ";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, (int) (short) 100, options17, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        int int10 = helpFormatter0.defaultLeftPad;
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 67, "                                   ", "", options11, 84, 1, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(98, "                                                                                                    ", "hi!", options15, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                          " + "'", str11, "                                                                          ");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        int int17 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultDescPad = (short) 100;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.setDescPadding(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultLeftPad = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        int int17 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str7 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.setSyntaxPrefix("usage:");
        helpFormatter0.setLongOptPrefix("--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 " + "'", str7, "                                                                                                 ");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setSyntaxPrefix("\n");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("                                                    ");
        helpFormatter0.defaultWidth = 97;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultLeftPad;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 98, 6, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        int int19 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "usage:";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 6, "-", options16);
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
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        int int18 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                          ");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((-1));
        helpFormatter0.defaultDescPad = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                          " + "'", str8, "                                                                          ");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("          ");
        helpFormatter0.setLongOptPrefix("usage: ");
        int int15 = helpFormatter0.findWrapPos("usage: ", 74, (int) (short) 10);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) (short) 0, "hi!", "                                                                                                 ", options20, (int) (byte) -1, 84, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.defaultSyntaxPrefix = "   ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "hi!", options11, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                  ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str20 = helpFormatter0.rtrim("");
        helpFormatter0.defaultArgName = "                                                    ";
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(7, "                                                                                                  ", "", options26, "   ");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str20 = helpFormatter0.rtrim("");
        helpFormatter0.defaultArgName = "                                                    ";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        java.lang.String str7 = helpFormatter0.rtrim("usage: ");
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.rtrim("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage:" + "'", str7, "usage:");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderOptions(stringBuffer16, 32, options18, (int) (short) 0, 0);
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        int int16 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.defaultNewLine = "";
        java.lang.String str20 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.findWrapPos("                                                                          ", 3, 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) (byte) 10, "          ", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        helpFormatter0.setLeftPadding(0);
        int int26 = helpFormatter0.findWrapPos("      ", (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        java.lang.String str16 = helpFormatter0.rtrim("");
        helpFormatter0.setLeftPadding((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("          ");
        helpFormatter0.setOptPrefix("hi!");
        int int12 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str17 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.defaultDescPad = (byte) 1;
        helpFormatter0.setLongOptPrefix("      ");
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setLeftPadding(3);
        int int16 = helpFormatter0.findWrapPos("--", 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = ' ';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        helpFormatter0.setWidth((int) (short) 100);
        int int10 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) 10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = 3;
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultDescPad = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                " + "'", str8, "                                ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 97, "                                                                                                 ", "arg", options11, 98, 7, "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 3, "arg", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        helpFormatter0.defaultWidth = (byte) -1;
        helpFormatter0.setLongOptPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str15 = helpFormatter0.defaultArgName;
        int int16 = helpFormatter0.defaultLeftPad;
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, (int) (byte) 100, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        helpFormatter0.defaultLongOptPrefix = "                                ";
        helpFormatter0.setOptPrefix("      ");
        helpFormatter0.defaultLongOptPrefix = "          ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "    ";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 4, 32, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.setOptPrefix("                                                                                                 ");
        int int11 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultArgName = "-";
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultWidth = 'a';
        helpFormatter0.setOptPrefix("   ");
        helpFormatter0.defaultLeftPad = 97;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str22 = helpFormatter0.defaultOptPrefix;
        int int23 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("          ");
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.lang.String str8 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) '#', "                                                                                                    ", "arg", options13, (int) (short) 100, 1, "                                                                                                    ", true);
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
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        int int10 = helpFormatter0.getDescPadding();
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.defaultLeftPad = (byte) -1;
        helpFormatter0.setNewLine("                                                                          ");
        int int13 = helpFormatter0.getLeftPadding();
        java.lang.String str15 = helpFormatter0.createPadding((int) (short) 0);
        helpFormatter0.setWidth(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                  ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultWidth = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultNewLine = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.createPadding(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   " + "'", str10, "                                   ");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        int int10 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultDescPad = (short) -1;
        int int13 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        helpFormatter0.setWidth((int) (short) 10);
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultLongOptPrefix = "-";
        int int22 = helpFormatter0.findWrapPos("                                                                                                  ", (int) (short) -1, 74);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73 + "'", int22 == 73);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = " ";
        helpFormatter0.defaultArgName = "      ";
        helpFormatter0.defaultNewLine = " ";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "hi!", options16, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.createPadding(3);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "   " + "'", str11, "   ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        helpFormatter0.setDescPadding(0);
        java.lang.String str18 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, 84, "arg");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setDescPadding(3);
        helpFormatter0.defaultDescPad = ' ';
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        helpFormatter0.defaultNewLine = "-";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(73, "\n", "", options19, " ", true);
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
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str20 = helpFormatter0.rtrim("");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int26 = helpFormatter0.findWrapPos("\n", 10, (int) ' ');
        helpFormatter0.setLeftPadding(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setWidth(6);
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultLeftPad = (short) 10;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = 0;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(67, "                                   ", "                                                                          ", options15, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 10);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(74);
        int int15 = helpFormatter0.findWrapPos("                                                                          ", (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        int int15 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 0);
        java.lang.String str16 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", " ", options10, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        java.lang.String str17 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        java.lang.String str19 = helpFormatter0.createPadding((int) '4');
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter20, 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                    " + "'", str19, "                                                    ");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        java.lang.String str7 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.findWrapPos("          ", (int) (byte) 10, (int) (byte) 10);
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 32, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("          ");
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, 0, " ", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "arg";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "   ", "    ", options13, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "\n";
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        helpFormatter0.setLongOptPrefix("--");
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter20, 0, options22, (int) (byte) 100, (int) '4');
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setArgName("                                                                          ");
        java.lang.String str17 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.setArgName("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                                                 ");
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (short) 100, 84, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        helpFormatter0.setWidth(67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "usage:", options11, " ", false);
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.createPadding(0);
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("-");
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.setWidth(10);
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        int int18 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter5, (int) (byte) 1, options7, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.defaultLongOptPrefix = "      ";
        int int8 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.findWrapPos("    ", 98, (int) (short) 1);
        int int17 = helpFormatter0.findWrapPos("", (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        helpFormatter0.defaultArgName = "   ";
        helpFormatter0.setLeftPadding(84);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, (int) ' ', (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.createPadding((int) 'a');
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "      ", "", options16, "    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 " + "'", str8, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth(6);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 32, (int) (byte) 100, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.setArgName("\n");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultDescPad;
        int int12 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLeftPadding(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (int) (byte) 10, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, 32, "                                   ", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "    ";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 73, options15, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding(97);
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options22, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        helpFormatter0.setWidth((int) (short) 1);
        helpFormatter0.setDescPadding(74);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderOptions(stringBuffer7, (int) (short) 0, options9, 74, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str14 = helpFormatter0.createPadding(10);
        int int15 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 67, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        int int15 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("    ", "   ", options18, "                                                                          ");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        int int14 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.setWidth(7);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.defaultWidth = 97;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 98, "                                                                          ", "arg", options18, (-1), 32, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, (int) (byte) 0, options19, 32, 74);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultWidth = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str16 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "          ", options19, "\n", false);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "                                                                                                 ", "usage:", options11, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.rtrim("usage:");
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage:" + "'", str8, "usage:");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        int int25 = helpFormatter0.defaultDescPad;
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(10);
        helpFormatter0.setLongOptPrefix("          ");
        int int19 = helpFormatter0.findWrapPos("\n", 74, 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setOptPrefix("usage:");
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "arg";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.defaultLongOptPrefix = "usage:";
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        int int18 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int10 = helpFormatter0.findWrapPos("", 74, 74);
        java.lang.String str12 = helpFormatter0.createPadding(0);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) 'a', options15, (int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        int int13 = helpFormatter0.findWrapPos("", (int) (byte) 0, (int) '#');
        helpFormatter0.defaultArgName = "--";
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 98, "--", "hi!", options20, 32, 52, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.setLeftPadding(10);
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("\n");
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.lang.String str17 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 7, options20, 98, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        int int12 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultNewLine = "      ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "                                                    ";
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str18 = helpFormatter0.getNewLine();
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, (int) (short) 10, (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                    " + "'", str18, "                                                    ");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "arg", options10, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "--";
        int int18 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options20, true);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        helpFormatter0.setNewLine("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.setLeftPadding((int) ' ');
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 100, "-", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (short) 0;
        int int18 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        java.lang.String str21 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage:" + "'", str20, "usage:");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        helpFormatter0.setSyntaxPrefix(" ");
        int int19 = helpFormatter0.getWidth();
        int int20 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 74, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setWidth(6);
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (short) -1, "arg", "arg", options15, (int) (short) 100, (-1), "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        int int18 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setDescPadding(3);
        helpFormatter0.defaultDescPad = ' ';
        int int14 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 0, options17, 4, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        int int22 = helpFormatter0.findWrapPos(" ", (int) (byte) 10, (int) (short) 100);
        int int23 = helpFormatter0.getWidth();
        java.lang.String str24 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "--" + "'", str24, "--");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str20 = helpFormatter0.defaultSyntaxPrefix;
        int int21 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setLongOptPrefix("      ");
        int int13 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 3, "                                                    ", "                                   ", options18, 4, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(74);
        helpFormatter0.setLongOptPrefix("                                ");
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str16 = helpFormatter0.getArgName();
        int int17 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        helpFormatter0.defaultArgName = "hi!";
        int int19 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        java.lang.String str25 = helpFormatter0.rtrim("\n");
        java.lang.String str26 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage:" + "'", str20, "usage:");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("          ");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) 'a', (int) '#', "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        helpFormatter0.setWidth((int) ' ');
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (int) (short) 100, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "\n", options11, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) (byte) -1, " ", options15);
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
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        int int18 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int10 = helpFormatter0.findWrapPos("", 74, 74);
        int int14 = helpFormatter0.findWrapPos("arg", (int) (short) -1, 97);
        int int15 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, 74, options18, 6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        helpFormatter0.setNewLine("\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, 32, options20, 4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding((int) (short) 1);
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.lang.String str20 = helpFormatter0.getArgName();
        helpFormatter0.setOptPrefix("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(3);
        helpFormatter0.setDescPadding((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int13 = helpFormatter0.findWrapPos("      ", 7, (int) '#');
        java.lang.String str14 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 7, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("                                                                                                    ");
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLeftPad = 74;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options18, true);
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
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.setWidth(100);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "hi!", options14, "usage: ", false);
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
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                          " + "'", str10, "                                                                          ");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = ' ';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.defaultDescPad = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        helpFormatter0.defaultWidth = (byte) -1;
        helpFormatter0.setArgName("hi!");
        java.lang.String str23 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultLeftPad = (byte) -1;
        helpFormatter0.setDescPadding((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.setOptPrefix("                                                                          ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        java.lang.String str20 = helpFormatter0.getOptPrefix();
        int int21 = helpFormatter0.defaultLeftPad;
        java.lang.String str22 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        java.lang.String str7 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "      ";
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("          ");
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.setDescPadding(10);
        helpFormatter0.defaultLeftPad = ' ';
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, 0, "                                                    ", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 1, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int8 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 4, "", "                                                                                                    ", options13, 6, (int) (byte) 1, "      ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int16 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (byte) 0, (int) (byte) 0);
        int int21 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultNewLine = "   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("arg");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 4, options14, (int) ' ', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth(67);
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 10);
        int int10 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding((-1));
        helpFormatter0.defaultLeftPad = (short) -1;
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = 73;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        int int12 = helpFormatter0.findWrapPos("", 0, 7);
        int int16 = helpFormatter0.findWrapPos("                                                                                                 ", (int) ' ', 35);
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 67 + "'", int16 == 67);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        helpFormatter0.setDescPadding((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        int int17 = helpFormatter0.getWidth();
        java.lang.String str18 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("                                                                          ");
        int int12 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.setOptPrefix("                                                                                                 ");
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.defaultArgName = "\n";
        int int21 = helpFormatter0.findWrapPos("\n", 32, 100);
        java.lang.String str22 = helpFormatter0.defaultOptPrefix;
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.defaultDescPad = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        int int17 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = " ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        int int14 = helpFormatter0.findWrapPos("", (int) (byte) 0, (int) ' ');
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.setLeftPadding(10);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) ' ', "                                                                                                  ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        int int13 = helpFormatter0.findWrapPos("", (int) (byte) 0, (int) '#');
        helpFormatter0.defaultArgName = "--";
        int int16 = helpFormatter0.getLeftPadding();
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "-", options13, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.setOptPrefix("                                                                                                 ");
        int int11 = helpFormatter0.defaultLeftPad;
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("                                                                                                  ");
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        int int22 = helpFormatter0.findWrapPos(" ", (int) (byte) 10, (int) (short) 100);
        helpFormatter0.defaultArgName = "                                                                          ";
        int int25 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter26 = null;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter26, 52, "          ", "                                                                          ", options30, (int) (byte) -1, (int) (byte) 1, "                                                                                                    ");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultOptPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultLeftPad = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                    " + "'", str11, "                                                                                                    ");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.defaultOptPrefix = "          ";
        helpFormatter0.setLeftPadding((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultArgName = "\n";
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                ");
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int17 = helpFormatter0.findWrapPos("                                   ", 4, (int) ' ');
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setArgName("");
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setArgName("                                   ");
        helpFormatter0.setWidth(98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setDescPadding(3);
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding(74);
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str11 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        int int3 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        int int12 = helpFormatter0.findWrapPos("-", 100, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth(73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        int int17 = helpFormatter0.getWidth();
        helpFormatter0.setArgName("usage:");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str15 = helpFormatter0.defaultArgName;
        int int16 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "                                                                          ", "                                                                                                    ", options20, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        int int15 = helpFormatter0.findWrapPos("                                                                          ", (int) '4', 35);
        helpFormatter0.setLongOptPrefix("usage: ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", " ", options20, "    ");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        helpFormatter0.setDescPadding(67);
        java.lang.String str20 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        java.lang.String str16 = helpFormatter0.rtrim("");
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 7, "                                                    ", "arg", options21, 35, 0, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.defaultNewLine = "--";
        int int14 = helpFormatter0.getLeftPadding();
        int int15 = helpFormatter0.getWidth();
        java.lang.String str16 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        helpFormatter0.defaultWidth = (byte) -1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultWidth = '4';
        java.lang.String str25 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 1;
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.setLongOptPrefix("    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        int int9 = helpFormatter0.defaultWidth;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 10);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) (short) 10, "          ", "      ", options18, (int) (byte) 100, 0, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultSyntaxPrefix = " ";
        int int19 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 0;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) (byte) 0, (int) (byte) 1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((-1));
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultWidth = (byte) -1;
        int int20 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth((int) (byte) 10);
        helpFormatter0.defaultLeftPad = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, (int) ' ', (int) 'a', "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        java.lang.String str19 = helpFormatter0.getArgName();
        helpFormatter0.setSyntaxPrefix("                                ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding(1);
        int int8 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                  ", "   ", options11, "                                                                                                  ", false);
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
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine(" ");
        int int17 = helpFormatter0.findWrapPos("\n", 74, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        int int18 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int10 = helpFormatter0.findWrapPos("", 74, 74);
        int int14 = helpFormatter0.findWrapPos("arg", (int) (short) -1, 97);
        int int15 = helpFormatter0.getLeftPadding();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderOptions(stringBuffer16, 0, options18, 3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, 0, "          ", "                                                                                                 ", options10, (int) (byte) -1, (-1), "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        java.lang.String str24 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultDescPad = 52;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "          " + "'", str24, "          ");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setNewLine("-");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) (byte) 10, (int) (short) 100, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultLeftPad = 6;
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
        int int22 = helpFormatter0.findWrapPos(" ", (int) (byte) 10, (int) (short) 100);
        helpFormatter0.defaultArgName = "                                                                          ";
        int int25 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter26 = null;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter26, 67, "                                                                                                 ", "                                ", options30, 3, (int) (byte) 100, "                                                                                                  ");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setNewLine("          ");
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.rtrim("usage: ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        java.lang.String str16 = helpFormatter0.rtrim("");
        java.lang.String str18 = helpFormatter0.createPadding((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "          " + "'", str18, "          ");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.setDescPadding(97);
        helpFormatter0.defaultNewLine = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        int int12 = helpFormatter0.findWrapPos("", 0, 7);
        int int16 = helpFormatter0.findWrapPos("                                                                                                 ", (int) ' ', 35);
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 6, "    ", "                                                    ", options21, (int) '4', 98, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 67 + "'", int16 == 67);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.defaultLeftPad = (byte) 0;
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 73, options20, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        java.lang.String str18 = helpFormatter0.defaultArgName;
        java.lang.String str19 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setOptPrefix("usage:");
        int int9 = helpFormatter0.getWidth();
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str11 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str14 = helpFormatter0.createPadding(10);
        int int15 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 100, "                                ", "usage: ", options20, (int) (byte) 1, (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str20 = helpFormatter0.rtrim("");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int26 = helpFormatter0.findWrapPos("\n", 10, (int) ' ');
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("");
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.setDescPadding(0);
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.findWrapPos("    ", 98, (int) (short) 1);
        java.lang.String str15 = helpFormatter0.rtrim("-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, (int) (byte) 10, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.getDescPadding();
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str23 = helpFormatter0.defaultArgName;
        int int24 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                          " + "'", str23, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "--";
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.getDescPadding();
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        int int12 = helpFormatter0.findWrapPos("", (int) (byte) 0, 84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str2 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = helpFormatter0.renderOptions(stringBuffer3, 67, options5, (int) (byte) -1, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        helpFormatter0.defaultLeftPad = 4;
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setLeftPadding((int) '#');
        helpFormatter0.setDescPadding(0);
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 52, 4, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        java.lang.String str25 = helpFormatter0.getNewLine();
        java.lang.String str27 = helpFormatter0.createPadding((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " " + "'", str27, " ");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix(" ");
        helpFormatter0.defaultLeftPad = 32;
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (byte) 100, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        helpFormatter0.setLongOptPrefix("usage: ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.createPadding((int) (short) 100);
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                    " + "'", str11, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        int int25 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                          " + "'", str22, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(1);
        int int17 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (short) 10, 100, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        int int12 = helpFormatter0.findWrapPos("          ", 35, (int) (short) 0);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                                                                                  ", options16, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(52);
        helpFormatter0.defaultArgName = "                                                                          ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.setWidth(3);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.setDescPadding((int) (short) 10);
        helpFormatter0.defaultLeftPad = (short) -1;
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultDescPad = ' ';
        int int14 = helpFormatter0.defaultLeftPad;
        int int15 = helpFormatter0.getDescPadding();
        helpFormatter0.setWidth(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(10);
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "-";
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          " + "'", str17, "          ");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "--";
        int int10 = helpFormatter0.findWrapPos("-", (-1), 100);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        java.lang.String str20 = helpFormatter0.defaultNewLine;
        java.lang.String str21 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        helpFormatter0.setWidth(35);
        int int23 = helpFormatter0.findWrapPos("                                                                          ", (int) (short) 10, 35);
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "arg", "\n", options27, "          ");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 45 + "'", int23 == 45);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding((-1));
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str12 = helpFormatter0.createPadding(100);
        helpFormatter0.setDescPadding(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.setWidth(3);
        java.lang.String str13 = helpFormatter0.rtrim("-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str7 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultWidth = 'a';
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("usage:");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 " + "'", str7, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 0, "-", options15);
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "arg";
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 'a';
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage:", options9, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        helpFormatter0.defaultWidth = 'a';
        helpFormatter0.setLongOptPrefix("                                                    ");
        java.lang.String str23 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = helpFormatter0.renderOptions(stringBuffer3, 45, options5, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setArgName("--");
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = helpFormatter0.renderOptions(stringBuffer22, 74, options24, 0, 0);
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
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) ' ', (int) (short) 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter6, (int) (byte) 10, options8, (int) '#', 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setArgName(" ");
        java.lang.String str10 = helpFormatter0.createPadding(6);
        helpFormatter0.setArgName("      ");
        int int13 = helpFormatter0.getLeftPadding();
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "      " + "'", str10, "      ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        int int15 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        helpFormatter0.setLeftPadding(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.String str7 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "      ", options10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, 0, (int) (short) 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        java.lang.String str20 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        java.lang.String str10 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                             ", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.setDescPadding((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        helpFormatter0.defaultNewLine = "                                                                                                  ";
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("arg");
        int int12 = helpFormatter0.getLeftPadding();
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.defaultArgName;
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str17 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("                                                    ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "                                                                                                  ", "\n", options20, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        int int10 = helpFormatter0.findWrapPos("arg", (int) (short) 100, (-1));
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        int int16 = helpFormatter0.getWidth();
        int int17 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        helpFormatter0.setWidth(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str20 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderWrappedText(stringBuffer16, 52, 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        helpFormatter0.defaultLeftPad = '4';
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        java.lang.String str19 = helpFormatter0.defaultArgName;
        int int20 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int10 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str15 = helpFormatter0.rtrim("      ");
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, 98, "arg", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                " + "'", str10, "                                ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str17 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, (int) (short) 0, options20, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        java.lang.String str26 = helpFormatter0.createPadding(74);
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                                          " + "'", str26, "                                                                          ");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("arg");
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        int int17 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) (byte) 100, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }
}

