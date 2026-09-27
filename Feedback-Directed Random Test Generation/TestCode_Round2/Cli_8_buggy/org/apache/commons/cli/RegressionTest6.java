package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.rtrim("                                ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                  ", "                                                                                                 ", options10, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        int int15 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 0);
        java.lang.String str16 = helpFormatter0.getNewLine();
        int int20 = helpFormatter0.findWrapPos("", 35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultDescPad = 6;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        int int19 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.createPadding(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                 " + "'", str21, "                                                                                                 ");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        helpFormatter0.setArgName("--");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        java.lang.String str19 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setLeftPadding(1);
        java.lang.String str14 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        helpFormatter0.setDescPadding(3);
        int int23 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter24, 32, "                                             ");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        helpFormatter0.setArgName("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        int int16 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setOptPrefix("      ");
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        helpFormatter0.defaultLongOptPrefix = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getDescPadding();
        int int15 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = (-1);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) -1, "                                   ", "--", options17, 84, 4, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = '#';
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultOptPrefix = "                                                                                                  ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str18 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (int) (short) 0, "    ");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                                                  ", options10, "    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "          " + "'", str7, "          ");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 32, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.setLeftPadding((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding((int) (short) 1);
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "                                ", "-", options25, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, (int) (byte) 100, "                                                                                                  ", "                                                                          ", options22, (int) '#', 1, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultLeftPad = 7;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "usage: ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "\n";
        helpFormatter0.setWidth(98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("-");
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) '4', "usage: ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 6;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = " ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.defaultDescPad = 97;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "\n", options14, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter3, (int) (short) 100, (int) ' ', "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.getNewLine();
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultNewLine = "          ";
        helpFormatter0.setArgName("                                ");
        helpFormatter0.defaultDescPad = 100;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((-1));
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "      ", options15, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        int int8 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultNewLine = "                                   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        int int7 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        java.lang.String str17 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.setOptPrefix("");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "                                   ", options15, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = (short) 1;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 10, options13, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLeftPad = (short) 0;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "          ", "arg", options15, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int10 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("hi!");
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, (int) (short) 0, options10, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.createPadding(3);
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "   " + "'", str11, "   ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 67;
        helpFormatter0.defaultLeftPad = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        helpFormatter0.setArgName("--");
        int int19 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = (short) -1;
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        helpFormatter0.defaultNewLine = "                                   ";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 0;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 67, "    ", "                                   ", options14, 6, (int) 'a', "                                                    ");
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
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("          ");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 98, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderOptions(stringBuffer20, 1, options22, (int) (short) 1, 0);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        java.lang.String str12 = helpFormatter0.rtrim("usage: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                          " + "'", str12, "                                                                          ");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("");
        helpFormatter0.defaultNewLine = "   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        int int15 = helpFormatter0.getLeftPadding();
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        int int22 = helpFormatter0.defaultWidth;
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "      " + "'", str20, "      ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "      " + "'", str21, "      ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultLeftPad;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("");
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        helpFormatter0.setArgName("--");
        int int19 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix(" ");
        helpFormatter0.setDescPadding(100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str11 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(84, "    ", "", options17, "                                                                                                    ");
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
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 1, options12, 67, (int) (short) 10);
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
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        helpFormatter0.setDescPadding(3);
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setWidth(6);
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.setLeftPadding(35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        helpFormatter0.defaultLongOptPrefix = "";
        int int23 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = (byte) 100;
        int int7 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultDescPad = ' ';
        int int14 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(7, "                                                                                                  ", "--", options18, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultDescPad = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultNewLine = "   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str7 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.setSyntaxPrefix("usage:");
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 " + "'", str7, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(10);
        helpFormatter0.setArgName("                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = 0;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        java.lang.String str19 = helpFormatter0.rtrim("arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.setNewLine("                                                                                                 ");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "      ";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) 'a', "\n", "\n", options19, (int) (short) 10, 97, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setArgName("                                                                          ");
        int int12 = helpFormatter0.getWidth();
        java.lang.String str14 = helpFormatter0.rtrim("                                ");
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.setWidth((int) (byte) 100);
        java.lang.String str20 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        java.lang.String str22 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "      " + "'", str21, "      ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setDescPadding(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultWidth = 'a';
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("      ");
        helpFormatter0.setWidth(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        int int16 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setOptPrefix("      ");
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        int int12 = helpFormatter0.defaultLeftPad;
        int int13 = helpFormatter0.getWidth();
        int int14 = helpFormatter0.defaultLeftPad;
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "", "          ", options20, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, (int) (short) -1, "                                                                                                    ", options24);
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
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("                                                                          ");
        helpFormatter0.defaultNewLine = "      ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        int int9 = helpFormatter0.getWidth();
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        int int23 = helpFormatter0.getDescPadding();
        int int24 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.setOptPrefix("-");
        int int13 = helpFormatter0.findWrapPos(" ", (int) (byte) 1, 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        helpFormatter0.defaultSyntaxPrefix = "    ";
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        int int21 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("usage: ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(67, "                                                                                                  ", "", options14, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultNewLine = "\n";
        helpFormatter0.defaultNewLine = "usage: ";
        java.lang.String str13 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setArgName("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        helpFormatter0.defaultDescPad = (byte) 10;
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter20, 52, "                                                                                                  ", "usage:", options24, (int) 'a', 74, "                                             ", true);
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
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultWidth;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, 32, options16, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        int int16 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = 7;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) (byte) 100, "                                                                                                  ", "                                                                                                    ", options12, 0, (int) 'a', "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        helpFormatter0.defaultDescPad = 4;
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 0, "arg", "", options21, (int) ' ', (int) '#', "    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.setArgName(" ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        int int14 = helpFormatter0.findWrapPos("usage:", 32, 10);
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setOptPrefix(" ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = 32;
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setLongOptPrefix(" ");
        helpFormatter0.setSyntaxPrefix("usage:");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 97, 32, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str5 = helpFormatter0.createPadding(100);
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultNewLine = "usage:";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.setDescPadding((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        java.lang.String str20 = helpFormatter0.getOptPrefix();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "usage:", options10, "                                             ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "          " + "'", str7, "          ");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.setLeftPadding((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "   ";
        helpFormatter0.setLeftPadding((int) (byte) 1);
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        helpFormatter0.setOptPrefix(" ");
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "usage:", "                                                                          ", options19, "--", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 103");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("-", 1, 0);
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int16 = helpFormatter0.findWrapPos("      ", 35, (int) (short) 1);
        helpFormatter0.setLeftPadding(100);
        int int19 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setDescPadding(3);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setDescPadding(67);
        helpFormatter0.defaultLongOptPrefix = "    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("      ");
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, (int) (short) 1, options11, 52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.defaultArgName = "hi!";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "                                                                                                  ", options13, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str14 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) '4', "                                                                                                  ", "                                                    ", options19, 35, 45, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        helpFormatter0.defaultWidth = (short) 1;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultOptPrefix = "          ";
        helpFormatter0.setOptPrefix("usage: ");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("          ");
        int int10 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding((int) (short) 1);
        helpFormatter0.defaultArgName = "   ";
        helpFormatter0.setDescPadding(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "-";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.createPadding((int) 'a');
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "usage:";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 " + "'", str8, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine(" ");
        int int14 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        helpFormatter0.defaultLeftPad = 84;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                 " + "'", str17, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                 " + "'", str18, "                                                                                                 ");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setNewLine("      ");
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        helpFormatter0.setDescPadding(10);
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options25, true);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "--";
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage:" + "'", str11, "usage:");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.createPadding((int) ' ');
        helpFormatter0.setOptPrefix("");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                " + "'", str11, "                                ");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        int int10 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultDescPad = 73;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (byte) 10);
        helpFormatter0.defaultNewLine = "    ";
        int int14 = helpFormatter0.findWrapPos("          ", 35, 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(6, "arg", "    ", options10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.setOptPrefix("\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 67;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        helpFormatter0.setArgName("   ");
        helpFormatter0.setLongOptPrefix("                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
            helpFormatter0.printOptions(printWriter18, (int) ' ', options20, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        java.lang.String str17 = helpFormatter0.createPadding((int) (short) 1);
        helpFormatter0.defaultLongOptPrefix = "   ";
        helpFormatter0.defaultNewLine = "arg";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                   ", options10, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.setOptPrefix("");
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        int int15 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "   ", options9, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 0;
        int int10 = helpFormatter0.findWrapPos("                                                    ", (int) (short) 100, (int) 'a');
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) (short) 100, 97, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.lang.String str17 = helpFormatter0.rtrim(" ");
        int int18 = helpFormatter0.getLeftPadding();
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, 10, 35, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str16 = helpFormatter0.createPadding((int) ' ');
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (int) (byte) 0, "", "", options21, (int) (short) 100, (int) (short) 1, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                " + "'", str16, "                                ");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str8 = helpFormatter0.createPadding(74);
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                          " + "'", str8, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("                                                                                                    ");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, 32, (int) (short) 100, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.lang.String str17 = helpFormatter0.createPadding((int) ' ');
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, (int) (short) 100, " ", "                                                    ", options22, 0, (int) (byte) 0, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                " + "'", str17, "                                ");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        int int10 = helpFormatter0.findWrapPos("arg", (int) (short) 100, (-1));
        helpFormatter0.setLongOptPrefix("usage:");
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.rtrim("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, 67, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        int int8 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setOptPrefix("usage:");
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) '#');
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.lang.String str13 = helpFormatter0.getArgName();
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "                                ", "--", options14, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        int int18 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("-", 1, 0);
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.setArgName("                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.defaultOptPrefix = "                                                    ";
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) ' ', options11, 73, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.findWrapPos("-", 32, (int) (short) 10);
        helpFormatter0.setLongOptPrefix("      ");
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str15 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "      " + "'", str13, "      ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.defaultOptPrefix = "          ";
        helpFormatter0.defaultLongOptPrefix = "                                                                                                  ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 100, "                                                                                                    ", "                                                                          ", options11, 67, (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(74);
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        int int13 = helpFormatter0.getLeftPadding();
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        int int19 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "", "    ", options23, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                          ");
        helpFormatter0.defaultWidth = (-1);
        helpFormatter0.setLeftPadding(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "   ";
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        int int16 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.lang.String str18 = helpFormatter0.rtrim("                                ");
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 73, "          ", "                                                                                                  ", options23, 32, (int) (byte) -1, "   ", true);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.setNewLine("                                                                                                 ");
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 " + "'", str11, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultWidth = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        int int12 = helpFormatter0.findWrapPos("          ", 35, (int) (short) 0);
        helpFormatter0.defaultArgName = "";
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("                                                    ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        int int12 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(84);
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.lang.String str13 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                  ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        int int6 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setNewLine("                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        helpFormatter0.defaultWidth = 100;
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        int int20 = helpFormatter0.getLeftPadding();
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setWidth(32);
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        java.lang.Class<?> wildcardClass16 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("-");
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 7, options12, 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.setOptPrefix("--");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, 0, (int) ' ', "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        helpFormatter0.setOptPrefix("   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultDescPad = ' ';
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "", options17, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "                                                    ";
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(32);
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                    " + "'", str18, "                                                    ");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
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
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultDescPad = ' ';
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("                                                                                                 ");
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        java.lang.Class<?> wildcardClass18 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        int int6 = helpFormatter0.defaultWidth;
        int int10 = helpFormatter0.findWrapPos("      ", (int) (short) 1, (int) '#');
        helpFormatter0.defaultDescPad = '4';
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "usage:", options15, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding((-1));
        int int8 = helpFormatter0.getWidth();
        int int9 = helpFormatter0.defaultLeftPad;
        int int10 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.setDescPadding((-1));
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "arg", "                                                                                                  ", options13, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding((int) (short) 1);
        java.lang.String str18 = helpFormatter0.getSyntaxPrefix();
        int int19 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "--", "-", options22, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        int int15 = helpFormatter0.defaultDescPad;
        int int19 = helpFormatter0.findWrapPos("                                                    ", 97, 98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) (byte) 10, "-", "                                   ", options20, (int) (short) 0, 98, "\n", false);
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
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultOptPrefix = "";
        int int10 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(0);
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = 84;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setDescPadding(32);
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, 10, options17, (int) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        int int21 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(0);
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.defaultLeftPad;
        int int15 = helpFormatter0.findWrapPos("                                             ", (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.setWidth(3);
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) (short) 100, options16, 100, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        int int17 = helpFormatter0.defaultDescPad;
        java.lang.String str19 = helpFormatter0.rtrim("                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 67, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 74, "                                                    ", "      ", options15, 98, (int) (short) 100, "                                                    ");
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
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setWidth(32);
        helpFormatter0.defaultSyntaxPrefix = "";
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, (int) '4', 84, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        int int19 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLeftPad = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        java.lang.String str22 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getDescPadding();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth((int) ' ');
        java.lang.String str10 = helpFormatter0.createPadding(98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                  " + "'", str10, "                                                                                                  ");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        helpFormatter0.defaultDescPad = 4;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage:" + "'", str20, "usage:");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        int int14 = helpFormatter0.getDescPadding();
        java.lang.String str16 = helpFormatter0.rtrim("\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setDescPadding(100);
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        helpFormatter0.setDescPadding(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.defaultWidth = 100;
        helpFormatter0.defaultNewLine = "    ";
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 0, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.setArgName("                                                                                                    ");
        int int13 = helpFormatter0.getLeftPadding();
        int int14 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        int int12 = helpFormatter0.defaultLeftPad;
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = 32;
        helpFormatter0.setOptPrefix("                                                                                                    ");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setArgName("");
        helpFormatter0.defaultArgName = "      ";
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.setArgName("-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int13 = helpFormatter0.findWrapPos("      ", 73, 84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "", "usage: ", options18, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        // The following exception was thrown during execution in test generation
        try {
            int int23 = helpFormatter0.findWrapPos("          ", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.lang.String str12 = helpFormatter0.rtrim("          ");
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "                                                                                                  ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 10;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix(" ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) ' ');
        helpFormatter0.setLeftPadding((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setOptPrefix(" ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setDescPadding(67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "\n";
        helpFormatter0.setLongOptPrefix("");
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 10);
        helpFormatter0.setNewLine(" ");
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "                                   ", options22, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          " + "'", str17, "          ");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.setWidth((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.setNewLine("-");
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) '4', "hi!", "                                             ", options18, 1, (int) (byte) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, 98, 100, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "arg";
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.setSyntaxPrefix("--");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) '#', options15, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setNewLine("hi!");
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        int int15 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "\n", "                                                                          ", options19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                " + "'", str11, "                                ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.setArgName("                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultOptPrefix = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth((int) (byte) 10);
        helpFormatter0.defaultNewLine = "    ";
        helpFormatter0.setDescPadding((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
            helpFormatter0.printHelp("                                                    ", "                                   ", options24, "                                ");
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
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "usage: ", options14, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "          ";
        helpFormatter0.defaultNewLine = "                                   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "\n";
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, 73, "                                                                                                  ", "          ", options12, (int) (short) -1, (int) (byte) 100, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.setLeftPadding(67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setSyntaxPrefix("          ");
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 35, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        java.lang.String str10 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 73, "    ", options14);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(0);
        helpFormatter0.setOptPrefix("          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 10);
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (short) 10, "                                             ", "          ", options13, (int) (short) 0, (-1), " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(32);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        int int7 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.rtrim("usage:");
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage:" + "'", str8, "usage:");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.setWidth(0);
        int int7 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.getDescPadding();
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("usage:");
        java.lang.String str14 = helpFormatter0.rtrim("    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (byte) 10;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                             ", "   ", options15, "                                   ", true);
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
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultDescPad = 52;
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) 'a', options16, 0, 1);
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
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = (short) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        java.lang.String str21 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                 " + "'", str17, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                 " + "'", str18, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(74);
        int int13 = helpFormatter0.findWrapPos("hi!", 7, (int) (short) -1);
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, (int) '#', "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("      ");
        java.lang.String str18 = helpFormatter0.rtrim("arg");
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("--");
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                ";
        java.lang.String str14 = helpFormatter0.rtrim("      ");
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.defaultWidth = 'a';
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) '4', 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setArgName("      ");
        helpFormatter0.setOptPrefix("arg");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, 97, (int) (short) 0, "\n");
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
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.defaultOptPrefix = "          ";
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.setDescPadding(0);
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str8 = helpFormatter0.createPadding(74);
        java.lang.String str9 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                          " + "'", str8, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setOptPrefix("                                ");
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("          ");
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.defaultDescPad = 4;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 10);
        helpFormatter0.defaultArgName = "                                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("                                                                                                  ", (int) (short) 0, 3);
        java.lang.String str15 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        java.lang.String str22 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "      " + "'", str21, "      ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 7, "    ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.createPadding(98);
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 74, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                  " + "'", str11, "                                                                                                  ");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        int int20 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.setDescPadding((int) (short) 10);
        int int15 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) '4', "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.defaultArgName = "      ";
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "      " + "'", str12, "      ");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        int int12 = helpFormatter0.defaultLeftPad;
        int int13 = helpFormatter0.getWidth();
        helpFormatter0.setLongOptPrefix("usage: ");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("    ", options17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        helpFormatter0.defaultOptPrefix = "-";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                " + "'", str11, "                                ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int8 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setOptPrefix("                                ");
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "    ", options11, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        java.lang.String str19 = helpFormatter0.rtrim("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, 6, 98, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) 'a', 100, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderOptions(stringBuffer4, 0, options6, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.defaultArgName = "-";
        java.lang.String str16 = helpFormatter0.rtrim("usage:");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str13 = helpFormatter0.createPadding(45);
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                             " + "'", str13, "                                             ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultArgName = "";
        java.lang.String str9 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = " ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        java.lang.String str18 = helpFormatter0.defaultArgName;
        java.lang.String str19 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        helpFormatter0.setLeftPadding((int) '4');
        int int23 = helpFormatter0.findWrapPos("                                             ", 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        int int25 = helpFormatter0.findWrapPos("                                                                                                    ", 84, 32);
        helpFormatter0.defaultSyntaxPrefix = " ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        int int13 = helpFormatter0.defaultLeftPad;
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("                                ");
        helpFormatter0.defaultWidth = 97;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "                                                                                                    ", options21, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultWidth = '4';
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        java.lang.Class<?> wildcardClass18 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        java.lang.String str30 = helpFormatter0.getArgName();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultWidth;
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultWidth = 'a';
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultDescPad = 3;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding((int) (byte) -1);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "                                                                          ", options15, "                                             ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setWidth(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setArgName("");
        helpFormatter0.defaultDescPad = 3;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (-1);
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLeftPadding((int) 'a');
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "                                             ", options15, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        int int25 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options27);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "   ";
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "   " + "'", str17, "   ");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setSyntaxPrefix("    ");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "    " + "'", str10, "    ");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        int int15 = helpFormatter0.findWrapPos("arg", (int) (byte) -1, 10);
        helpFormatter0.defaultOptPrefix = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        int int10 = helpFormatter0.findWrapPos("arg", (int) (short) 100, (-1));
        helpFormatter0.defaultNewLine = "   ";
        helpFormatter0.setNewLine("                                                                          ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setNewLine("usage: ");
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.defaultLeftPad = (byte) -1;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "                                ";
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        helpFormatter0.setNewLine("hi!");
        int int24 = helpFormatter0.findWrapPos("\n", 1, (int) (short) -1);
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str10 = helpFormatter0.getArgName();
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLeftPad = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "   ";
        helpFormatter0.setOptPrefix("--");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        helpFormatter0.setLongOptPrefix(" ");
        java.lang.String str18 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setArgName("--");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 84, 0, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        helpFormatter0.setDescPadding(3);
        java.io.PrintWriter printWriter23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter23, 97, options25, 4, 52);
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
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        java.lang.String str24 = helpFormatter0.defaultArgName;
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                    " + "'", str24, "                                                                                                    ");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        java.lang.Class<?> wildcardClass18 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                  ", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        helpFormatter0.setWidth((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, (int) (byte) -1, options12, 6, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        java.lang.String str25 = helpFormatter0.rtrim("                                   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setLeftPadding((int) '#');
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "                                   ", options15, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(98, "      ", "                                             ", options19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix(" ");
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        java.lang.String str16 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 4;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = helpFormatter0.findWrapPos("--", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        int int15 = helpFormatter0.findWrapPos("          ", (int) (byte) 0, (int) (byte) 100);
        java.lang.String str17 = helpFormatter0.rtrim("");
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, 0, options20, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 0;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        helpFormatter0.defaultLongOptPrefix = "usage:";
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter21, 6, "-", "                                                                                                    ", options25, 100, (int) (short) 10, "                                   ");
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
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        int int18 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.setNewLine("                                                                                                 ");
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int10 = helpFormatter0.defaultLeftPad;
        int int14 = helpFormatter0.findWrapPos("", 97, 52);
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) (short) 0);
        int int14 = helpFormatter0.getLeftPadding();
        java.lang.String str16 = helpFormatter0.rtrim("arg");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("          ");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (byte) 1;
        int int11 = helpFormatter0.findWrapPos("    ", (int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        int int14 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        int int17 = helpFormatter0.getWidth();
        java.lang.String str18 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        helpFormatter0.setDescPadding(35);
        int int22 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        helpFormatter0.setSyntaxPrefix("-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, (int) (byte) 0, options10, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        helpFormatter0.setArgName("");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        helpFormatter0.defaultDescPad = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        int int18 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setOptPrefix("                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultDescPad = 7;
        helpFormatter0.defaultDescPad = (byte) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLeftPad = (short) -1;
        helpFormatter0.defaultNewLine = "\n";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        int int15 = helpFormatter0.defaultDescPad;
        java.lang.String str17 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setArgName("");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.defaultLongOptPrefix = "      ";
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str15 = helpFormatter0.createPadding((int) (byte) 0);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 73, "          ", "\n", options20, (int) (byte) -1, (int) (short) 1, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        helpFormatter0.setOptPrefix("arg");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        int int12 = helpFormatter0.findWrapPos("          ", 35, (int) (short) 0);
        helpFormatter0.defaultDescPad = (short) -1;
        helpFormatter0.setLongOptPrefix("");
        int int17 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultArgName = "arg";
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getArgName();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "", options10, "                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
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
        helpFormatter0.setNewLine("\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        int int22 = helpFormatter0.defaultWidth;
        java.lang.String str23 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "      " + "'", str20, "      ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "      " + "'", str21, "      ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("          ");
        java.lang.String str9 = helpFormatter0.createPadding((int) (byte) 100);
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                    " + "'", str9, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        int int14 = helpFormatter0.findWrapPos("usage:", 32, 10);
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, (int) (byte) 0, (int) (short) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 9, "--");
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
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        helpFormatter0.defaultNewLine = "                                             ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                ";
        int int11 = helpFormatter0.defaultLeftPad;
        int int12 = helpFormatter0.defaultWidth;
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderOptions(stringBuffer5, (int) '4', options7, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.defaultLeftPad = 74;
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
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        helpFormatter0.defaultWidth = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                ");
        helpFormatter0.setDescPadding(10);
        helpFormatter0.setNewLine("");
        helpFormatter0.setOptPrefix("                                                    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 10;
        helpFormatter0.setWidth((-1));
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "                                ";
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setWidth(35);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "arg";
        int int13 = helpFormatter0.findWrapPos("    ", 32, 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 10);
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "", options11, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("arg");
        int int12 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        java.lang.String str29 = helpFormatter0.getArgName();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                                                                          " + "'", str29, "                                                                          ");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        int int19 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "                                                    ", "                                ", options23, "                                   ", false);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str18 = helpFormatter0.getArgName();
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                    " + "'", str15, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultDescPad = 7;
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultNewLine = "--";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        int int15 = helpFormatter0.defaultWidth;
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
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        helpFormatter0.defaultDescPad = 32;
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        java.lang.String str24 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                    " + "'", str23, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "          " + "'", str7, "          ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.createPadding((int) '4');
        int int9 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                    " + "'", str8, "                                                    ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(0);
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("      ");
        java.lang.String str14 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultLongOptPrefix = "                                             ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setNewLine("-");
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 73;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultArgName = "";
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str11 = helpFormatter0.rtrim("                                   ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultLeftPad = 97;
        java.lang.String str15 = helpFormatter0.createPadding(0);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (short) 100, "hi!", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        helpFormatter0.setOptPrefix(" ");
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(73, "                                                                                                 ", " ", options21, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "      ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "                                                                          ";
        java.lang.String str16 = helpFormatter0.getNewLine();
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("");
        helpFormatter0.setLongOptPrefix("                                ");
        int int12 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("\n");
        int int12 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) '#', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultWidth = 'a';
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "                                ";
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str15 = helpFormatter0.rtrim("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultNewLine = "    ";
        helpFormatter0.setNewLine("    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 9, "usage: ", "usage: ", options23, 97, 9, "", false);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("                                                                                                    ");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "    ", options9, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = 52;
        helpFormatter0.defaultNewLine = "    ";
        helpFormatter0.setNewLine("                                                                          ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        java.lang.String str9 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = 74;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.setLeftPadding(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        helpFormatter0.setSyntaxPrefix("usage: ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        helpFormatter0.setNewLine("                                             ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        java.lang.String str22 = helpFormatter0.defaultNewLine;
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 6;
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        int int7 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 84, "usage: ", "", options16, 1, (int) (byte) -1, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.getDescPadding();
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setLeftPadding(98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                    " + "'", str19, "                                                    ");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

