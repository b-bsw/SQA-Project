package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.getWidth();
        int int12 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "usage: ", "", options16, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 52, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        int int9 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 3, "   ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setSyntaxPrefix("usage: ");
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLeftPad = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = (short) 10;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 74, "   ", "hi!", options16, (int) '#', 74, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 0, 0, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.setWidth(0);
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "                                                                                                 ", options11, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
            helpFormatter0.printWrapped(printWriter25, 6, "arg");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        int int12 = helpFormatter0.findWrapPos("", 35, (int) (byte) -1);
        helpFormatter0.setNewLine("          ");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          " + "'", str17, "          ");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = 74;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (-1), "\n", "   ", options11, 52, 1, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.setWidth(3);
        int int12 = helpFormatter0.getDescPadding();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, 7, options15, (int) '4', 6);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (short) 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.findWrapPos("                                                    ", (int) (short) 1, 6);
        helpFormatter0.defaultLeftPad = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        int int8 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 100, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setArgName("");
        java.lang.String str11 = helpFormatter0.createPadding((int) '#');
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "\n", options14, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                   " + "'", str11, "                                   ");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", " ", options10, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(3);
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, 52, options10, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "                                ", "                                                                                                 ", options24, "                                ");
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
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                ", options15, "   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(32);
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass6 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "                                ";
        helpFormatter0.setDescPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("arg");
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 97, (int) (byte) 0, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        java.lang.String str21 = helpFormatter0.rtrim("                                ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        int int22 = helpFormatter0.findWrapPos("                                                                          ", (int) (short) 100, (int) '#');
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter23, 52, "                                                                                                 ");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("          ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.defaultDescPad = (short) -1;
        helpFormatter0.defaultLeftPad = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "      ", options13, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int16 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, 0);
        helpFormatter0.defaultNewLine = "usage: ";
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter19, (int) 'a', options21, 3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        java.lang.String str23 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter24, (int) (short) 0, "hi!", "                                                                          ", options28, (int) (byte) 1, (int) ' ', "--", true);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        helpFormatter0.setWidth(74);
        int int24 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, (int) '4', options17, (int) 'a', (int) (byte) 10);
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "      ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.setArgName("                                                                                                    ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "                                                                                                 ", "-", options10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        helpFormatter0.setArgName("\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = helpFormatter0.createPadding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = (byte) 1;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "   ", "arg", options11, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setLongOptPrefix("");
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                                                                                    ", "                                                    ", options15, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "          ", "                                                                                                 ", options12, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.String str22 = helpFormatter0.createPadding((int) '4');
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str25 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                    " + "'", str22, "                                                    ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, 35, "                                ");
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (-1), "-", "                                                    ", options13, (int) (short) -1, (int) 'a', "      ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options13);
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(74);
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                                                                                    ", options15, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (int) (short) 10, "                                                                                                    ", "hi!", options10, 7, 6, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 3;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "hi!", "usage: ", options12, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "                                ";
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) (byte) 0, "arg", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("-");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) -1, (int) '4', "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, (int) (byte) 0, options12, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 74, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.setOptPrefix("                                                    ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (byte) 1, 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 32, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.defaultLeftPad = (byte) -1;
        helpFormatter0.defaultLongOptPrefix = "   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", "                                ", options13, "", true);
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, (int) (byte) -1, options17, 74, 7);
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 0;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 7, "usage: ", "          ", options11, (-1), (int) (short) -1, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setArgName("--");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 32, "usage:", "          ", options16, (int) '4', (int) (short) 10, "usage: ", true);
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "                                ", options19, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "usage:", "usage:", options13, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, 74, options11, 0, (int) (short) 100);
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, (int) (byte) 0, options13, 100, (int) (byte) 100);
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        java.lang.String str13 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 74, "usage:", "hi!", options18, (int) '#', (-1), "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderWrappedText(stringBuffer21, (int) (short) 0, (int) (short) 0, "                                                    ");
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
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str5 = helpFormatter0.rtrim("          ");
        helpFormatter0.setLeftPadding(3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        helpFormatter0.setSyntaxPrefix("          ");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderWrappedText(stringBuffer16, (int) (short) 0, (int) (short) -1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "      ", "\n", options17, "                                                    ", false);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        java.lang.String str13 = helpFormatter0.rtrim(" ");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "-", "   ", options17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, (int) '4', options12, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.String str20 = helpFormatter0.rtrim("-");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        helpFormatter0.setArgName("                                                                                                 ");
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "          ", "--", options23, "arg");
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "                                                    ", "", options12, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        java.lang.String str19 = helpFormatter0.rtrim("usage:");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage:" + "'", str19, "usage:");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 35, "", "usage: ", options23, 52, 0, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        helpFormatter0.defaultNewLine = "usage:";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter5, (int) (byte) 0, options7, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, 0, "--", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultWidth = '4';
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("usage:");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        int int18 = helpFormatter0.findWrapPos("                                                                          ", 97, 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        int int13 = helpFormatter0.getLeftPadding();
        int int14 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "   ", options17, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setDescPadding(3);
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(7, "      ", "usage: ", options16, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "usage: ", options20, "                                                                          ", true);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.findWrapPos("-", 32, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("          ");
        helpFormatter0.setOptPrefix("hi!");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (byte) 0, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        java.lang.String str7 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage:" + "'", str7, "usage:");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 97, "usage: ", "-", options13, 3, 7, "-");
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "", options10, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.String str14 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.setArgName("\n");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, 1, options13, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                " + "'", str10, "                                ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        helpFormatter0.setWidth(0);
        int int20 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getDescPadding();
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        helpFormatter0.setOptPrefix("      ");
        helpFormatter0.setArgName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding((-1));
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine("                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getWidth();
        int int8 = helpFormatter0.getDescPadding();
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "                                                                                                 ", "--", options12, "arg", true);
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("      ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderWrappedText(stringBuffer8, 7, 6, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, (int) (short) -1, options12, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "hi!", options15, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setDescPadding((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.setSyntaxPrefix("usage:");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "usage:", "--", options28, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        int int17 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.lang.String str17 = helpFormatter0.createPadding(3);
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, "          ", "                                                                                                    ", options21, "                                                                                                    ", false);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "   " + "'", str17, "   ");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        helpFormatter0.setArgName("                                   ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage:" + "'", str20, "usage:");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setNewLine("-");
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "\n", options17, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
            helpFormatter0.printWrapped(printWriter25, 10, " ");
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setNewLine("-");
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 1, " ", " ", options13, 3, 6, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        java.lang.String str7 = helpFormatter0.rtrim("usage: ");
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage:" + "'", str7, "usage:");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setDescPadding((int) (byte) 1);
        int int13 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("--");
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) (byte) 100, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.setSyntaxPrefix("-");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        helpFormatter0.setLeftPadding((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultArgName = "";
        helpFormatter0.setOptPrefix("--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        int int8 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, 6);
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.setArgName("   ");
        int int17 = helpFormatter0.findWrapPos("                                                                          ", 3, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 10;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 3, options11, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, " ", "arg", options10, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        helpFormatter0.setOptPrefix("usage:");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        int int9 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 32, "\n", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                          ");
        helpFormatter0.defaultWidth = (-1);
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 74, "usage:", "   ", options14, (int) (byte) 100, 6, "arg");
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = '4';
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 1, options12, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
            helpFormatter0.printHelp(printWriter18, 0, "      ", "", options22, 0, (int) (byte) 0, "", true);
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (int) ' ', (int) (byte) -1, "      ");
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (int) '#', options13, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        helpFormatter0.defaultArgName = "hi!";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 0, "      ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "                                                                          ", "                                                                          ", options9, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setWidth(32);
        helpFormatter0.defaultSyntaxPrefix = "";
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.setDescPadding(0);
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.getWidth();
        int int12 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) '4', "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        int int7 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "                                ", options10, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        int int23 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter24, 3, "arg");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = helpFormatter0.findWrapPos("                                                                          ", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", "      ", options16, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (int) (byte) 1, " ", "arg", options21, (int) (short) 100, 10, "", true);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "\n", options11, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setOptPrefix("          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.setLongOptPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setWidth((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 10;
        helpFormatter0.setOptPrefix("--");
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage:", options9, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        int int13 = helpFormatter0.getLeftPadding();
        int int14 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, (int) (byte) 1, 35, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setOptPrefix("      ");
        int int14 = helpFormatter0.findWrapPos("--", (int) (short) 100, (int) (short) -1);
        java.lang.String str15 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(0);
        java.lang.Class<?> wildcardClass6 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setArgName("--");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 100, options14, 10, 0);
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
            helpFormatter0.printHelp(" ", "                                                                                                    ", options18, "hi!");
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
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setSyntaxPrefix(" ");
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("arg");
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 97, "", "                                                                                                 ", options21, 0, 100, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str11 = helpFormatter0.rtrim("                                                    ");
        java.lang.String str13 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (short) 1, "usage: ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.defaultOptPrefix = "                                   ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, 6, "", options23);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "\n", options15, "                                   ", false);
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderWrappedText(stringBuffer5, (int) (byte) 0, (int) (byte) 0, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.rtrim("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        int int10 = helpFormatter0.defaultLeftPad;
        int int14 = helpFormatter0.findWrapPos("                                ", (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "", options9, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setOptPrefix("                                                                                                    ");
        helpFormatter0.defaultLongOptPrefix = "arg";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, 35, options10, 7, (int) (byte) 100);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, 10, (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                ");
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "          ", options11, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        int int20 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "                                                    ", "                                                                                                 ", options9, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, (int) (short) 100, 3, " ");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "arg";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 3, (int) '4', " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        helpFormatter0.defaultLeftPad = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "--";
        helpFormatter0.defaultLongOptPrefix = "usage:";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "arg", "arg", options12, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("usage:");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) '4', 0, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                " + "'", str8, "                                ");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 6;
        helpFormatter0.defaultNewLine = "--";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) 'a', "hi!", "usage:", options13, 0, (int) (short) 0, "      ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setNewLine("          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                 " + "'", str15, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        int int15 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter7, (int) (byte) 1, options9, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "          ", "      ", options18, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter22, (int) (short) -1, 35, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "   ", options23, "-", false);
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
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = helpFormatter0.findWrapPos("   ", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "-";
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 10, "usage:", "                                   ", options18, 74, 4, "--");
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 0, options20, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str5 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setOptPrefix(" ");
        int int8 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "      ", "", options8, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 10, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding(1);
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                    ", "                                                                                                    ", options13, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(0);
        java.lang.String str10 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "", "                                                                                                 ", options9, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int6 = helpFormatter0.findWrapPos("                                                                          ", (int) (byte) 100, 0);
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        helpFormatter0.setLongOptPrefix("arg");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        int int15 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "--", options16, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = (byte) 100;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, (int) ' ', "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        int int12 = helpFormatter0.findWrapPos("usage: ", (int) (short) 0, 3);
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("                                   ");
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) (short) 10, "      ", "   ", options19, 7, (int) '#', "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                                                 ");
        int int11 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter21, (int) '4', "      ", "--", options25, 32, (int) '#', "   ", true);
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
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("-");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "\n", options11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        helpFormatter0.defaultNewLine = " ";
        int int18 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, (int) '#', (int) (short) 0, "                                                    ");
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultNewLine = "          ";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options15, true);
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.createPadding(74);
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) 'a', "-", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                          " + "'", str9, "                                                                          ");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setLongOptPrefix("--");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "\n", options9, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) (short) 1, 3, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 0);
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) (byte) 0, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", "usage:", options10, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                                                 ", options13, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                ";
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int6 = helpFormatter0.getWidth();
        int int7 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderOptions(stringBuffer8, 3, options10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setOptPrefix("-");
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("\n");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options14, true);
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 6, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) -1;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 7, "                                ");
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultLeftPad = 6;
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.setArgName("   ");
        int int17 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 1, (int) (byte) 0, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                                                                                 ", "                                   ", options18, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "-", options9, "");
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 74, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter25, 7, " ", "usage: ", options29, (int) (short) 1, 52, "\n");
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, 1, options12, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "usage:";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "                                ", "                                ", options11, "\n");
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.setWidth(3);
        int int12 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options14);
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        helpFormatter0.defaultLongOptPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.setDescPadding((-1));
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.createPadding(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "          " + "'", str11, "          ");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        java.lang.String str7 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.defaultWidth = (short) 0;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage:" + "'", str7, "usage:");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 100);
        int int10 = helpFormatter0.findWrapPos("arg", (int) (short) 100, (-1));
        helpFormatter0.defaultNewLine = "   ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                                          ", options15, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        int int22 = helpFormatter0.findWrapPos("                                                                          ", (int) (short) 100, (int) '#');
        java.io.PrintWriter printWriter23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter23, 0, options25, 7, 6);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter20, (int) 'a', 97, "");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str8 = helpFormatter0.createPadding((int) (byte) 100);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 7, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options20);
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        helpFormatter0.setArgName("\n");
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 1, (int) (byte) 100, "                                ");
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("--");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setWidth((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 52, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int10 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, 4, options13, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderOptions(stringBuffer4, 0, options6, 4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter21, (int) (short) 1, "                                                                                                    ");
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
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.setDescPadding((int) (short) 10);
        helpFormatter0.setWidth((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (int) ' ', options13, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setLongOptPrefix("      ");
        helpFormatter0.defaultOptPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setWidth(32);
        helpFormatter0.setArgName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 10);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(74);
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultLeftPad = 97;
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 97, 35, "usage: ");
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix(" ");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 0, "                                ", "-", options16, (int) (byte) 0, (int) (byte) 0, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        java.lang.String str16 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        int int9 = helpFormatter0.findWrapPos("                                                    ", (int) (byte) 0, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        java.lang.String str12 = helpFormatter0.getArgName();
        int int16 = helpFormatter0.findWrapPos("   ", (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("          ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        int int9 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "arg", options12, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultDescPad = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        java.lang.String str17 = helpFormatter0.createPadding(3);
        java.lang.String str19 = helpFormatter0.rtrim("                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "   " + "'", str17, "   ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, 35, 4, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (int) (short) 100, "                                ", "arg", options10, 6, 0, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        java.lang.String str21 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "          ", options8, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        java.lang.String str20 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = " ";
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, 7, options19, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.setDescPadding((-1));
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultWidth = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, 7, "--", options22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setSyntaxPrefix("      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                          ");
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(10);
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, (int) (short) 100, "                                ", "", options18, (int) 'a', (int) (short) 0, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (byte) 100, "                                                                                                 ");
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
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        helpFormatter0.defaultArgName = "   ";
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          " + "'", str17, "          ");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("\n");
        helpFormatter0.setArgName("--");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) '4', 52, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str8 = helpFormatter0.createPadding(74);
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (byte) 1, "   ", "                                                                                                 ", options13, 52, 0, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                          " + "'", str8, "                                                                          ");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("arg");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) ' ', "   ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                    ", "                                   ", options13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options16, true);
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 74, " ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getArgName();
        int int6 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int22 = helpFormatter0.findWrapPos("                                                                          ", (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass23 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, 6, (int) (byte) 0, "                                   ");
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setArgName("          ");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "-";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderWrappedText(stringBuffer18, 3, (int) (byte) 100, "                                                                                                    ");
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
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setNewLine("      ");
        helpFormatter0.defaultLongOptPrefix = "-";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setArgName("");
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        int int18 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, (int) '#', 4, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 35, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        helpFormatter0.setWidth(0);
        java.lang.String str20 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options22, false);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setLeftPadding((-1));
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str12 = helpFormatter0.createPadding(100);
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultLeftPad = 35;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 4, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "usage:";
        java.lang.String str5 = helpFormatter0.rtrim("                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultSyntaxPrefix = "--";
        int int13 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 7, "                                   ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage:" + "'", str22, "usage:");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setWidth((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setOptPrefix("usage:");
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (byte) 0, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "                                                                                                 ", options9, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 7, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultWidth = (byte) 1;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        int int8 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.setLongOptPrefix("");
        int int11 = helpFormatter0.getWidth();
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultNewLine = "\n";
        helpFormatter0.defaultNewLine = "usage: ";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (-1), "                                                                          ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 74, "                                                    ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.setLongOptPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        int int12 = helpFormatter0.findWrapPos("", 35, (int) (byte) -1);
        helpFormatter0.setNewLine("          ");
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, (int) (byte) 10, options19, (int) '#', 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setSyntaxPrefix("usage: ");
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter18, (int) (byte) 1, options20, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 4, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (byte) 100, (int) (short) -1, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.defaultLongOptPrefix = "      ";
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) 'a', (int) 'a', "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        int int10 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLeftPadding(35);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) ' ', "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "                                                    ", "                                ", options19, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str13 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (short) -1;
        java.lang.String str17 = helpFormatter0.createPadding((int) (short) 0);
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "                                                                                                    ", " ", options21, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = " ";
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        helpFormatter0.defaultWidth = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "      ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "", options15, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, 100, (int) (short) 100, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.setArgName("\n");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "\n", options14, "--", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("                                                                          ");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (-1), options14, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("                                ");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) 'a', "      ", "usage:", options12, 3, 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "hi!", "                                ", options18, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                                                 ", options13, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "                                                    ";
        helpFormatter0.defaultWidth = 0;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) '#', " ", options19);
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
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        int int17 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultDescPad = 0;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (-1), "-", "hi!", options17, 74, 10, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        int int9 = helpFormatter0.findWrapPos("\n", 10, 3);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setNewLine("      ");
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "\n", "usage:", options18, "      ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setDescPadding(3);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultArgName = "                                                                                                 ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "", "   ", options10, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("          ");
        helpFormatter0.setWidth(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("          ");
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.rtrim("                                   ");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, 1, (int) ' ', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setWidth(6);
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage: ", options10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "\n";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        int int7 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, (int) (byte) 10, options10, (int) ' ', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("                                   ");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 6, (int) '4', "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(74);
        helpFormatter0.setLongOptPrefix("                                ");
        helpFormatter0.defaultArgName = "                                   ";
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((int) ' ');
        helpFormatter0.setWidth((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        helpFormatter0.defaultNewLine = "                                                    ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        int int5 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "                                                    ", options8, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("-", 1, 0);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "      ", "usage: ", options15, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str11 = helpFormatter0.rtrim("                                                    ");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (byte) 100, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.lang.String str16 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        int int4 = helpFormatter0.defaultLeftPad;
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str7 = helpFormatter0.rtrim("                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                                                                                 ", options10, "--");
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        int int9 = helpFormatter0.getDescPadding();
        int int10 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        helpFormatter0.setWidth(10);
        java.lang.String str10 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str14 = helpFormatter0.createPadding(1);
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        helpFormatter0.defaultSyntaxPrefix = "      ";
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (byte) 10);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(74);
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 7, "arg", "                                   ", options16, 3, (int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.setWidth((-1));
        helpFormatter0.defaultDescPad = (byte) -1;
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderOptions(stringBuffer16, (int) ' ', options18, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                          ");
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (short) 100, "usage:");
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        int int24 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = helpFormatter0.renderWrappedText(stringBuffer26, (int) (byte) -1, (int) (short) 10, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, (int) (byte) 1, "", "   ", options9, 6, 97, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 35, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 " + "'", str10, "                                                                                                 ");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderWrappedText(stringBuffer21, (int) (byte) -1, (int) (byte) 0, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine(" ");
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setNewLine("-");
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 7, "          ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setArgName("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "      ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.findWrapPos("", 52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 4, " ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.createPadding(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "      " + "'", str10, "      ");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setArgName("");
        java.lang.String str11 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                   " + "'", str11, "                                   ");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultDescPad = 7;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.findWrapPos("          ", (int) (short) 1, (int) ' ');
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultWidth = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        helpFormatter0.setWidth(100);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) 'a', (int) (byte) 1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 4, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.String str21 = helpFormatter0.defaultSyntaxPrefix;
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.setWidth((int) (byte) 1);
        int int16 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "-";
        int int7 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.setSyntaxPrefix("          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        helpFormatter0.setOptPrefix(" ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        java.lang.String str20 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.setSyntaxPrefix("arg");
        int int17 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = 0;
        int int7 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 0, " ", "          ", options23, 97, 3, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options11);
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultNewLine = "                                   ";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 1, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "          " + "'", str7, "          ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 0, (int) (short) 1, "                                                                          ");
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.lang.String str15 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setArgName("                                ");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.createPadding(0);
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        int int14 = helpFormatter0.getWidth();
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = (short) -1;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "   ", "usage: ", options13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(4, "                                                                          ", "", options19, "                                   ");
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                ", "                                                                                                 ", options22, "          ", false);
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
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, (int) (byte) 0, (int) 'a', " ");
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
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("          ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) (short) 0, options11, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, (int) (short) 0, options20, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str5 = helpFormatter0.rtrim("                                                                          ");
        int int6 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.defaultWidth = (byte) 100;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "", options13, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setLongOptPrefix("      ");
        int int13 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("                                                    ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        int int10 = helpFormatter0.defaultLeftPad;
        int int11 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "arg", "                                ", options11, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        int int11 = helpFormatter0.getWidth();
        int int12 = helpFormatter0.getWidth();
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        helpFormatter0.setDescPadding((int) 'a');
        int int18 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options17, true);
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.defaultNewLine = "                                                    ";
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter5, (int) (short) 100, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(1);
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (short) 10, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        java.lang.String str22 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "\n";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "--", "usage:", options30, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 76");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        helpFormatter0.defaultNewLine = "\n";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        int int22 = helpFormatter0.defaultWidth;
        int int23 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.defaultLongOptPrefix = "usage:";
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) (short) -1, (int) 'a', "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getArgName();
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderOptions(stringBuffer7, 4, options9, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.String str7 = helpFormatter0.createPadding(0);
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (short) 10, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }
}

